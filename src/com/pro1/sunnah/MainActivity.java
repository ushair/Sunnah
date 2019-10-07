package com.pro1.sunnah;



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.net.Uri;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("WorldReadableFiles")
public class MainActivity extends Activity implements OnClickListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button namazbtn = (Button) findViewById(R.id.button1);
		Button sunbtn = (Button) findViewById(R.id.button3);
		Button duabtn = (Button) findViewById(R.id.button2);
		Button nbbtn = (Button) findViewById(R.id.button6);
		Button qiblabtn= (Button) findViewById(R.id.button5);
		namazbtn.setOnClickListener(this);
		duabtn.setOnClickListener(this);
		sunbtn.setOnClickListener(this);
		qiblabtn.setOnClickListener(this);
		nbbtn.setOnClickListener(this);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inf=getMenuInflater();
		inf.inflate(R.menu.main, menu);
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onClick(View v) {
		switch (v.getId())
		{
		case R.id.button1:
		{			Intent intent = new Intent(v.getContext(), Namazlist.class);
			startActivity(intent);
			break;
		}
		case R.id.button5:
		{			
			Intent intent = new Intent(v.getContext(), Compass.class);
			startActivity(intent);
			break;
		}
		case R.id.button2:
		{
			Intent intent = new Intent(this,Dua.class); 
			startActivity(intent);
			break;
		}
		case R.id.button6:
		{
			Intent intent = new Intent(this,Time_activity.class); 
			startActivity(intent);
			break;
		}
		case R.id.button3:
		{
			AssetManager assetManager = getAssets();

	        InputStream in = null;
	        OutputStream out = null;
	        File file = new File(getFilesDir(), "sunnat.pdf");
	        try
	        {
	            in = assetManager.open("sunnat.pdf");
	            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	            copyFile(in, out);
	            in.close();
	            in = null;
	            out.flush();
	            out.close();
	            out = null;
	        } catch (Exception e)
	        {
	            Log.e("tag", e.getMessage());
	        }

	        Intent intent = new Intent(Intent.ACTION_VIEW);
	        intent.setDataAndType(
	                Uri.parse("file://" + getFilesDir() + "/sunnat.pdf"),
	                "application/pdf");

	        startActivity(intent);
			break;
			   	}
		}}
		private void copyFile(InputStream in, OutputStream out) throws IOException
		{
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1)
		{
		out.write(buffer, 0, read);
		}

		}
		}

