package com.ciberscanner.app.childrensw;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

public class Splash extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private View view;
	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		new ProgressClass().execute();
		view=(View)findViewById(R.id.vista);	
				
		Random r = new Random();
		int i1 = r.nextInt(3);
		
		Log.v("Valor",""+ i1);
		
		switch(i1){
		case 0:
			view.setBackgroundResource(R.drawable.sale1);
			break;
		case 1:
			view.setBackgroundResource(R.drawable.sale2);
			break;
		case 2:
			view.setBackgroundResource(R.drawable.sale3);
			break;
		}
	}

	// --------------------------------------------------------------------
	//
	class ProgressClass extends AsyncTask<String, String, String> {
		@Override
		protected void onPreExecute() {

		}

		@Override
		protected String doInBackground(String... params) {
			int uno = 4;

			while (uno > 0) {
				SystemClock.sleep(500);
				uno--;
			}

			return "listo";
		}

		@Override
		protected void onPostExecute(String result) {
			/* pDialog.dismiss(); */
			gotoActivity();
		}
	}

	// --------------------------------------------------------------------
	//
	private void gotoActivity() {
		Intent inicio = new Intent(this, Inicio.class);
		startActivity(inicio);
		finish();

	}
}