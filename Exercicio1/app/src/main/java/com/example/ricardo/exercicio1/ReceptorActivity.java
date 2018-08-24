package com.example.ricardo.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtSobrenome;
    TextView txtIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtIdade = findViewById(R.id.txtIdade);

        Intent recebedor = getIntent();
        Bundle agrupador = recebedor.getExtras();

        txtNome.setText(agrupador.getString("conteudo"));
        txtSobrenome.setText(agrupador.getString("conteudo1"));
        txtIdade.setText(agrupador.getString("conteudo2"));


    }
}
