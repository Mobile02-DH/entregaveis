package com.example.ricardo.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String arquivoNome;
    EditText edtNome;
    String arquivoSobrenome;
    EditText edtSobrenome;
    String arquivoIdade;
    EditText edtIdade;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtSobrenome = findViewById(R.id.edtSobrenome);
        edtIdade = findViewById(R.id.edtIdade);
    }

    public void enviar(View view) {

        Intent objetivo = new Intent(this, ReceptorActivity.class);
        Bundle agrupador = new Bundle();

        arquivoNome = edtNome.getText().toString();
        arquivoSobrenome = edtSobrenome.getText().toString();
        arquivoIdade = edtIdade.getText().toString();

        if (arquivoNome.equals("")) {

            Toast.makeText(this, "Nome è obrigatorio", Toast.LENGTH_LONG).show();

        } else if (arquivoSobrenome.equals("")) {

            Toast.makeText(this, "Colocar Sobrenome", Toast.LENGTH_LONG).show();

        } else if (arquivoIdade.equals("")){

            Toast.makeText(this, "Coloque sua idade",Toast.LENGTH_LONG).show();
        } else {

            agrupador.putString("conteudo", arquivoNome);
            agrupador.putString("conteudo1", arquivoSobrenome);
            agrupador.putString("conteudo2", arquivoIdade);

            objetivo.putExtras(agrupador);

            startActivity(objetivo);
        }
    }
}