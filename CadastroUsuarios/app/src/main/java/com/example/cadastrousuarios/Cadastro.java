package com.example.cadastrousuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
    public static final String EXTRA_EMAIL = "com.example.android.userlistsql.EXTRA_EMAIL";
    public static final String EXTRA_NOME = "com.example.android.userlistsql.EXTRA_NOME";
    private EditText mEditEmailView;
    private EditText mEditNomeView;
    private EditText mEditPasswordView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        mEditEmailView = findViewById(R.id.editTextTextEmailAddress);
        mEditNomeView = findViewById(R.id.editTextTextPersonName);
        mEditPasswordView = findViewById(R.id.editTextTextPassword);
    }
    public void cancelar(View view){
        finish();
    }
    public void salvar(View view){
        Intent replyIntent = new Intent();
        if (TextUtils.isEmpty(mEditEmailView.getText())) {
            setResult(RESULT_CANCELED, replyIntent);
        } else
        if (TextUtils.isEmpty( mEditNomeView.getText())) {
            setResult(RESULT_CANCELED, replyIntent);
        } else
            if (TextUtils.isEmpty(mEditPasswordView.getText())) {
            setResult(RESULT_CANCELED, replyIntent);
        } else{
            String name = mEditEmailView.getText().toString();
            String email =  mEditNomeView.getText().toString();
            replyIntent.putExtra(EXTRA_EMAIL, email);
            replyIntent.putExtra(EXTRA_NOME, name);
            setResult(RESULT_OK, replyIntent);
        }
        finish();
    }
}