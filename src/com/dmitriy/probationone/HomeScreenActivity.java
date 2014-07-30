package com.dmitriy.probationone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class HomeScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_home_screen);
		ListView listView =  (ListView)findViewById(R.id.list_view);
		String[] items = new String[20];
		for(int i=0;i<20;i++){
			items[i] = "Item" + (i + 1);
		}
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items));
	}
	
}
