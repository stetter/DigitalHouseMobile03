package br.com.stetter.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button7;
    private TextView textViewResultado;
    private int resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button7 = findViewById(R.id.btn_7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = 10;
            }
        });

//        textViewResultado = findViewById(R.id.txtview_Resultado);
//
//        textViewResultado.setText(resultado);

    }
}
