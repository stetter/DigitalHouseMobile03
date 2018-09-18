package br.com.stetter.aula20;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static br.com.stetter.aula20.MainActivity.EMAIL;
import static br.com.stetter.aula20.MainActivity.GET_RESULT;
import static br.com.stetter.aula20.MainActivity.NAME;
import static br.com.stetter.aula20.MainActivity.PASSWORD;

public class MensagemActivity extends AppCompatActivity {

    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        textViewHello = findViewById(R.id.textViewHello);

        if (getIntent() != null && getIntent().getExtras() != null) {
            String name = getIntent().getStringExtra(NAME);
            String email = getIntent().getStringExtra(EMAIL);
            String password = getIntent().getStringExtra(PASSWORD);

            textViewHello.setText(name);
        }
    }

    public void calculate(View view) {
        Intent intent = new Intent();
        intent.putExtra("resultado", "Deu bom :)");

        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}
