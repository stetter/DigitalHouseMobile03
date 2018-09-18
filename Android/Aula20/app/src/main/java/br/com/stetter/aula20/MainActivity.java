package br.com.stetter.aula20;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "name";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";
    public static final int GET_RESULT = 200;

    private TextInputLayout textInputLayoutNome;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputLayoutNome = findViewById(R.id.txt_nome);
        textInputLayoutEmail = findViewById(R.id.txt_email);
        textInputLayoutPassword = findViewById(R.id.txt_password);
        btnRegister = findViewById(R.id.btn_cadastrar);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textInputLayoutNome.getEditText().getText().toString();
                String email = textInputLayoutEmail.getEditText().getText().toString();
                String password = textInputLayoutPassword.getEditText().getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString(NAME,name);
                bundle.putString(EMAIL,email);
                bundle.putString(PASSWORD,password);

                Intent intent = new Intent(MainActivity.this, MensagemActivity.class);
                intent.putExtras(bundle);

                startActivityForResult(intent, GET_RESULT);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GET_RESULT && resultCode == Activity.RESULT_OK){
            Toast.makeText(this,data.getStringExtra("resultado"), Toast.LENGTH_SHORT).show();
        }
    }
}
