package com.pro1.sunnah;



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@SuppressLint("WorldReadableFiles")
public class Dua extends ListActivity implements OnItemClickListener {
	   public static long u ;
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.dualist);
				ListView listview = (ListView) findViewById(android.R.id.list);

				listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dua_list)));
		listview.setOnItemClickListener(this);
			}

	public boolean onCreateOptionsMenu(Menu menu) {
		
		return true;
	}

	

	@SuppressWarnings("deprecation")
	@Override
	public void onItemClick(AdapterView<?> adap, View v, int pos, long id1) 
	{
	if(id1==0)
	{
		AssetManager assetManager = getAssets();

			        InputStream in = null;
			        OutputStream out = null;
			        File file = new File(getFilesDir(), "daily.pdf");
			        try
			        {
			            in = assetManager.open("daily.pdf");
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
			                Uri.parse("file://" + getFilesDir() + "/daily.pdf"),
			                "application/pdf");

			        startActivity(intent);
			    }
	else if (id1==1)
	{
		{
			AssetManager assetManager1 = getAssets();

				        InputStream in = null;
				        OutputStream out = null;
				        File file = new File(getFilesDir(), "fortres.pdf");
				        try
				        {
				            in = assetManager1.open("fortres.pdf");
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
				                Uri.parse("file://" + getFilesDir() + "/fortres.pdf"),
				                "application/pdf");

				        startActivity(intent);
		}}
	}

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

