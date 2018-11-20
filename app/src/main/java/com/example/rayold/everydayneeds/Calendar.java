package com.example.rayold.everydayneeds;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class Calendar extends AppCompatActivity {
    private static final String TAG = "CalendarAct";
    private CalendarView mCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (month+1) + "/" + dayOfMonth + "/" + year;
                Log.d(TAG, "onSelectedDayChange: date:" + date);

                Intent intent = new Intent(Calendar.this, fournisseurService.class);
                intent.putExtra("date", date);

                startActivity(intent);
            }
        });
    }
}
