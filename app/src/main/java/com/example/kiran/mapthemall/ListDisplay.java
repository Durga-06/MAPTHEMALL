package com.example.kiran.mapthemall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/*import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;*/

public class ListDisplay extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    // private GoogleApiClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_list_display);
        String[] smalls = {"CENTRAL", "LIFE STYLE", "FORUM MALL", "INORBIT MALL"};

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, smalls);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String smalls1 = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ListDisplay.this, smalls1, Toast.LENGTH_LONG).show();
                        if(position ==0) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), CENTRAL.class);
                            startActivityForResult(myIntent, 0);

                        }
                        /*else
                        if(position ==1) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), CENTRAL.class);
                            startActivityForResult(myIntent, 1);

                        }
                        else
                        if(position ==2) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), CENTRAL.class);
                            startActivityForResult(myIntent, 2);

                        }*/




                    }

                });
    }
}
