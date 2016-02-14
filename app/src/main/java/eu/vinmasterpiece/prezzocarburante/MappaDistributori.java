package eu.vinmasterpiece.prezzocarburante;

import android.location.Location;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import eu.vinmasterpiece.carburantimise.beans.CarburantiResponse;
import eu.vinmasterpiece.carburantimise.beans.Distributore;
import eu.vinmasterpiece.carburantimise.beans.Position;
import eu.vinmasterpiece.carburantimise.service.CarburantiService;

public class MappaDistributori implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Location currLocation;
    private List<Distributore> distributori;

    public MappaDistributori(MapFragment mapFragment, Location currentLocation, List<Distributore> distributori) {
        this.currLocation = currentLocation;
        this.distributori = distributori;
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng myPosition = new LatLng(currLocation.getLatitude(), currLocation.getLongitude());
        mMap.addMarker(new MarkerOptions().position(myPosition).title("MyPosition"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPosition, 15));
        addMarkers(distributori);
    }

    private void addMarkers(List<Distributore> result) {
        for (Distributore dist:result) {
            mMap.addMarker(new MarkerOptions().position(new LatLng(dist.getLat(), dist.getLon())).title(dist.getName()));
        }
    }
}
