package com.multibg;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuInflater;

public class MainActivity extends SherlockPreferenceActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
		
		SharedPreferences sharedPreferences = getSharedPreferences("Alfahmi",Context.MODE_PRIVATE);    
	    String bg = sharedPreferences.getString("multi","light");

		if ("light".equals(bg)) {	
		getWindow().setBackgroundDrawableResource(R.drawable.light);
		
		} else if ("pink".equals(bg)) {
		getWindow().setBackgroundDrawableResource(R.drawable.pink);

		} else if ("green".equals(bg)) {
		getWindow().setBackgroundDrawableResource(R.drawable.green);
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.light:
				this.Light();
				return true;
			case R.id.pink:
				this.Pink();
				return true;
			case R.id.green:
				this.Green();
				return true;
			case R.id.about:
				this.startAbout();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	private void Light()
	{
		SharedPreferences sharedPreferences = getSharedPreferences("Alfahmi",Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("multi", "light");
		editor.commit();
		finish();
		System.exit(0);
	}

	private void Pink()
	{
		SharedPreferences sharedPreferences = getSharedPreferences("Alfahmi",Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("multi", "pink");
		editor.commit();
		finish();
		System.exit(0);
	}

	private void Green()
	{
		SharedPreferences sharedPreferences = getSharedPreferences("Alfahmi",Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("multi", "green");
		editor.commit();
		finish();
		System.exit(0);
	}
	
	private void startAbout()
	{
		Intent settingsIntent = new Intent();
		settingsIntent.setClass(this, AboutActivity.class);
		startActivity(settingsIntent);
	}


}
