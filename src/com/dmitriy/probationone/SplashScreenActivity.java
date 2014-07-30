package com.dmitriy.probationone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreenActivity extends Activity {
	
	Handler h;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash_screen);
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		h = new Handler(){
			public void handleMessage(android.os.Message msg) {
				startActivity(new Intent(SplashScreenActivity.this,HomeScreenActivity.class));
			};
		};
		h.sendEmptyMessageDelayed(0, 2000);
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		if(h.hasMessages(0)){
			h.removeMessages(0);
		}
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		finish();
	}

}
