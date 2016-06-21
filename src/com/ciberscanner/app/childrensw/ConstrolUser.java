package com.ciberscanner.app.childrensw;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.IntentCompat;

public class ConstrolUser {
	// -----------------------------------------------------------------------------------
	// Variables
	private static final String PREF_NAME = "USERAPP";
	SharedPreferences mPreferences;
	SharedPreferences.Editor mEditor;
	private Context ctx;

	// -----------------------------------------------------------------------------------
	// Constructor
	public ConstrolUser(Context ctx) {
		this.ctx = ctx;
		this.mPreferences = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		this.mEditor = mPreferences.edit();
	}

	// -----------------------------------------------------------------------------------
	//
	public int saveUsuario(User user) {
		try {
			mEditor.putBoolean("login", true);

			mEditor.putString("id", user.getId());
			mEditor.putString("email", user.getEmail());
			mEditor.putString("password", user.getPassword());
			mEditor.putString("category", user.getCategory());
			mEditor.apply();
			return 1;
		} catch (Exception ex) {
			return 0;
		}
	}

	// -----------------------------------------------------------------------------------
	//
	public User getUsuario() {
		if (mPreferences.getBoolean("login", true)) {
			
			User user = new User(mPreferences.getString("id", ""), mPreferences.getString("email", ""),
					mPreferences.getString("password", ""), mPreferences.getString("category", ""));
			return user;
		} else {
			return null;
		}

	}

	// -----------------------------------------------------------------------------------
	//
	public void logout() {
		mEditor.putBoolean("login", false);

		mEditor.putString("id", "");
		mEditor.putString("email", "");
		mEditor.putString("password", "");
		mEditor.putString("category", "");
		mEditor.apply();

		Intent i = new Intent(ctx, Inicio.class);
		i.setFlags(
				Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
		ctx.startActivity(i);
	}

}
