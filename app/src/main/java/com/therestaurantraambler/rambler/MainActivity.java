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


        //Find the view that shows the Tuesday category.

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


        //Find the view that shows the Wednesday category.

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


        //Find the view that shows the Thursday category.

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


        //Find the view that shows the Friday category.

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


        //Find the view that shows the Saturday category.

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


        //Find the view that shows the Sunday category.

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


        //Find the view that shows the Trivia category.

        TextView trivia = (TextView) findViewById(R.id.trivia);

        // Set the onClickListener to that view.
        trivia.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Sunday button is pressed.
            @Override
            public void onClick(View view) {
                Intent triviaIntent = new Intent(MainActivity.this, TriviaActivity.class);
                startActivity(triviaIntent);
            }
        });

        //Find the view that shows the Brunch category.

        TextView brunch = (TextView) findViewById(R.id.brunch);

        // Set the onClickListener to that view.
        brunch.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Sunday button is pressed.
            @Override
            public void onClick(View view) {
                Intent brunchIntent = new Intent(MainActivity.this, BrunchActivity.class);
                startActivity(brunchIntent);
            }
        });

//Find the view that shows the Reward category.

        TextView reward = (TextView) findViewById(R.id.reward);

        // Set the onClickListener to that view.
        reward.setOnClickListener(new View.OnClickListener()

        {
            // This method will execute when the Rewards Program button is pressed.
            @Override
            public void onClick(View view) {
                Intent rewardIntent = new Intent(MainActivity.this, RewardActivity.class);
                startActivity(rewardIntent);
            }
        });



        //Find the view that shows the Find Specials Near Me category.

        TextView nearMeMap = (TextView) findViewById(R.id.nearMe);

        // Set the onClickListener to that view.
        nearMeMap.setOnClickListener(new View.OnClickListener() {
            // This method will execute when the Find Specials Near Me button is pressed.
            @Override
            public void onClick(View view) {
                Intent nearMeMapIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(nearMeMapIntent);
            }
        });



    }
}
