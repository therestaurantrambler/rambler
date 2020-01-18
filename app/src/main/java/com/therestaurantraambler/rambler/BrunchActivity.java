package com.therestaurantraambler.rambler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BrunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brunch);

        //Create the arrayList for Brunch offerings info
        final ArrayList<Specials> brunchSpecial = new ArrayList<Specials>();

        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 1", "Phone 1", "Day and Time 1", R.drawable.invite, "Map 1"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 2", "Phone 2", "Day and Time 2", R.drawable.invite, "Map 2"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 3", "Phone 3", "Day and Time 3", R.drawable.invite, "Map 3"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 4", "Phone 4", "Day and Time 4", R.drawable.invite, "Map 4"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 5", "Phone 5", "Day and Time 5", R.drawable.invite, "Map 5"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 6", "Phone 6", "Day and Time 6", R.drawable.invite, "Map 6"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 7", "Phone 7", "Day and Time 7", R.drawable.invite, "Map 7"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 8", "Phone 8", "Day and Time 8", R.drawable.invite, "Map 8"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 9", "Phone 9", "Day and Time 9", R.drawable.invite, "Map 9"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 10", "Phone 10", "Day and Time 10", R.drawable.invite, "Map 10"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 11", "Phone 11", "Day and Time 11", R.drawable.invite, "Map 11"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 12", "Phone 12", "Day and Time 12", R.drawable.invite, "Map 12"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 13", "Phone 13", "Day and Time 13", R.drawable.invite, "Map 13"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 14", "Phone 14", "Day and Time 14", R.drawable.invite, "Map 14"));
        brunchSpecial.add(new Specials(R.drawable.bloody_mary, "Restaurant 15", "Phone 15", "Day and Time 15", R.drawable.invite, "Map 15"));


        /* Create a new Array Adpater whose data type is from the Specials custom class. The adapter is named
            specialsAdapter. The specialsAdapter will create layouts for the brunchSpecial array
             defined above.
         */
        SpecialsAdapter itemsAdapter = new SpecialsAdapter(this, brunchSpecial);


        /* Find the view of activity_brunch.xml called triviaList. Create a new ListView called
            brunchListView created by activity_brunch.xml
         */

        ListView brunchListView = (ListView) findViewById(R.id.brunchList);

        /* Set the itemsAdapter on brunchListView*/

        brunchListView.setAdapter(itemsAdapter);

        brunchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /* Get the {@link triviaSpecial} object at the given position the user clicked on
                Specials specials = triviaSpecial.get(position);
                specials.getImageResourceId()    **But the image does not change. It is the invite
                                                      button. The message associated will change.
                the telephone associated will change as well:
                ACTION_VIEW content://contacts/people/
                 -- Display a list of people, which the user can browse through. This example
                 is a typical top-level entry into the Contacts application, showing you
                 the list of people. Selecting a particular person to view would result
                 in a new intent { ACTION_VIEW content://contacts/people/N }
                 being used to start an activity to display that person.
                */


                Intent intentsms = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "8477828215"));
                intentsms.putExtra("sms_body",
                        "Hi! Would you like to go out? <Restaurant Name> has trivia on <day> at <time>.");


                if (intentsms.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentsms);
                }
            }
        });


    }
}
