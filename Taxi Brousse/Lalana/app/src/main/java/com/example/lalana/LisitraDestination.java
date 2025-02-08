package com.example.lalana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class LisitraDestination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisitra_destination);
        Spinner spr=findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, LisitraAxe.destination);
        spr.setAdapter(adapter);
        TextView txtDest=findViewById(R.id.idDest);
        TextView txtFrais=findViewById(R.id.idFrais);
        TextView txtDistance=findViewById(R.id.idDist);

        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Donnee.donnee.clear();
                String valeur=adapterView.getItemAtPosition(i).toString();
                for (Destination d:Donnee.destinations
                ) {
                    if(d.getDestination().equals(valeur)){
                        txtDistance.setText(d.getDistance());
                        txtDest.setText(d.getDestination());
                        txtFrais.setText(d.getFrais());
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Donnee.donnee.clear();
                String valeur=adapterView.getItemAtPosition(0).toString();
                for (Destination d:Donnee.destinations
                     ) {
                    if(d.getDestination().equals(valeur)){
                        txtDistance.setText(d.getDistance());
                        txtDest.setText(d.getDestination());
                        txtFrais.setText(d.getFrais());
                    }
                }
            }
        });
    }
}