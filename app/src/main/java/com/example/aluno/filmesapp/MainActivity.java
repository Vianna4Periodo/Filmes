package com.example.aluno.filmesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btLogin, btSignUp;
    TextView tvEmail, tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBinds();
    }

    private void logar() {
        String email = tvEmail.getText().toString();
        String password = tvEmail.getText().toString();

        if ((email != null && !email.isEmpty()) && (password != null && !password.isEmpty())) {
            Toast message = Toast.makeText(this, "Fazendo login no sistema...", Toast.LENGTH_LONG);
            message.show();
        }
    }

    private void signUp() {
        Intent intent = new Intent(this, CadastroActivity.class);
        this.startActivity (intent);
    }

    private void setupBinds() {
        btLogin = findViewById(R.id.btLogin);
        tvEmail = findViewById(R.id.tvEmail);
        tvSenha = findViewById(R.id.tvPassword);
        btSignUp = findViewById(R.id.btSignUp);

        setupActions();
    }

    private void setupActions() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });

        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

}
