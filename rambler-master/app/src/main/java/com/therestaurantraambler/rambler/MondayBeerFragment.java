package com.therestaurantraambler.rambler;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * The {@link Fragment} Monday Beer subclass.
 */
public class MondayBeerFragment extends Fragment {


    public MondayBeerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.specials_list, container, false);




        //Create an ArrayList of Restaurants offering wine specials on Mondays

        final ArrayList<Specials> mondayWineList = new ArrayList<Specials>();

        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 1", "Phone 1", "Specials 1", R.drawable.invite,"Map 1"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 2", "Phone 2", "Specials 2", R.drawable.invite, "Map 2"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 3", "Phone 3", "Specials 3", R.drawable.invite, "Map 3"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 4", "Phone 4", "Specials 4", R.drawable.invite, "Map 4"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 5", "Phone 5", "Specials 5", R.drawable.invite, "Map 5"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 6", "Phone 6", "Specials 6", R.drawable.invite, "Map 6"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 7", "Phone 7", "Specials 7", R.drawable.invite, "Map 7"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 8", "Phone 8", "Specials 8", R.drawable.invite, "Map 8"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 9", "Phone 9", "Specials 9", R.drawable.invite, "Map 9"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 10", "Phone 10", "Specials 10", R.drawable.invite, "Map 10"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 11", "Phone 11", "Specials 11", R.drawable.invite, "Map 11"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 12", "Phone 12", "Specials 12", R.drawable.invite, "Map 12"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 13", "Phone 13", "Specials 13", R.drawable.invite, "Map 13"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 14", "Phone 14", "Specials 14", R.drawable.invite, "Map 14"));
        mondayWineList.add(new Specials(R.drawable.beer, "Restaurant 15", "Phone 15", "Specials 15", R.drawable.invite, "Map 15"));




        //Create arrayAdapter to recycle views. This uses a single item in monday Wine List.

        // Create a {@link SpecialsAdapter}, whose data source is a list of {@link Specials}s. The
        // adapter knows how to create list items for each item in the list.
        SpecialsAdapter mondayWineListItemAdapter = new SpecialsAdapter(getActivity(), mondayWineList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SpecialsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Specials} in the list.

        listView.setAdapter(mondayWineListItemAdapter);



        return rootView;
    }
}



