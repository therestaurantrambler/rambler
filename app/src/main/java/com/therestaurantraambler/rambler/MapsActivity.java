package com.therestaurantraambler.rambler;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
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

        // Add a marker for Big Grove Tavern and move the camera

        LatLng bigGrove = new LatLng(40.118170, -88.243226);
        mMap.addMarker(new MarkerOptions().position(bigGrove).title("Big Grove Tavern: " +
                "Half price wine"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bigGrove, 14f));

        // Add a marker for Blind Pig Brewery and move the camera
        LatLng blindPigBrewery = new LatLng(40.117177, -88.243342);
        mMap.addMarker(new MarkerOptions().position(blindPigBrewery).title("Blind Pig Brewery: "
                + "Half price drafts"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(blindPigBrewery, 14f));

        // Add a marker for Punch and move the camera
        LatLng punch = new LatLng(40.117922, -88.243726);
        mMap.addMarker(new MarkerOptions().position(punch).title("Punch!: "
                + "Half price cocktails"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(punch, 14f));

        // Add a marker for Hamilton Walker's and move the camera
        LatLng hamiltonWalkers = new LatLng(40.117490,-88.243870);
        mMap.addMarker(new MarkerOptions().position(hamiltonWalkers).title("Hamilton Walker's: "
                + "Half price apps"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(hamiltonWalkers, 14f));


        //UI Settings

        UiSettings mapUiSettings = mMap.getUiSettings();
        mapUiSettings.setCompassEnabled(true);
        mapUiSettings.setZoomControlsEnabled(true);
        mapUiSettings.setMapToolbarEnabled(false);
        mapUiSettings.setMyLocationButtonEnabled(true);


    }
}
