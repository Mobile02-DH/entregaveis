package leo.dh.exercicioo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SenderActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNome;
    String arquivoNome;
    EditText txtSobrenome;
    String arquivoSobrenome;
    EditText txtIdade;
    String arquivoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        btnEnviar = findViewById(R.id.btnEnviar);
        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtIdade = findViewById(R.id.txtIdade);

    }

    public void EnviarDados (View view) {

        Intent receptor = new Intent(this, ReceptorActivity.class);
        Bundle dadosDeNome = new Bundle();
        arquivoNome = txtNome.getText().toString();
        arquivoSobrenome = txtSobrenome.getText().toString();
        arquivoIdade = txtIdade.getText().toString();

        dadosDeNome.putString("nome", arquivoNome);
        dadosDeNome.putString("sobreNome",arquivoSobrenome);
        dadosDeNome.putString("idade",arquivoIdade);


        receptor.putExtras(dadosDeNome);

        startActivity(receptor);
    }

}
