package com.example.ricardo.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText nome;
    String arquivoNome;
    EditText senha;
    String arquivoSenha;
    EditText confSenha;
    String arquivoConfSenha;
    Button btnCofirmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nome = findViewById(R.id.edtNome);
        senha = findViewById(R.id.edtSenha);
        confSenha = findViewById(R.id.edtConfSenha);
    }

    public void confirmar(View view) {
        Intent registro = new Intent(this, MainActivity.class);
        Bundle agrupador = new Bundle();

        arquivoNome = nome.getText().toString();
        arquivoSenha = senha.getText().toString();
        arquivoConfSenha = confSenha.getText().toString();

        if (arquivoNome.equals("")) {

            Toast.makeText(this, "Nome é obrigatorio", Toast.LENGTH_LONG).show();

        }else if (arquivoSenha.equals("")) {
            Toast.makeText(this,"Senha é obrigatoria",Toast.LENGTH_LONG).show();

        }else if  (!arquivoSenha.equals(arquivoConfSenha)) {
            Toast.makeText(this, "Senhas estão diferentes", Toast.LENGTH_LONG).show();

        } else {


            registro.putExtras(agrupador);
            startActivity(registro);


        }
    }

}