package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Informacion extends Activity {
	// --------------------------------------------------------------------
	// Variables
	
	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
	}

	// --------------------------------------------------------------------
		//
		public void back(View v) {
			finish();
		}
}
