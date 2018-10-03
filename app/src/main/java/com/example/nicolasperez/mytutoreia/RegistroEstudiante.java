package com.example.nicolasperez.mytutoreia;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.graphics.Bitmap;
import android.app.Activity;
import android.provider.MediaStore;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;


public class RegistroEstudiante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_estudiante);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void validarUsuario(View view){


        EditText nombre = (EditText)findViewById(R.id.nombre);
        EditText nombreCuenta = (EditText)findViewById(R.id.nombreCuenta);
        EditText PW = (EditText)findViewById(R.id.PW);
        EditText confirmarPW = (EditText)findViewById(R.id.confirmarPW);
        EditText correoElectronico = (EditText)findViewById(R.id.correoElectronico);





        if(nombre.getText().toString().equals("") || nombreCuenta.getText().toString().equals("") || PW.getText().toString().equals("") || confirmarPW.getText().toString().equals("")
                || correoElectronico.getText().toString().equals("")) {

            Context context = getApplicationContext();
            CharSequence text = "Llene todos los campos!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else{
            if (PW.getText().toString().equals(confirmarPW.getText().toString()) == false) {
                Context context = getApplicationContext();
                CharSequence text = "Que carajos";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Usuario dank = new Estudiante(nombre.getText().toString(), nombreCuenta.getText().toString(), PW.getText().toString(), correoElectronico.getText().toString());

                Context context = getApplicationContext();
                CharSequence text = "Nuevo Usuario Creado";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("nuevoUsuario", dank);
                startActivity(intent);
            }
        }
    }

}
