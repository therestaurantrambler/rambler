package com.therestaurantraambler.rambler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MondayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);


        //Create the arrayList for Monday Specials info
        final ArrayList<Specials> mondaySpecial = new ArrayList<Specials>();

        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 1", "Phone 1", "Specials 1", R.drawable.invite, "Map 1"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 2", "Phone 2", "Specials 2", R.drawable.invite, "Map 2"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 3", "Phone 3", "Specials 3", R.drawable.invite, "Map 3"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 4", "Phone 4", "Specials 4", R.drawable.invite, "Map 4"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 5", "Phone 5", "Specials 5", R.drawable.invite, "Map 5"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 6", "Phone 6", "Specials 6", R.drawable.invite, "Map 6"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 7", "Phone 7", "Specials 7", R.drawable.invite, "Map 7"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 8", "Phone 8", "Specials 8", R.drawable.invite, "Map 8"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 9", "Phone 9", "Specials 9", R.drawable.invite, "Map 9"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 10", "Phone 10", "Specials 10", R.drawable.invite, "Map 10"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 11", "Phone 11", "Specials 11", R.drawable.invite, "Map 11"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 12", "Phone 12", "Specials 12", R.drawable.invite, "Map 12"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 13", "Phone 13", "Specials 13", R.drawable.invite, "Map 13"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 14", "Phone 14", "Specials 14", R.drawable.invite, "Map 14"));
        mondaySpecial.add(new Specials(R.drawable.mon, "Restaurant 15", "Phone 15", "Specials 15", R.drawable.invite, "Map 15"));


        /* Create a new Array Adpater whose data type is from the Specials custom class. The adapter is named
            specialsAdapter. The specialsAdapter will create layouts for the mondaySpecial array
             defined above.
         */
        SpecialsAdapter itemsAdapter = new SpecialsAdapter(this, mondaySpecial);


        /* Find the view of activity_monday.xml called mondayList. Create a new ListView called
            mondayListView created by activity_monday.xml
         */

        ListView mondayListView = (ListView) findViewById(R.id.mondayList);

        /* Set the itemsAdapter on mondayListView*/

        mondayListView.setAdapter(itemsAdapter);

        mondayListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /* Get the {@link mondaySpecial} object at the given position the user clicked on
                Specials specials = mondaySpecial.get(position);
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


                Intent intentsms = new Intent(Intent., Uri.parse("sms:" + "8477828215"));
                intentsms.putExtra("sms_body",
                        "Hi! Would you like to go out tonight? <Restaurant Name> has half price <specials>.");


                if (intentsms.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentsms);
                }
            }
        });


    }
}





