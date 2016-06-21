package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Denuncia extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;
	private TextView mensaje;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_denuncia);
		titulo = (TextView) findViewById(R.id.txt_title);
		mensaje=(TextView) findViewById(R.id.txtmensajes);
		titulo.setText("Denunciar");
	}
	// --------------------------------------------------------------------
	//
	
	public void send(View v){
		if(mensaje.getText().toString().length()>15){
			Toast.makeText(getApplicationContext(), "Gracias, su dencuncia ha sido enviada", Toast.LENGTH_LONG).show();
			finish();
		}else{
			mensaje.setError("Este campo es obligatorio y debe tener más de 15 caracteres");
		}
		
	}

	// --------------------------------------------------------------------
	//
	public void back(View v) {
		finish();
	}
	
}