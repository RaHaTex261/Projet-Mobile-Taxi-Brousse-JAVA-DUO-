package com.example.lalana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LisitraAxe extends AppCompatActivity {
    static ArrayList<String> destination=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisitra_axe);
        ListView listeView=findViewById(R.id.lstAxe);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,MainActivity.axes);
        listeView.setAdapter(adapter);

        listeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valeur=adapterView.getItemAtPosition(i).toString();
                destination.clear();

                for (Destination d:Donnee.destinations
                     ) {
                    if(d.getAxe().equals(valeur)){
                        destination.add(d.getDestination());
                    }
                }
                startActivity(new Intent(LisitraAxe.this, LisitraDestination.class));
            }
        });
    }
}