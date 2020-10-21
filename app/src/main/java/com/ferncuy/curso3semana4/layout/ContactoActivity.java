/*
 * Copyright (c) 2020
 * By Pablo Fernandez
 * ferning98@gmail.com
 */

package com.ferncuy.curso3semana4.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ferncuy.curso3semana4.R;
import com.ferncuy.curso3semana4.pojo.SendMail;
import com.google.android.material.textfield.TextInputEditText;

public class ContactoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText inputNombre;
    private TextInputEditText inputEmail;
    private TextInputEditText inputMensaje;

    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        inputNombre = findViewById(R.id.textInputNombre);
        inputEmail = findViewById(R.id.textInputCorreo);
        inputMensaje = findViewById(R.id.textInputMensaje);

        botonEnviar = findViewById(R.id.buttonEnviar);

        botonEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }

    private void sendEmail() {
        //Getting content for email
        String email = inputEmail.getText().toString().trim();
        String subject = "Nuevo Mensaje en App Petagram";
        String message = "Nombre: " + inputNombre.getText().toString().trim() + ":\nMensaje: " + inputMensaje.getText().toString().trim();

        //Creating SendMail object
        SendMail sendMail = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sendMail.execute();
    }

}