package eu.vinmasterpiece.carburantimise;

/*import android.content.Context;
import android.net.SSLCertificateSocketFactory;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


import javax.net.ssl.SSLContext;

import static org.junit.Assert.*;
*/
/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

public class ExampleUnitTest {

    //@Test
    public void addition_isCorrect() throws Exception {
       /* SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        sslContext.init(null, null, null);

        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);

        CloseableHttpClient httpClient =
                HttpClients.custom()
                        .setSSLSocketFactory(socketFactory)
                        .build();
        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory(httpClient);


        // The connection URL
        String url = "https://ajax.googleapis.com/ajax/services/search/web?v=1.0&q={query}";

        // Create a new RestTemplate instance
        RestTemplate restTemplate = new RestTemplate(requestFactory);

        // Add the String message converter
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        // Make the HTTP GET request, marshaling the response to a String
        String result = restTemplate.getForObject(url, String.class, "Android");*/
    }
}
