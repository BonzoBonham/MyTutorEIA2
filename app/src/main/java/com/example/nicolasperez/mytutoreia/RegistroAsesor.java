package com.example.nicolasperez.mytutoreia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RegistroAsesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_registro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public static final int GET_FROM_GALLERY = 1;
    public void subirImagenPerfil(View view){
        startActivityForResult(new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI), GET_FROM_GALLERY);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        //Detects request codes
        if(requestCode==GET_FROM_GALLERY && resultCode == Activity.RESULT_OK) {
            Uri selectedImage = data.getData();
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public void validar(View view){
        EditText nombre = (EditText)findViewById(R.id.nombre);
        EditText nombreCuenta = (EditText)findViewById(R.id.nombreCuenta);
        EditText PW = (EditText)findViewById(R.id.PW);
        EditText confirmarPW = (EditText)findViewById(R.id.confirmarPW);
        EditText correoElectronico = (EditText)findViewById(R.id.correoElectronico);
        EditText telefono = (EditText)findViewById(R.id.telefono);
        EditText materias = (EditText)findViewById(R.id.materias);
        EditText nivel = (EditText)findViewById(R.id.nivel);
        EditText horario = (EditText)findViewById(R.id.horario);

        if(true) {

        } else{
            if (PW != confirmarPW) {
                Context context = getApplicationContext();
                CharSequence text = "Las contraseñas no coinciden!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {

            }
        }
    }

}

