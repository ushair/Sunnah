package com.pro1.sunnah;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

import android.view.animation.Animation;


public class Sunnah extends Activity {
	Animation animFadein;
	
	private static int sto=3000;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.pro1.sunnah.R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent i = new Intent(Sunnah.this, Sunnah2.class);
			startActivity(i);
			finish();
			}
		}, sto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(com.pro1.sunnah.R.menu.splash, menu);
		return true;
	}

}
