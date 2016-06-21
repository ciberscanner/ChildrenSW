package com.ciberscanner.app.childrensw;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Mapa extends FragmentActivity implements LocationListener {

	GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// show error dialog if GoolglePlayServices not available
		if (!isGooglePlayServicesAvailable()) {
			finish();
		}
		setContentView(R.layout.activity_mapa);
		SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.googleMap);
		googleMap = supportMapFragment.getMap();
		googleMap.setMyLocationEnabled(true);
		LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		Criteria criteria = new Criteria();
		String bestProvider = locationManager.getBestProvider(criteria, true);
		Location location = locationManager.getLastKnownLocation(bestProvider);
		if (location != null) {
			onLocationChanged(location);
		}
		locationManager.requestLocationUpdates(bestProvider, 20000, 0, this);
		

		// create marker
		MarkerOptions markerrojo = new MarkerOptions().position(new LatLng(21.152233, -86.854812)).title("50 reportes");
		
		MarkerOptions markeramarillo = new MarkerOptions().position(new LatLng(21.185469, -86.809275)).title(" 5 reportes");
		
		MarkerOptions markernaranja = new MarkerOptions().position(new LatLng(18.060088, -95.132130)).title("20 reportes");

		// Changing marker icon
		markerrojo.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_icon_red));
		markeramarillo.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_icon_yellow));
		markernaranja.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_icon_orange));

		// adding marker
		googleMap.addMarker(markerrojo);
		googleMap.addMarker(markeramarillo);
		googleMap.addMarker(markernaranja);
		
		
	}

	@Override
	public void onLocationChanged(Location location) {
		//TextView locationTv = (TextView) findViewById(R.id.latlongLocation);
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		LatLng latLng = new LatLng(latitude, longitude);
		googleMap.addMarker(new MarkerOptions().position(latLng));
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
		googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
		//locationTv.setText("Latitude:" + latitude + ", Longitude:" + longitude);
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
	}

	private boolean isGooglePlayServicesAvailable() {
		int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		if (ConnectionResult.SUCCESS == status) {
			return true;
		} else {
			GooglePlayServicesUtil.getErrorDialog(status, this, 0).show();
			return false;
		}
	}
}