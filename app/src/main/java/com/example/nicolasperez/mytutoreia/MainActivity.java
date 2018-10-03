package com.example.nicolasperez.mytutoreia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public void hacerLogin(View view){

        Intent intent = getIntent();
        Usuario user = (Usuario) intent.getSerializableExtra("nuevoUsuario");

        if (user == null){
            user = new Tutor("admin","admin","admin","admin","admin","admin","admin","admin" );
        }

        EditText username = (EditText)findViewById(R.id.correo);
        EditText password = (EditText)findViewById(R.id.password);

        if(username.getText().toString().equals(user.getNombreCuenta()) && password.getText().toString().equals(user.getPassword())){
            Intent i = new Intent(this, PaginaPerfil.class);
            i.putExtra("nuevoUsuario2", user);
            startActivity(i);

        }
        else {
            Context context = getApplicationContext();
            CharSequence text = "Contraseña Equivocada!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    //TODO: Actualizar los extras, desde un serializable a un arreglo de serializables y que lo recorra todo el login.

    public void pasarVentanaRegistro(View view){
            Intent intent = new Intent(this, RegistroGeneral.class);
            startActivity(intent);
    }

}
