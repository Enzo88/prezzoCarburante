package eu.vinmasterpiece.carburantimise.service;


import android.util.Log;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;

import eu.vinmasterpiece.carburantimise.beans.Carburante;
import eu.vinmasterpiece.carburantimise.beans.CarburantiResponse;
import eu.vinmasterpiece.carburantimise.beans.Position;
import eu.vinmasterpiece.carburantimise.enumerations.Fuels;
import eu.vinmasterpiece.carburantimise.enumerations.Order;
import eu.vinmasterpiece.carburantimise.enumerations.Regions;

/**
 * Created by vincenzo on 24/01/16.
 */
public class CarburantiService {

    private URL baseUrl = null;
    private RestTemplate restTemplate;

    public CarburantiService() {
        try {
            this.baseUrl = new URL("https://carburanti.mise.gov.it/OssPrezziSearch/ricerca/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }

    public HashMap<String, String> getProvince(Regions region) {
        HashMap<String, String> response = null;
        try {
            URI urlRequest;
            urlRequest = UriComponentsBuilder.fromUriString(baseUrl.toString())
                    .path("province")
                    .queryParam("regioneId", String.valueOf(region.getValue())).build().toUri();
            response = restTemplate.postForObject(urlRequest.toString(), null, HashMap.class);
        } catch (RestClientException e) {
            Log.e("CarburantiService", "error on getProvince", e);
        }
        return response;
    }

    public HashMap<String, String> getComuni(String provinciaId) {
        HashMap<String, String> response = null;
        try {
            URI urlRequest = UriComponentsBuilder.fromUriString(baseUrl.toString())
                    .path("comuni")
                    .queryParam("provinciaId", provinciaId).build().toUri();
            response = restTemplate.postForObject(urlRequest.toString(), null, HashMap.class);
        } catch (RestClientException e) {
            Log.e("CarburantiService", "error on getComuni", e);
        }
        return response;
    }

    public CarburantiResponse getDistributoriLocalita(Regions region, String provincia, String citta, Fuels carb, Order order) {
        CarburantiResponse response = null;
        try {
            URI urlRequest = buildDistributoriLocalitaParams(region, provincia, citta, carb, order);
            response = restTemplate.postForObject(baseUrl.toString(), null, CarburantiResponse.class);
        } catch (RestClientException e) {
            Log.e("CarburantiService", "error on getDistributoriLocalita", e);
        }
        return response;
    }

    public CarburantiResponse getDistributoriPosition(Position position) {
        CarburantiResponse response = null;
        if(position == null) return response;
        try {
            URI urlRequest = buildDistributoriPositionParams(position);
            response = restTemplate.postForObject(urlRequest.toString(), null, CarburantiResponse.class);
        } catch (RestClientException e) {
            Log.e("CarburantiService", "error on getDistributoriPosition", e);
        }
        return response;
    }

    private URI buildDistributoriLocalitaParams(Regions region, String provincia, String citta, Fuels carb, Order order) {
        UriComponentsBuilder componentsBuilder = UriComponentsBuilder.fromUriString(baseUrl.toString()).path("localita");
        if (region != null)
            componentsBuilder.queryParam("region", String.valueOf(region.getValue()));
        if (provincia != null)
            componentsBuilder.queryParam("province", provincia);
        if (citta != null)
            componentsBuilder.queryParam("town", citta);
        if (carb != null)
            componentsBuilder.queryParam("carb", String.valueOf(carb.getValue()));
        if (order != null)
            componentsBuilder.queryParam("ordPrice", String.valueOf(order.getValue()));
        return componentsBuilder.build().toUri();
    }

    private URI buildDistributoriPositionParams(Position position) {
        UriComponentsBuilder componentsBuilder = UriComponentsBuilder.fromUriString(baseUrl.toString()).path("position");
        String positionString = new String(String.valueOf(position.getFirst())).concat("-").concat(String.valueOf(position.getSecond()));
        componentsBuilder.queryParam("pointsListStr", positionString);
        return componentsBuilder.build().toUri();
    }
}
