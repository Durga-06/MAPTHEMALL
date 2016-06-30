package com.example.kiran.mapthemall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Login extends AppCompatActivity {
    EditText pass, user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pass = (EditText) findViewById(R.id.editText2);
        user = (EditText) findViewById(R.id.editText);




    }
    public void login(View v)
    {


        if (user.getText().toString().equals("durga") && pass.getText().toString().equals("123456")) {
            Intent i = new Intent(Login.this, ListDisplay.class);
            startActivity(i);

        }
    }


}
