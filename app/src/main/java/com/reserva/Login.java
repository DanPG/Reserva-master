package com.reserva;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends Activity {
    EditText nombre;
    EditText contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void log(){
        Intent envia = new Intent(this, MainActivity.class);
        Bundle datos = new Bundle();
        datos.putString("Usr",nombre.getText().toString());
        datos.putString("Psw",contra.getText().toString());
        if (nombre.getText().toString() == "Daniel" && contra.getText().toString() == "1234") {
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }
    }
}
