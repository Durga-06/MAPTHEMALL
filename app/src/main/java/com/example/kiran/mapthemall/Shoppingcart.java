package com.example.kiran.mapthemall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Shoppingcart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcart);
        String[] smalls = {"LEVIS", "KILLER", "PUMA", "LEE","ADIDAS","NIKE","FLYING MACHINE","REEBOK","PETER ENGLAND","ARROW","SIYARAM'S","RAYMONDS"};

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, smalls);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        String smalls1 = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Shoppingcart.this, smalls1, Toast.LENGTH_LONG).show();
                        if (position == 0)
                        {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), CENTRAL.class);
                            startActivityForResult(myIntent, 0);

                        }


                    }
                });
    }
}
