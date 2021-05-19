package com.example.cadastrousuarios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cadastrousuarios.data.User;
import com.example.cadastrousuarios.data.UserViewModal;

public class MainActivity extends AppCompatActivity {
    private UserViewModal mUserViewModel;
    public static final int NEW_USER_ACTIVITY_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserViewModel = new ViewModelProvider(this).get(UserViewModal .class);


    }
    public void irParaLista(View view){

        Intent intent = new Intent(MainActivity.this, UsersList.class);
        startActivity(intent);
    }
    public void criarUser(View view){

        Intent intent = new Intent(MainActivity.this, Cadastro.class);
        startActivityForResult(intent, NEW_USER_ACTIVITY_REQUEST_CODE);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_USER_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            User user = new User();
            user.email = data.getStringExtra(Cadastro.EXTRA_EMAIL);
            user.nome = data.getStringExtra(Cadastro.EXTRA_NOME);
            mUserViewModel.insert(user);

        } else {
            Toast.makeText(
                    getApplicationContext(),
                    R.string.empty_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }
}