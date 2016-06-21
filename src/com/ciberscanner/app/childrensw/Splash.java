package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;

public class Splash extends Activity {
	//--------------------------------------------------------------------
	//Variables

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		new ProgressClass().execute();
	}
	//--------------------------------------------------------------------
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
	//--------------------------------------------------------------------
		//
	private void gotoActivity(){
		Intent inicio = new Intent(this, Inicio.class);
		startActivity(inicio);
		finish();
		
	}
}