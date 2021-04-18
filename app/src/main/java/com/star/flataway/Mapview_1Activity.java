package com.star.flataway;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.content.Intent;
import android.net.Uri;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import java.text.DecimalFormat;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class Mapview_1Activity extends AppCompatActivity {
	
	
	private FloatingActionButton _fab;
	private double map = 0;
	private double lat = 0;
	private double lng = 0;
	
	private MapView img_1;
	private GoogleMapController _img_1_controller;
	
	private Intent intent_map = new Intent();
	private LocationManager Location_map;
	private LocationListener _Location_map_location_listener;
	private AlertDialog.Builder dialogue;
	private SharedPreferences pref;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mapview_1);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		img_1 = (MapView) findViewById(R.id.img_1);
		img_1.onCreate(_savedInstanceState);
		
		Location_map = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		dialogue = new AlertDialog.Builder(this);
		pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
		
		_img_1_controller = new GoogleMapController(img_1, new OnMapReadyCallback() {
			@Override
			public void onMapReady(GoogleMap _googleMap) {
				_img_1_controller.setGoogleMap(_googleMap);
				
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_img_1_controller.moveCamera(30.3752d, 76.7821d);
				_img_1_controller.zoomTo(14);
				_img_1_controller.addMarker("M", 30, 75);
				_img_1_controller.setMarkerInfo("M", "House location", String.valueOf((long)(30.375d)).concat(",".concat(String.valueOf((long)(76.7821d)))));
				_img_1_controller.setMarkerIcon("M", R.drawable.icons8);
			}
		});
		
		_Location_map_location_listener = new LocationListener() {
			@Override
			public void onLocationChanged(Location _param1) {
				final double _lat = _param1.getLatitude();
				final double _lng = _param1.getLongitude();
				final double _acc = _param1.getAccuracy();
				_img_1_controller.moveCamera(_lat, _lng);
				_img_1_controller.zoomTo(14);
				_img_1_controller.addMarker("m", _lat, _lng);
				_img_1_controller.setMarkerInfo("m", "My position", String.valueOf(_lat).concat(",".concat(String.valueOf(_lng))));
				_img_1_controller.setMarkerIcon("m", R.drawable.icons8);
			}
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {}
			@Override
			public void onProviderEnabled(String provider) {}
			@Override
			public void onProviderDisabled(String provider) {}
		};
	}
	private void initializeLogic() {
		if (ContextCompat.checkSelfPermission(Mapview_1Activity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
			Location_map.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1, 1, _Location_map_location_listener);
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		intent_map.setClass(getApplicationContext(), Img_1Activity.class);
		startActivity(intent_map);
		finish();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		img_1.onDestroy();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		img_1.onStart();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		img_1.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		img_1.onResume();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		img_1.onStop();
	}
	private void _extra () {
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
