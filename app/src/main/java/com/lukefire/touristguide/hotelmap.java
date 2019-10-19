package com.lukefire.touristguide;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class hotelmap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    double latcur=12.9710,longcur=79.1639;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelmap);
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
        // GoogleMap mMap2 = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(latcur, longcur);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in SJT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 12.0f ) );


       /* Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(latcur, longcur))
                .anchor(0.5f, 0.5f)
                .title("Title1")
                .snippet("Snippet1")
                );*/


        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(12.9555,79.1370))
                .anchor(0.5f, 0.5f)
                .title("Title2")
                .snippet("Snippet2")
                );
        //////////////////////////////////////////////

        /* if (mGoogleApiClient == null) {
    mGoogleApiClient = new GoogleApiClient.Builder(this)
        .addConnectionCallbacks(this)
        .addOnConnectionFailedListener(this)
        .addApi(LocationServices.API)
        .build();
}
if (mGoogleApiClient != null) {
    mGoogleApiClient.connect();
}
public class MainActivity extends ActionBarActivity implements
        ConnectionCallbacks, OnConnectionFailedListener {
    ...
    @Override
    public void onConnected(Bundle connectionHint) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            mLatitudeText.setText(String.valueOf(mLastLocation.getLatitude()));
            mLongitudeText.setText(String.valueOf(mLastLocation.getLongitude()));
        }
    }
}*/
        ////////////////////////////////////////////


    }
}
