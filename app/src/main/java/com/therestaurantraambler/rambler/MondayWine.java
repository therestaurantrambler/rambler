package com.therestaurantraambler.rambler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MondayWine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday_wine);

        //Create an ArrayList of Restaurants offering wine specials on Mondays

        ArrayList<String> mondayWineList = new ArrayList<String>();

        mondayWineList.add("Dublin O'Neils");
        mondayWineList.add("Big Grove Tavern");
        mondayWineList.add("Seven Saints");
        mondayWineList.add("Baxter's American Grille");
        mondayWineList.add("Scotty's Brewhouse");
        mondayWineList.add("Farmhouse Restaurant inside Harvest Market");
        mondayWineList.add("SunSinger Wine and Spirits");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");
        mondayWineList.add("Restaurant");



        //Create the listview and array adapter for the Monday Wine List layout.
        //This will allow for view recycling.
        //The list item layout contains 1 image, 3 textviews, and invite button, thus need a custom
        //class to pass into the ArrayAdapter.

        ArrayAdapter<String> mondayWineListItemAdapter = new ArrayAdapter<String>(this,R.layout.list_item, mondayWineList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(mondayWineListItemAdapter);



    }

}
