package com.example.aluno.filmesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    Button btnSignUp;
    TextView tvEmail, tvPassword, tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setupBinds();
    }

    private void signUp() {
        String email = tvEmail.getText().toString();
        String password = tvPassword.getText().toString();
        String name = tvName.getText().toString();

        if ((email != null && !email.isEmpty()) &&
                (password != null && !password.isEmpty()) &&
                (name != null && !name.isEmpty())) {
            Toast message = Toast.makeText(this, "Cadastro feito com sucesso!!!", Toast.LENGTH_LONG);
            message.show();
        }
    }

    private void setupBinds() {
        btnSignUp = findViewById(R.id.btSignUp);
        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);
        tvName = findViewById(R.id.tvName);

        setupActions();
    }

    private void setupActions() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }
}
