package br.com.stetter.oraculorosetti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> mensagem = new ArrayList<>();
    private TextView viewMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem.add("Devemos seguir os procedimentos!!!");
        mensagem.add("Quem foi que disse isso?");
        mensagem.add("Mas isso é uma palhaçada!!!");
        mensagem.add("Onde está escrito isso???");
        mensagem.add("Se não pode convence-los, confunda-os!!!");
        mensagem.add("Me sinto abichornado!!!");
        mensagem.add("Hein???");
        mensagem.add("Para os amigos tudo, para os inimigos a lei!!!");
        mensagem.add("Agradeço minha grande amiga Margarida!!!");
        mensagem.add("Vocês vão ter que me engolir!!!");


    }

    public void previsao(View view) {

        Random gerador = new Random();

        viewMensagem = (TextView) findViewById(R.id.mensagem);
        viewMensagem.setText(mensagem.get(gerador.nextInt(10)));

    }
}
