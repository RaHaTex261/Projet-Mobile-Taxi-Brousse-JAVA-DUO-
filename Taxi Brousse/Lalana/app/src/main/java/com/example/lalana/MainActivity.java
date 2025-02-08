package com.example.lalana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button maki;
    private Button fasankarana;
    static ArrayList<String> axes=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maki=findViewById(R.id.maki);
        fasankarana=findViewById(R.id.fskrana);
        Donnee.destinations.clear();
        Donnee.addAllDestination();
        maki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                axes.clear();
                axes.add("Nord");
                axes.add("Est");
                axes.add("Nord-Est");
                axes.add("Nord-Ouest");
                startActivity(new Intent(MainActivity.this, LisitraAxe.class));
            }
        });

        fasankarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                axes.clear();
                axes.add("Sud");
                axes.add("Sud-Est");
                axes.add("Ouest");
                axes.add("Sud-Ouest");
                startActivity(new Intent(MainActivity.this, LisitraAxe.class));
            }
        });

    }
}