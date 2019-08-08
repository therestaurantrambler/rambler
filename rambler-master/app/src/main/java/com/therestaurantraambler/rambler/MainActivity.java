package com.therestaurantraambler.rambler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the view that shows the Monday category.

        TextView monday = (TextView) findViewById(R.id.monday);

        // Set the onClickListener to that view.
        monday.setOnClickListener(new View.OnClickListener()

        {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent mondayIntent = new Intent(MainActivity.this, MondayActivity.class);
                startActivity(mondayIntent);
            }
        });


        //Find the view that shows the Tuesday catergory.

        TextView tuesday = (TextView) findViewById(R.id.tuesday);

        // Set the onClickListener to that view.
        tuesday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Tuesday button is pressed.
            @Override
            public void onClick(View view) {
                Intent tuesdayIntent = new Intent(MainActivity.this, TuesdayActivity.class);
                startActivity(tuesdayIntent);
            }
        });


        //Find the view that shows the Wednesday catergory.

        TextView wednesday = (TextView) findViewById(R.id.wednesday);

        // Set the onClickListener to that view.
        wednesday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Wednesday button is pressed.
            @Override
            public void onClick(View view) {
                Intent wednesdayIntent = new Intent(MainActivity.this, WednesdayActivity.class);
                startActivity(wednesdayIntent);
            }
        });


        //Find the view that shows the Thursday catergory.

        TextView thursday = (TextView) findViewById(R.id.thursday);

        // Set the onClickListener to that view.
        thursday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Thursday button is pressed.
            @Override
            public void onClick(View view) {
                Intent thursdayIntent = new Intent(MainActivity.this, ThursdayActivity.class);
                startActivity(thursdayIntent);
            }
        });


        //Find the view that shows the Friday catergory.

        TextView friday = (TextView) findViewById(R.id.friday);

        // Set the onClickListener to that view.
        friday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Friday button is pressed.
            @Override
            public void onClick(View view) {
                Intent fridayIntent = new Intent(MainActivity.this, FridayActivity.class);
                startActivity(fridayIntent);
            }
        });


        //Find the view that shows the Saturday catergory.

        TextView saturday = (TextView) findViewById(R.id.saturday);

        // Set the onClickListener to that view.
        saturday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Saturday button is pressed.
            @Override
            public void onClick(View view) {
                Intent saturdayIntent = new Intent(MainActivity.this, SaturdayActivity.class);
                startActivity(saturdayIntent);
            }
        });


        //Find the view that shows the Sunday catergory.

        TextView sunday = (TextView) findViewById(R.id.sunday);

        // Set the onClickListener to that view.
        sunday.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Sunday button is pressed.
            @Override
            public void onClick(View view) {
                Intent sundayIntent = new Intent(MainActivity.this, SundayActivity.class);
                startActivity(sundayIntent);
            }
        });

    }
}
