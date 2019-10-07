package com.pro1.sunnah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



	public class Sunnah2 extends Activity {
		
		private static int sto=3000;
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(com.pro1.sunnah.R.layout.splash2);
 
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					Intent i = new Intent(Sunnah2.this, MainActivity.class);
				startActivity(i);
				finish();
				}
			}, sto);
		}

		

	}


