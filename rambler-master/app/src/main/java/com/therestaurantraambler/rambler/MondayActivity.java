package com.therestaurantraambler.rambler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MondayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekday);

        //Find the view that shows the Wine category.

        TextView wineMonday = (TextView) findViewById(R.id.wine_weekday);

        // Set the onClickListener to that view.
        wineMonday.setOnClickListener(new View.OnClickListener() {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent weekdayWineIntent = new Intent(MondayActivity.this, MondayWine.class);
                startActivity(weekdayWineIntent);
            }
        });


        //Find the view that shows the Beer category.

        TextView beerMonday = (TextView) findViewById(R.id.beer_weekday);

        // Set the onClickListener to that view.
        beerMonday.setOnClickListener(new View.OnClickListener()

        {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent weekdayBeerIntent = new Intent(MondayActivity.this, MondayBeer.class);
                startActivity(weekdayBeerIntent);
            }
        });


        //Find the view that shows the Wine category.

        TextView appetizersMonday = (TextView) findViewById(R.id.appetizer_weekday);

        // Set the onClickListener to that view.
        appetizersMonday.setOnClickListener(new View.OnClickListener() {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent weekdayAppetizersIntent = new Intent(MondayActivity.this, MondayAppetizers.class);
                startActivity(weekdayAppetizersIntent);
            }
        });

        //Find the view that shows the Cocktails category.

        TextView cocktailsMonday = (TextView) findViewById(R.id.cocktails_weekday);

        // Set the onClickListener to that view.
        cocktailsMonday.setOnClickListener(new View.OnClickListener() {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent weekdayCocktailsIntent = new Intent(MondayActivity.this, MondayCocktails.class);
                startActivity(weekdayCocktailsIntent);
            }
        });




        //Find the view that shows the Coffee category.

        TextView coffeeMonday = (TextView) findViewById(R.id.coffee_weekday);

        // Set the onClickListener to that view.
        coffeeMonday.setOnClickListener(new View.OnClickListener()

        {

            // This method will execute when the Monday button is pressed.
            @Override
            public void onClick(View view) {
                Intent weekdayCoffeeIntent = new Intent(MondayActivity.this, MondayCoffee.class);
                startActivity(weekdayCoffeeIntent);
            }
        });

    }
}



