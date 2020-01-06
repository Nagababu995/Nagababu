package com.example.nagamap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
       
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

    
        LatLng yamyahcompany = new LatLng(16.525118, 80.778669);
        mMap.addMarker(new MarkerOptions().position(yamyahcompany).title("Yamyah comany location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yamyahcompany,10F));
    }

    }

