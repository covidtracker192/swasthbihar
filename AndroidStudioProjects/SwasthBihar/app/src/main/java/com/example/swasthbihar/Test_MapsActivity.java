package com.example.swasthbihar;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Test_MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng latLng;
    private FusedLocationProviderClient fusedLocationClient;
    private SupportMapFragment mapFragment;
    LocationRequest mLocationRequest;
    Location mLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(30000);
        mLocationRequest.setFastestInterval(30000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        fusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
        mMap.setMyLocationEnabled(true);

        // Test Center 1
        final LatLng center1 = new LatLng(25.091148, 85.544502);
        mMap.addMarker(new MarkerOptions().position(center1).title("Vardhman Institute Of Medical Sciences, Pavapuri").snippet("website:https://vimspawapuri.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center1));

        //Test Center 2
        final LatLng center2 = new LatLng(25.133088, 85.841615);
        mMap.addMarker(new MarkerOptions().position(center2).title("Sadar Hospital Sheikhpura - Dallu Chowk, Sheikhpura").snippet("website: https://sheikhpura.nic.in/public-utility/district-hospital-sheikhpura/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center2));

        //Test Center 3
        final LatLng center3 = new LatLng(25.606743, 85.133818);
        mMap.addMarker(new MarkerOptions().position(center3).title("Sen Diagnostics, Patna"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center3));

        //Test Center 4
        final LatLng center4 = new LatLng(24.887306, 85.545765);
        mMap.addMarker(new MarkerOptions().position(center4).title("District Hospital, Nawada").snippet("https://nawada.nic.in/public-utility-category/hospital/page/2/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center4));

        //Test Center 5
        final LatLng center5 = new LatLng(25.599768, 85.197826);
        mMap.addMarker(new MarkerOptions().position(center5).title("RMRIMS Agamkuan, Patna").snippet("website: https://www.rmrims.org.in/address.html"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center5));

        //Test Center 6
        final LatLng center6 = new LatLng(25.596299, 85.158594);
        mMap.addMarker(new MarkerOptions().position(center6).title("Saral Pathlab Diagnostic Centre ").snippet("website: https://saralpathlab.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(6));

        //Test Center 7
        final LatLng center7 = new LatLng(25.145614, 86.092331);
        mMap.addMarker(new MarkerOptions().position(center7).title("Sadar Hospital").snippet("website: https://lakhisarai.nic.in/public-utility/sadar-hospital-lakhisarai/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center7));

        //Test Center 8
        final LatLng center8 = new LatLng(25.621043, 85.160268);
        mMap.addMarker(new MarkerOptions().position(center8).title("Patna Medical College").snippet("website: https://patnamedicalcollege.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center8));

        //Test Center 9
        final LatLng center9 = new LatLng(25.610673, 85.089168);
        mMap.addMarker(new MarkerOptions().position(center9).title("Indira Gandhi Institute of Medical Sciences").snippet("website: http://www.igims.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center9));

        //Test Center 10
        final LatLng center10 = new LatLng(25.563123, 85.041709);
        mMap.addMarker(new MarkerOptions().position(center10).title("AIIMS, Patna").snippet("https://www.aiimspatna.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));
      //  mMap.animateCamera(CameraUpdateFactory.zoomTo(6));
        //Test Center 11
        final LatLng center11 = new LatLng(24.771031, 84.961635);
        mMap.addMarker(new MarkerOptions().position(center10).title("Anugrah Narayan Magadh Medical College, Gaya").snippet("http://anmmc.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));
        //Test Center 12
        final LatLng center12 = new LatLng(25.558534, 84.671086);
        mMap.addMarker(new MarkerOptions().position(center10).title("Sadar Hospital Ara- Mahajan Toli, Arrah, Bihar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));


        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getPosition().equals(center1)) {
                    Uri uriUrl = Uri.parse("website:https://vimspawapuri.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center2)) {
                    Uri uriUrl = Uri.parse("https://sheikhpura.nic.in/public-utility/district-hospital-sheikhpura/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }

                else if(marker.getPosition().equals(center4)) {
                    Uri uriUrl = Uri.parse("https://nawada.nic.in/public-utility-category/hospital/page/2/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center5)) {
                    Uri uriUrl = Uri.parse("https://www.rmrims.org.in/address.html");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center6)) {
                    Uri uriUrl = Uri.parse("https://saralpathlab.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center7)) {
                    Uri uriUrl = Uri.parse("https://lakhisarai.nic.in/public-utility/sadar-hospital-lakhisarai/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center8)) {
                    Uri uriUrl = Uri.parse("https://patnamedicalcollege.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center9)) {
                    Uri uriUrl = Uri.parse("http://www.igims.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center10)) {
                    Uri uriUrl = Uri.parse("https://www.aiimspatna.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center11)) {
                    Uri uriUrl = Uri.parse("http://anmmc.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }

            }
        });
    }
    LocationCallback mLocationCallback=new LocationCallback(){
        @Override
        public void onLocationResult(LocationResult locationResult) {
            for(Location location1 : locationResult.getLocations()) {
                if (getApplicationContext() != null) {
                    mLastLocation = location1;
                    latLng = new LatLng(location1.getLatitude(), location1.getLongitude());
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
                }
            }

        }
    };
    public void onBackPressed(){
        stopService(new Intent(getApplicationContext(), Location_Services.class));
        Intent intent = new Intent(Test_MapsActivity.this, home.class);
        startActivity(intent);
        finish();
        return;

    };
}
