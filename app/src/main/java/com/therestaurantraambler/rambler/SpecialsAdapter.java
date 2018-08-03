package com.therestaurantraambler.rambler;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Becca on 8/2/2018.
 */


/**
 * Create a new {@link SpecialsAdapter} object.
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param specials is the list of {@link Specials}s to be displayed
 */

public class SpecialsAdapter extends ArrayAdapter<Specials> {

    public SpecialsAdapter(Context context, ArrayList<Specials> specials) {

        super(context, 0, specials);

    }


    /*
     * Define getView method
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /* Get the Specials object located at this position in the list */
        Specials currentSpecials = getItem(position);

        // Find the Restaurant Name TextView in the list_item.xml layout
        TextView restaurantNameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name_text_view);

        // Get the words name from the current Word object and
        // set this text on the name TextView
        restaurantNameTextView.setText(currentSpecials.getRestaurantName());

        // Find the address TextView in the list_item.xml layout
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        phoneTextView.setText(currentSpecials.getPhone());

        // Find the specials TextView in the list_item.xml layout
        TextView specialsTextView = (TextView) listItemView.findViewById(R.id.specials_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        specialsTextView.setText(currentSpecials.getSpecials());

        // Find the map TextView in the list_item.xml layout
        TextView mapTextView = (TextView) listItemView.findViewById(R.id.map_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        mapTextView.setText(currentSpecials.getMap());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the image resource ID from the current Specials object and
        // set the image to iconView
        if (currentSpecials.hasImage()) {
            iconView.setImageResource(currentSpecials.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView inviteButtonView = (ImageView) listItemView.findViewById(R.id.invite_button);

        // Get the image resource ID from the current Specials object and
        // set the image to iconView
        if (currentSpecials.hasImage()) {
            inviteButtonView.setImageResource(currentSpecials.getInviteButtonResourceId());
            inviteButtonView.setVisibility(View.VISIBLE);
        }
        else{
            inviteButtonView.setVisibility(View.GONE);
        }



        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 3 TextViews and  2 ImageViews)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
