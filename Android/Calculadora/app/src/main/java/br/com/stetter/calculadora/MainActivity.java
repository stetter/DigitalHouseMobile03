package br.com.stetter.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button7;
    private Button button8;
    private TextView textViewResultado;
    private String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button7 = (Button) findViewById(R.id.btn_7);
        button8 = (Button) findViewById(R.id.btn_8);
        textViewResultado = findViewById(R.id.txtview_Resultado);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = "Deu certo";
                textViewResultado.setText(resultado);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = "Guilherme vai perder no pingue pongue!!!";
                textViewResultado.setText(resultado);
            }
        });
    }
}
