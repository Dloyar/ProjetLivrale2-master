package com.example.rayold.everydayneeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class fournisseurService extends AppCompatActivity {

    private static final String TAG = "fournisseurService";

    private Button buttonGoCalendar;
    private Button buttonSaveDate;
    private TimePicker pick;
    private TextView theDate;
    private String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_service);
        buttonGoCalendar = (Button) findViewById(R.id.btnCalendar);
        buttonSaveDate = (Button) findViewById(R.id.buttonSaveDate);
        pick =(TimePicker) findViewById(R.id.timePick);
        theDate = (TextView) findViewById(R.id.date);
        date = getIntent().getStringExtra("date");
        theDate.setText(date);

        buttonSaveDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent (fournisseurService.this, serviceList.class);
                startActivity(j);
            }
        });
        buttonGoCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fournisseurService.this, Calendar.class);
                startActivity(i);
            }
        });
    }


}
