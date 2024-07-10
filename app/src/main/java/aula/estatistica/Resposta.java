package aula.estatistica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Resposta extends AppCompatActivity {

    String texto;
    int vogais, consoantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        Bundle b = getIntent().getExtras();

        texto = b.getCharSequence("palavra").toString();

        EditText campo2 = (EditText) findViewById(R.id.consoantes);
        EditText campo3 = (EditText) findViewById(R.id.vogais);
        EditText campo4 = (EditText) findViewById(R.id.palindrome);

        vogais(texto);
        consoantes(texto);
        campo2.setText(String.valueOf(this.vogais));
        campo3.setText(String.valueOf(this.consoantes));
        campo4.setText(naoEhPalindrome(texto)?"Não é palindrome":"É palindrome");
    }

    public void vogais(String palavra){
        int vog=0;
        for(int i=0; i<palavra.length(); i++){
            if(palavra.charAt(i)=='a' || palavra.charAt(i)=='e' || palavra.charAt(i)=='i' || palavra.charAt(i)=='o' || palavra.charAt(i)=='u' ||
                    palavra.charAt(i)=='A' || palavra.charAt(i)=='E' || palavra.charAt(i)=='I' || palavra.charAt(i)=='O' || palavra.charAt(i)=='U')
                vog++;
        }
        this.vogais = vog;
    }

    public void consoantes(String palavra){
        this.consoantes = palavra.length() - this.vogais;
    }

    public boolean naoEhPalindrome(String palavra){
        for(int i=0; i<palavra.length()/2; i++){
            if(palavra.charAt(i)!=palavra.charAt(palavra.length()-1-i))
                return true;
        }
        return false;
    }
}
