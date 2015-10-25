package com.multibg;

import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;

import com.actionbarsherlock.app.SherlockActivity;

public class AboutActivity extends SherlockActivity
{
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
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
}
