package com.example.aluno.filmesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btLogin;
    TextView tvEmail, tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBinds();
    }

    private void setupBinds() {
        btLogin = findViewById(R.id.btLogin);
        tvEmail = findViewById(R.id.tvEmail);
        tvSenha = findViewById(R.id.tvPassword);
    }

}
