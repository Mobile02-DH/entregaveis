package com.example.ricardo.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView edtBemVindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtBemVindo = findViewById(R.id.edtBemVindo);

        Intent saudacao = getIntent();
        Bundle agrupador = saudacao.getExtras();

        edtBemVindo.setText(agrupador.getString("conteudo"));



    }
}
