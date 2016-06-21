package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo, registro;

	private EditText email, pass1, pass2;

	private String emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\.+[a-zA-Z]+";
	private String emailPattern2 = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\.+[a-zA-Z]+.+[a-zA-Z]+";

	private ConstrolUser cu;

	private int categoria = 0;

	private ImageView img1, img2, img3, img4;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registro);

		email = (EditText) findViewById(R.id.txtemail);
		pass1 = (EditText) findViewById(R.id.txtpass1);
		pass2 = (EditText) findViewById(R.id.txtpass2);

		cu = new ConstrolUser(this);

		titulo = (TextView) findViewById(R.id.txt_title);

		registro = (TextView) findViewById(R.id.txt_regitro);
		
		

		registro.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (comprobar()) {

					User us = new User(email.getText().toString(), pass1.getText().toString(), categoria + "");
					cu.saveUsuario(us);
					finish();
				}
			}
		});

		titulo.setText("Registro");
	}

	// --------------------------------------------------------------------
	//
	private boolean comprobar() {
		if (categoria > 0) {
			if (emailValidateEditText()) {
				if (pass1.getText().length() > 5) {
					if (pass1.getText().toString().equals(pass2.getText().toString())) {
						return true;

					} else {
						pass2.setError("Las contraseñas no coinciden");
						return false;
					}
				} else {
					pass1.setError("La contraseña debe tener más de 5 caracteres");
					return false;
				}

			} else {
				email.setError("Correo no valido");
				return false;
			}
		} else {

			Toast.makeText(getApplicationContext(), "Debe seleccionar una categoría", Toast.LENGTH_LONG).show();
			return false;

		}

	}

	// --------------------------------------------------------------------
	//
	private boolean emailValidateEditText() {
		String correo = email.getText().toString().trim();

		if (correo.matches(emailPattern) && email.length() > 0) {
			return true;
		} else if (correo.matches(emailPattern2) && email.length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------------------
	//
	public void back(View v) {
		finish();
	}

	// --------------------------------------------------------------------
	//
	public void setHotel(View v) {
		categoria = 1;
		Toast.makeText(getApplicationContext(), "Selecciono la categoria Hotel", Toast.LENGTH_LONG).show();

	}

	// --------------------------------------------------------------------
	//
	public void setNegocio(View v) {
		categoria = 2;
		Toast.makeText(getApplicationContext(), "Selecciono la categoria Establecimiento comercial", Toast.LENGTH_LONG).show();

	}

	// --------------------------------------------------------------------
	//
	public void setCarro(View v) {
		categoria = 3;
		Toast.makeText(getApplicationContext(), "Selecciono la categoria transporte", Toast.LENGTH_LONG).show();

	}

	// --------------------------------------------------------------------
	//
	public void setComunidad(View v) {
		categoria = 4;
		Toast.makeText(getApplicationContext(), "Selecciono la categoria comunidad", Toast.LENGTH_LONG).show();

	}
}
