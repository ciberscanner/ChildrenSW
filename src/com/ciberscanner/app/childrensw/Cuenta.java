package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cuenta extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;

	private ConstrolUser cu;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuenta);
		titulo = (TextView) findViewById(R.id.txt_title);
		titulo.setText("Mi cuenta");

		cu = new ConstrolUser(this);
	}
	// --------------------------------------------------------------------
	//
	
	// --------------------------------------------------------------------
	//
	public void back(View v) {
		finish();
	}
	// --------------------------------------------------------------------
	//
	public void logout(View v) {
		cu.logout();
	}
}