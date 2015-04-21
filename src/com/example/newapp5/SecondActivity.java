package com.example.newapp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class SecondActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		// receive the data from the previous activity
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		Log.d("SecondActivity", data);
	}

}
