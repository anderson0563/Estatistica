package aula.estatistica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Conta(View v){
        EditText CaixaTexto = (EditText) findViewById(R.id.campo);
        String texto = CaixaTexto.getText().toString();
        Button botao = (Button) findViewById(R.id.botao);
        Intent intent = new Intent (this , Resposta.class );
        Bundle b = new Bundle();
        b.putCharSequence("palavra", texto);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}
