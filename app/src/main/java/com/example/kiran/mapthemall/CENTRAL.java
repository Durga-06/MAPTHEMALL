package com.example.kiran.mapthemall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CENTRAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);


    }

    /*public void cc(View v) {

        //if (user.getText().toString().equals("durga") && pass.getText().toString().equals("123456")) {
        Intent i = new Intent(CENTRAL.this, Central1.class);
        startActivity(i);

        //}
    }*/


    public void maps(View v) {


        //if (user.getText().toString().equals("durga") && pass.getText().toString().equals("123456")) {
        Intent i = new Intent(CENTRAL.this, Central1.class);
        startActivity(i);

        //}
    }
    public void stores(View v){
        Intent i1=new Intent(CENTRAL.this,Shoppingcart.class);
        startActivity(i1);

    }
    public void entertainment(View v){
        Intent i2=new Intent(CENTRAL.this,Entertainment.class);
        startActivity(i2);

    }


}


