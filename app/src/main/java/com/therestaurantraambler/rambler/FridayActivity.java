package com.therestaurantraambler.rambler;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FridayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        //Create the arrayList for Friday Specials info
        final ArrayList<Specials> fridaySpecial = new ArrayList<Specials>();

        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 1", "Phone 1", "Specials 1", R.drawable.invite, "Map 1"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 2", "Phone 2", "Specials 2", R.drawable.invite, "Map 2"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 3", "Phone 3", "Specials 3", R.drawable.invite, "Map 3"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 4", "Phone 4", "Specials 4", R.drawable.invite, "Map 4"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 5", "Phone 5", "Specials 5", R.drawable.invite, "Map 5"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 6", "Phone 6", "Specials 6", R.drawable.invite, "Map 6"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 7", "Phone 7", "Specials 7", R.drawable.invite, "Map 7"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 8", "Phone 8", "Specials 8", R.drawable.invite, "Map 8"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 9", "Phone 9", "Specials 9", R.drawable.invite, "Map 9"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 10", "Phone 10", "Specials 10", R.drawable.invite, "Map 10"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 11", "Phone 11", "Specials 11", R.drawable.invite, "Map 11"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 12", "Phone 12", "Specials 12", R.drawable.invite, "Map 12"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 13", "Phone 13", "Specials 13", R.drawable.invite, "Map 13"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 14", "Phone 14", "Specials 14", R.drawable.invite, "Map 14"));
        fridaySpecial.add(new Specials(R.drawable.fri, "Restaurant 15", "Phone 15", "Specials 15", R.drawable.invite, "Map 15"));


        /* Create a new Array Adpater whose data type is from the Specials custom class. The adapter is named
            specialsAdapter. The specialsAdapter will create layouts for the fridaySpecial array
             defined above.
         */
        SpecialsAdapter itemsAdapter = new SpecialsAdapter(this, fridaySpecial);


        /* Find the view of activity_friday.xml called fridayList. Create a new ListView called
            fridayListView created by activity_friday.xml
         */

        ListView fridayListView = (ListView) findViewById(R.id.fridayList);

        /* Set the itemsAdapter on fridayListView*/

        fridayListView.setAdapter(itemsAdapter);

        fridayListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /* Get the {@link fridaySpecial} object at the given position the user clicked on
                Specials specials = fridaySpecial.get(position);
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


                // user BoD suggests using Intent.ACTION_PICK instead of .ACTION_GET_CONTENT to avoid the chooser
                Intent intent = new Intent(Intent.ACTION_PICK);
                // BoD con't: CONTENT_TYPE instead of CONTENT_ITEM_TYPE
                intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
                startActivityForResult(intent, 1);
            }
        });
    }

    /*
    now, as soon as the user selects a contact (and probably chooses one of
    several phone numbers), you can retrieve the data the normal way:
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            Uri uri = data.getData();

            if (uri != null) {
                Cursor c = null;
                try {
                    c = getContentResolver().query(uri, new String[]{
                                    ContactsContract.CommonDataKinds.Phone.NUMBER,
                                    ContactsContract.CommonDataKinds.Phone.TYPE },
                            null, null, null);

                    if (c != null && c.moveToFirst()) {
                        String number = c.getString(0);
                        int type = c.getInt(1);
                        showSelectedNumber(type, number);
                    }
                } finally {
                    if (c != null) {
                        c.close();
                    }
                }
            }
        }



    }

    public void showSelectedNumber(int type, String number) {
        Toast.makeText(this, type + ": " + number, Toast.LENGTH_LONG).show();


        Intent intentsms = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + number));
        intentsms.putExtra("sms_body",
                "Hi! Would you like to go out tonight? <Restaurant Name> has half price <specials>.");


        if (intentsms.resolveActivity(getPackageManager()) != null) {
            startActivity(intentsms);
        }
    }


}