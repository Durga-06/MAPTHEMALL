package com.example.kiran.mapthemall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapTheMall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_the_mall);
        Thread d=new Thread(){

            public void run () {
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    finish();
                }
                Intent i = new Intent(getBaseContext(), Login.class);
                startActivity(i);
            }


        };


        d.start();
    }
}
