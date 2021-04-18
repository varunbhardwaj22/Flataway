package com.star.flataway;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.ScrollView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	
	private ScrollView vscroll6;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear131;
	private LinearLayout linear146;
	private LinearLayout linear159;
	private LinearLayout linear172;
	private LinearLayout linear185;
	private ImageView imageview1;
	private EditText edittext1;
	private TextView textview2;
	private LinearLayout linear19;
	private LinearLayout linear32;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private ImageView imageview7;
	private TextView textview50;
	private TextView textview49;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private ImageView imageview4;
	private TextView textview5;
	private TextView textview4;
	private LinearLayout linear29;
	private LinearLayout linear28;
	private ImageView imageview5;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private ImageView imageview6;
	private TextView textview8;
	private TextView textview9;
	private TextView textview47;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private ImageView imageview16;
	private TextView textview31;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private ImageView imageview17;
	private TextView textview33;
	private LinearLayout linear75;
	private LinearLayout linear76;
	private ImageView imageview18;
	private TextView textview35;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private ImageView imageview19;
	private TextView textview37;
	private TextView textview48;
	private HorizontalScrollView hscroll5;
	private LinearLayout linear79;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private ImageView imageview20;
	private TextView textview39;
	private LinearLayout linear86;
	private LinearLayout linear87;
	private ImageView imageview21;
	private TextView textview41;
	private LinearLayout linear88;
	private LinearLayout linear89;
	private ImageView imageview22;
	private TextView textview43;
	private LinearLayout linear90;
	private LinearLayout linear91;
	private ImageView imageview23;
	private TextView textview45;
	private TextView textview81;
	private LinearLayout linear147;
	private LinearLayout linear148;
	private LinearLayout linear149;
	private LinearLayout linear150;
	private LinearLayout linear151;
	private LinearLayout linear152;
	private ImageView imageview40;
	private TextView textview11;
	private TextView textview10;
	private LinearLayout linear153;
	private LinearLayout linear154;
	private ImageView imageview41;
	private TextView textview75;
	private TextView textview76;
	private LinearLayout linear155;
	private LinearLayout linear156;
	private ImageView imageview42;
	private TextView textview77;
	private TextView textview78;
	private LinearLayout linear157;
	private LinearLayout linear158;
	private ImageView imageview43;
	private TextView textview79;
	private TextView textview80;
	private LinearLayout linear160;
	private LinearLayout linear161;
	private LinearLayout linear162;
	private LinearLayout linear163;
	private LinearLayout linear164;
	private LinearLayout linear165;
	private ImageView imageview44;
	private TextView textview82;
	private TextView textview83;
	private LinearLayout linear166;
	private LinearLayout linear167;
	private ImageView imageview45;
	private TextView textview84;
	private TextView textview85;
	private LinearLayout linear168;
	private LinearLayout linear169;
	private ImageView imageview46;
	private TextView textview86;
	private TextView textview87;
	private LinearLayout linear170;
	private LinearLayout linear171;
	private ImageView imageview47;
	private TextView textview88;
	private TextView textview89;
	private LinearLayout linear173;
	private LinearLayout linear174;
	private LinearLayout linear175;
	private LinearLayout linear176;
	private LinearLayout linear177;
	private LinearLayout linear178;
	private ImageView imageview48;
	private TextView textview90;
	private TextView textview91;
	private LinearLayout linear179;
	private LinearLayout linear180;
	private ImageView imageview49;
	private TextView textview92;
	private TextView textview93;
	private LinearLayout linear181;
	private LinearLayout linear182;
	private ImageView imageview50;
	private TextView textview94;
	private TextView textview95;
	private LinearLayout linear183;
	private LinearLayout linear184;
	private ImageView imageview51;
	private TextView textview96;
	private TextView textview97;
	private LinearLayout linear186;
	private LinearLayout linear187;
	private LinearLayout linear188;
	private LinearLayout linear189;
	private LinearLayout linear190;
	private LinearLayout linear191;
	private ImageView imageview52;
	private TextView textview98;
	private TextView textview99;
	private LinearLayout linear192;
	private LinearLayout linear193;
	private ImageView imageview53;
	private TextView textview100;
	private TextView textview101;
	private LinearLayout linear194;
	private LinearLayout linear195;
	private ImageView imageview54;
	private TextView textview102;
	private TextView textview103;
	private LinearLayout linear196;
	private LinearLayout linear197;
	private ImageView imageview55;
	private TextView textview104;
	private TextView textview105;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear6;
	private Button _drawer_closedrawer;
	private TextView _drawer_rentahouse;
	private TextView _drawer_contactus;
	private TextView _drawer_support;
	private Button _drawer_signout;
	
	private Intent i = new Intent();
	private FirebaseAuth F;
	private OnCompleteListener<AuthResult> _F_create_user_listener;
	private OnCompleteListener<AuthResult> _F_sign_in_listener;
	private OnCompleteListener<Void> _F_reset_password_listener;
	private AlertDialog.Builder dialogue_dash;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dashboard);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(DashboardActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		vscroll6 = (ScrollView) findViewById(R.id.vscroll6);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		linear131 = (LinearLayout) findViewById(R.id.linear131);
		linear146 = (LinearLayout) findViewById(R.id.linear146);
		linear159 = (LinearLayout) findViewById(R.id.linear159);
		linear172 = (LinearLayout) findViewById(R.id.linear172);
		linear185 = (LinearLayout) findViewById(R.id.linear185);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview49 = (TextView) findViewById(R.id.textview49);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview47 = (TextView) findViewById(R.id.textview47);
		hscroll4 = (HorizontalScrollView) findViewById(R.id.hscroll4);
		linear66 = (LinearLayout) findViewById(R.id.linear66);
		linear67 = (LinearLayout) findViewById(R.id.linear67);
		linear68 = (LinearLayout) findViewById(R.id.linear68);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		linear70 = (LinearLayout) findViewById(R.id.linear70);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview31 = (TextView) findViewById(R.id.textview31);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview33 = (TextView) findViewById(R.id.textview33);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview35 = (TextView) findViewById(R.id.textview35);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview48 = (TextView) findViewById(R.id.textview48);
		hscroll5 = (HorizontalScrollView) findViewById(R.id.hscroll5);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview39 = (TextView) findViewById(R.id.textview39);
		linear86 = (LinearLayout) findViewById(R.id.linear86);
		linear87 = (LinearLayout) findViewById(R.id.linear87);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview41 = (TextView) findViewById(R.id.textview41);
		linear88 = (LinearLayout) findViewById(R.id.linear88);
		linear89 = (LinearLayout) findViewById(R.id.linear89);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview43 = (TextView) findViewById(R.id.textview43);
		linear90 = (LinearLayout) findViewById(R.id.linear90);
		linear91 = (LinearLayout) findViewById(R.id.linear91);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview81 = (TextView) findViewById(R.id.textview81);
		linear147 = (LinearLayout) findViewById(R.id.linear147);
		linear148 = (LinearLayout) findViewById(R.id.linear148);
		linear149 = (LinearLayout) findViewById(R.id.linear149);
		linear150 = (LinearLayout) findViewById(R.id.linear150);
		linear151 = (LinearLayout) findViewById(R.id.linear151);
		linear152 = (LinearLayout) findViewById(R.id.linear152);
		imageview40 = (ImageView) findViewById(R.id.imageview40);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear153 = (LinearLayout) findViewById(R.id.linear153);
		linear154 = (LinearLayout) findViewById(R.id.linear154);
		imageview41 = (ImageView) findViewById(R.id.imageview41);
		textview75 = (TextView) findViewById(R.id.textview75);
		textview76 = (TextView) findViewById(R.id.textview76);
		linear155 = (LinearLayout) findViewById(R.id.linear155);
		linear156 = (LinearLayout) findViewById(R.id.linear156);
		imageview42 = (ImageView) findViewById(R.id.imageview42);
		textview77 = (TextView) findViewById(R.id.textview77);
		textview78 = (TextView) findViewById(R.id.textview78);
		linear157 = (LinearLayout) findViewById(R.id.linear157);
		linear158 = (LinearLayout) findViewById(R.id.linear158);
		imageview43 = (ImageView) findViewById(R.id.imageview43);
		textview79 = (TextView) findViewById(R.id.textview79);
		textview80 = (TextView) findViewById(R.id.textview80);
		linear160 = (LinearLayout) findViewById(R.id.linear160);
		linear161 = (LinearLayout) findViewById(R.id.linear161);
		linear162 = (LinearLayout) findViewById(R.id.linear162);
		linear163 = (LinearLayout) findViewById(R.id.linear163);
		linear164 = (LinearLayout) findViewById(R.id.linear164);
		linear165 = (LinearLayout) findViewById(R.id.linear165);
		imageview44 = (ImageView) findViewById(R.id.imageview44);
		textview82 = (TextView) findViewById(R.id.textview82);
		textview83 = (TextView) findViewById(R.id.textview83);
		linear166 = (LinearLayout) findViewById(R.id.linear166);
		linear167 = (LinearLayout) findViewById(R.id.linear167);
		imageview45 = (ImageView) findViewById(R.id.imageview45);
		textview84 = (TextView) findViewById(R.id.textview84);
		textview85 = (TextView) findViewById(R.id.textview85);
		linear168 = (LinearLayout) findViewById(R.id.linear168);
		linear169 = (LinearLayout) findViewById(R.id.linear169);
		imageview46 = (ImageView) findViewById(R.id.imageview46);
		textview86 = (TextView) findViewById(R.id.textview86);
		textview87 = (TextView) findViewById(R.id.textview87);
		linear170 = (LinearLayout) findViewById(R.id.linear170);
		linear171 = (LinearLayout) findViewById(R.id.linear171);
		imageview47 = (ImageView) findViewById(R.id.imageview47);
		textview88 = (TextView) findViewById(R.id.textview88);
		textview89 = (TextView) findViewById(R.id.textview89);
		linear173 = (LinearLayout) findViewById(R.id.linear173);
		linear174 = (LinearLayout) findViewById(R.id.linear174);
		linear175 = (LinearLayout) findViewById(R.id.linear175);
		linear176 = (LinearLayout) findViewById(R.id.linear176);
		linear177 = (LinearLayout) findViewById(R.id.linear177);
		linear178 = (LinearLayout) findViewById(R.id.linear178);
		imageview48 = (ImageView) findViewById(R.id.imageview48);
		textview90 = (TextView) findViewById(R.id.textview90);
		textview91 = (TextView) findViewById(R.id.textview91);
		linear179 = (LinearLayout) findViewById(R.id.linear179);
		linear180 = (LinearLayout) findViewById(R.id.linear180);
		imageview49 = (ImageView) findViewById(R.id.imageview49);
		textview92 = (TextView) findViewById(R.id.textview92);
		textview93 = (TextView) findViewById(R.id.textview93);
		linear181 = (LinearLayout) findViewById(R.id.linear181);
		linear182 = (LinearLayout) findViewById(R.id.linear182);
		imageview50 = (ImageView) findViewById(R.id.imageview50);
		textview94 = (TextView) findViewById(R.id.textview94);
		textview95 = (TextView) findViewById(R.id.textview95);
		linear183 = (LinearLayout) findViewById(R.id.linear183);
		linear184 = (LinearLayout) findViewById(R.id.linear184);
		imageview51 = (ImageView) findViewById(R.id.imageview51);
		textview96 = (TextView) findViewById(R.id.textview96);
		textview97 = (TextView) findViewById(R.id.textview97);
		linear186 = (LinearLayout) findViewById(R.id.linear186);
		linear187 = (LinearLayout) findViewById(R.id.linear187);
		linear188 = (LinearLayout) findViewById(R.id.linear188);
		linear189 = (LinearLayout) findViewById(R.id.linear189);
		linear190 = (LinearLayout) findViewById(R.id.linear190);
		linear191 = (LinearLayout) findViewById(R.id.linear191);
		imageview52 = (ImageView) findViewById(R.id.imageview52);
		textview98 = (TextView) findViewById(R.id.textview98);
		textview99 = (TextView) findViewById(R.id.textview99);
		linear192 = (LinearLayout) findViewById(R.id.linear192);
		linear193 = (LinearLayout) findViewById(R.id.linear193);
		imageview53 = (ImageView) findViewById(R.id.imageview53);
		textview100 = (TextView) findViewById(R.id.textview100);
		textview101 = (TextView) findViewById(R.id.textview101);
		linear194 = (LinearLayout) findViewById(R.id.linear194);
		linear195 = (LinearLayout) findViewById(R.id.linear195);
		imageview54 = (ImageView) findViewById(R.id.imageview54);
		textview102 = (TextView) findViewById(R.id.textview102);
		textview103 = (TextView) findViewById(R.id.textview103);
		linear196 = (LinearLayout) findViewById(R.id.linear196);
		linear197 = (LinearLayout) findViewById(R.id.linear197);
		imageview55 = (ImageView) findViewById(R.id.imageview55);
		textview104 = (TextView) findViewById(R.id.textview104);
		textview105 = (TextView) findViewById(R.id.textview105);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_closedrawer = (Button) _nav_view.findViewById(R.id.closedrawer);
		_drawer_rentahouse = (TextView) _nav_view.findViewById(R.id.rentahouse);
		_drawer_contactus = (TextView) _nav_view.findViewById(R.id.contactus);
		_drawer_support = (TextView) _nav_view.findViewById(R.id.support);
		_drawer_signout = (Button) _nav_view.findViewById(R.id.signout);
		F = FirebaseAuth.getInstance();
		dialogue_dash = new AlertDialog.Builder(this);
		
		linear32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Img_1Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Img_1Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Img_2Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear71.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Img_2Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Img_2Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		_drawer_closedrawer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_rentahouse.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), RentahouseActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		_drawer_contactus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ContactusActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		_drawer_support.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SupportActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		_drawer_signout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dialogue_dash.create().show();
				dialogue_dash.setTitle("SignOut");
				dialogue_dash.setMessage("Do you really want to SignOut?");
				dialogue_dash.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						FirebaseAuth.getInstance().signOut();
						i.setClass(getApplicationContext(), MainActivity.class);
						startActivity(i);
						SketchwareUtil.showMessage(getApplicationContext(), "SignedOut");
					}
				});
				dialogue_dash.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						SketchwareUtil.showMessage(getApplicationContext(), "Not signed out!");
					}
				});
			}
		});
		
		_F_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_F_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_F_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	private void initializeLogic() {
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
		dialogue_dash.setTitle("Quit?");
		dialogue_dash.setMessage("Do you want to exit the app?");
		dialogue_dash.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "Bye bye!");
				finish();
			}
		});
		dialogue_dash.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "oh you're still here nice .... !!HOUSES!!");
			}
		});
		dialogue_dash.create().show();
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
