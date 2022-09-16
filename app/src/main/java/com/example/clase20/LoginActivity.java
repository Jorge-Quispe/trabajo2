package com.example.clase20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText user, password;
    private Button btn;
    static final String userr = "jorgequispes@upeu.edu.pe";
    static final String passwordd = "aea123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.txtuser);
        password = findViewById(R.id.txtpass);
        btn = findViewById(R.id.button);
    }
    public void Ingresar (View v ){
        String username = user.getText().toString().trim();
        String p = password.getText().toString().trim();
        if (username.equals("") && p.equals("")){
            Toast.makeText(getApplicationContext(),"Ingresar Datos:",Toast.LENGTH_LONG).show();
        }else {
            if(username.equals(userr) && p.equals(passwordd)){

                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }else{
                Toast.makeText(getApplicationContext(), "Datos incorrectos" , Toast.LENGTH_LONG).show();
            }
        }
    }



}