package com.dmitriy.probationone;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

	}
	
	@Override
	protected void onResume() {
		super.onResume();
		new Handler(){
			public void handleMessage(android.os.Message msg) {
				startActivity(new Intent(SplashScreenActivity.this,HomeScreen.class));
			};
		}.sendEmptyMessageDelayed(0, 2000);
	}

}
