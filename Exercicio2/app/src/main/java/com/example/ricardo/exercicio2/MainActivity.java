package com.example.ricardo.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String arquivoName;
    EditText edtUsername;
    String arquivoPassword;
    EditText edtPassword;
    Button btnLogin;
    Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void entrar(View view) {

        Intent login = new Intent(this, LoginActivity.class);
        Bundle agrupador = new Bundle();

        arquivoName = edtUsername.getText().toString();
        arquivoPassword = edtPassword.getText().toString();

        if (arquivoName.equals("")) {
            Toast.makeText(this, "Nome obrigatorio", Toast.LENGTH_LONG).show();

        } else if (arquivoPassword.equals("")) {

            Toast.makeText(this, "Senha obrigatorio", Toast.LENGTH_LONG).show();
        } else {

            agrupador.putString("conteudo", arquivoName);
            agrupador.putString("conteudo1", arquivoPassword);

            login.putExtras(agrupador);
            startActivity(login);

        }
        }

        public void registrar (View view){

            Intent registro = new Intent(this, RegisterActivity.class);
            Bundle agrupador1 = new Bundle();

            registro.putExtras(agrupador1);
            startActivity(registro);
        }
    }
