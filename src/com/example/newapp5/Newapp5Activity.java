package com.example.newapp5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class Newapp5Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_newapp5);
        setContentView(R.layout.activity_newapp5);
        
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        	/*Toast.makeText(Newapp5Activity.this, "You conform it!",
        	Toast.LENGTH_LONG).show();*/
/*        	Intent intent = new Intent("com.example.activitytest.ACTION_START");
        	intent.addCategory("com.example.activitytest.MY_CATEGORY");*/
/*    		Intent intent = new Intent(Intent.ACTION_VIEW);
    		intent.setData(Uri.parse("http://www.baidu.com"));
        	startActivity(intent);*/
        	// pass the data to the next activity
/*    		String data = "Hello SecondActivity";
    		Intent intent = new Intent(Newapp5Activity.this, SecondActivity.class);
    		intent.putExtra("extra_data", data);
    		startActivity(intent);*/
    		// receive data from the next activity
    		Intent intent = new Intent(Newapp5Activity.this, SecondActivity.class);
    		startActivityForResult(intent, 1);
        	}
        	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getMenuInflater().inflate(R.menu.main, menu);
    	return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.add_item:
    	Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
    	break;
    	case R.id.remove_item:
        Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
    	break;
    	case R.id.exit_item:
    	finish();
    	break;
    	default:
    	}
    	return true;
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    switch (requestCode) {
		    case 1:
		    if (resultCode == RESULT_OK) {
			    String returnedData = data.getStringExtra("data_return");
			    Log.d("FirstActivity", returnedData);
		    }
		    break;
	    default:
	    }
    }
}
