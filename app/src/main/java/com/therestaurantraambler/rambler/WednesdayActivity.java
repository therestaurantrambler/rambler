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

public class WednesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        //Create the arrayList for Wednesday Specials info
        final ArrayList<Specials> wednesdaySpecial = new ArrayList<Specials>();

        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 1", "Phone 1", "Specials 1", R.drawable.invite, "Map 1"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 2", "Phone 2", "Specials 2", R.drawable.invite, "Map 2"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 3", "Phone 3", "Specials 3", R.drawable.invite, "Map 3"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 4", "Phone 4", "Specials 4", R.drawable.invite, "Map 4"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 5", "Phone 5", "Specials 5", R.drawable.invite, "Map 5"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 6", "Phone 6", "Specials 6", R.drawable.invite, "Map 6"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 7", "Phone 7", "Specials 7", R.drawable.invite, "Map 7"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 8", "Phone 8", "Specials 8", R.drawable.invite, "Map 8"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 9", "Phone 9", "Specials 9", R.drawable.invite, "Map 9"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 10", "Phone 10", "Specials 10", R.drawable.invite, "Map 10"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 11", "Phone 11", "Specials 11", R.drawable.invite, "Map 11"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 12", "Phone 12", "Specials 12", R.drawable.invite, "Map 12"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 13", "Phone 13", "Specials 13", R.drawable.invite, "Map 13"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 14", "Phone 14", "Specials 14", R.drawable.invite, "Map 14"));
        wednesdaySpecial.add(new Specials(R.drawable.wed, "Restaurant 15", "Phone 15", "Specials 15", R.drawable.invite, "Map 15"));


        /* Create a new Array Adpater whose data type is from the Specials custom class. The adapter is named
            specialsAdapter. The specialsAdapter will create layouts for the @wednesdaySpecial array
             defined above.
         */
        SpecialsAdapter itemsAdapter = new SpecialsAdapter(this, wednesdaySpecial);


        /* Find the view of activity_wednesday.xml called wednesdayList. Create a new ListView called
            wednesdayListView created by activity_wednesday.xml
         */

        ListView wednesdayListView = (ListView) findViewById(R.id.wednesdayList);

        /* Set the itemsAdapter on wednesdayListView*/

        wednesdayListView.setAdapter(itemsAdapter);

        wednesdayListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /* Get the {@link wednesdaySpecial} object at the given position the user clicked on
                Specials specials = wednesdaySpecial.get(position);
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