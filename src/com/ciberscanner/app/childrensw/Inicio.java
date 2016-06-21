package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private ConstrolUser cu;

	private ImageView registro;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);

		cu = new ConstrolUser(this);

		registro = (ImageView) findViewById(R.id.imgRegister);

		User us = cu.getUsuario();
		try {
			if (!us.getEmail().isEmpty()) {
				Log.v("mensaje: ", "Usuario regitrado");
				registro.setImageResource(R.drawable.button_account);
				registro.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						gotoCuenta();
					}
				});
			}

		} catch (Exception ex) {
			registro.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					gotoRegistro();
				}
			});
			Log.v("mensaje: ", "Usuario no regitrado");
		}
	}

	// --------------------------------------------------------------------
	//
	public void gotoDenuncia(View v) {
		Intent inicio = new Intent(this, Denuncia.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoPreguntas(View v) {
		Intent inicio = new Intent(this, Preguntas.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoInformacion(View v) {
		Intent inicio = new Intent(this, Informacion.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoRegistro() {
		Intent inicio = new Intent(this, Registro.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoCuenta() {
		Intent inicio = new Intent(this, Cuenta.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoPerfil() {
		Intent inicio = new Intent(this, Registro.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoIndicadores(View v) {
		Intent inicio = new Intent(this, Estadisticas.class);
		startActivity(inicio);
	}

}