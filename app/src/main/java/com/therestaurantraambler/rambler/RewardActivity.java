package com.therestaurantraambler.rambler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RewardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        //Create the arrayList for Reward offerings info
        final ArrayList<Rewards> rewardSpecial = new ArrayList<Rewards>();

        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 1", "Phone 1", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 2", "Phone 2", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 3", "Phone 3", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 4", "Phone 4", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 5", "Phone 5", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 6", "Phone 6", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 7", "Phone 7", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));
        rewardSpecial.add(new Rewards(R.drawable.reward, "Restaurant 8", "Phone 8", "Detail A", "Detail B", "Detail C", "Detail D", "Detaiil E"));


        /* Create a new Array Adpater whose data type is from the Rewards custom class. The adapter is named
            rewardsAdapter. The rewardsAdapter will create layouts for the rewardsSpecial array
             defined above.
         */
        RewardsAdapter itemsAdapter = new RewardsAdapter(this, rewardSpecial);


        /* Find the view of activity_reward.xml called rewardList. Create a new ListView called
            rewardListView created by activity_reward.xml
         */

        ListView rewardListView = (ListView) findViewById(R.id.rewardList);

        /* Set the itemsAdapter on triviaListView*/

        rewardListView.setAdapter(itemsAdapter);

        //rewardListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           //`` @Override
            //public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /* Get the {@link rewardSpecial} object at the given position the user clicked on
                Specials specials = rewardSpecial.get(position);
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


               // Intent intentsms = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "8477828215"));
               // intentsms.putExtra("sms_body",
               //         "Hi! Would you like to go out? <Restaurant Name> has trivia on <day> at <time>.");


                //if (intentsms.resolveActivity(getPackageManager()) != null) {
                //    startActivity(intentsms);
                //}
        //    }
        //});





    }
}
