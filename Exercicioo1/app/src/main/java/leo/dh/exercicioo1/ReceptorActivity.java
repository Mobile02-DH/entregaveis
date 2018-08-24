package leo.dh.exercicioo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtSobreNome;
    TextView txtIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        txtNome = findViewById(R.id.txtNome);
        txtSobreNome = findViewById(R.id.txtSobreNomee);
        txtIdade = findViewById(R.id.txtIdadee);

        Intent sender = getIntent();
        Bundle dadosDeNome = sender.getExtras();

         txtNome.setText(dadosDeNome.getString("nome"));
         txtSobreNome.setText(dadosDeNome.getString("sobreNome"));
         txtIdade.setText(dadosDeNome.getString("idade"));

    }
}
