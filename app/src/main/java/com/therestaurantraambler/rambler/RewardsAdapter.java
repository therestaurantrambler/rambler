package com.therestaurantraambler.rambler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Becca on 1/18/2020
 */


/**
 * Create a new {@link com.therestaurantraambler.rambler.RewardsAdapter} object.
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param rewards is the list of {@link Rewards}s to be displayed
 */

public class RewardsAdapter extends ArrayAdapter<Rewards> {



    public RewardsAdapter(Context context, ArrayList<Rewards> rewards) {

        super(context, 0, rewards);

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
                    R.layout.list_reward, parent, false);
        }

        /* Get the Rewards object located at this position in the list */
        Rewards currentRewards = getItem(position);

        // Find the Restaurant Name Rewards TextView in the list_rewards.xml layout
        TextView restaurantNameRewardsTextView = (TextView) listItemView.findViewById(R.id.restaurant_name_text_view_reward);

        // Get the rewards name from the current Rewards object and
        // set this text on the name TextView
        restaurantNameRewardsTextView.setText(currentRewards.getRestaurantName());

        // Find the phone TextView in the list_reward.xml layout
        TextView phoneRewardTextView = (TextView) listItemView.findViewById(R.id.phone_text_view_reward);
        // Get the phone number from the current Rewards object and
        // set this text on the phone TextView
        phoneRewardTextView.setText(currentRewards.getPhone());

        // Find the Detail A TextView in the list_reward.xml layout
        TextView detailATextView = (TextView) listItemView.findViewById(R.id.detailA_text_view);
        // Get Detail A from the current Rewards object and
        // set this text on the detailA TextView
        detailATextView.setText(currentRewards.getDetailA());

        // Find the Detail B TextView in the list_reward.xml layout
        TextView detailBTextView = (TextView) listItemView.findViewById(R.id.detailB_text_view);
        // Get Detail B from the current Rewards object and
        // set this text on the detailB TextView
        detailBTextView.setText(currentRewards.getDetailB());

        // Find the Detail C TextView in the list_reward.xml layout
        TextView detailCTextView = (TextView) listItemView.findViewById(R.id.detailC_text_view);
        // Get Detail C from the current Rewards object and
        // set this text on the detailC TextView
        detailCTextView.setText(currentRewards.getDetailC());

        // Find the Detail D TextView in the list_reward.xml layout
        TextView detailDTextView = (TextView) listItemView.findViewById(R.id.detailD_text_view);
        // Get Detail D from the current Rewards object and
        // set this text on the detailD TextView
        detailDTextView.setText(currentRewards.getDetailD());


        // Find the Detail E TextView in the list_reward.xml layout
        TextView detailETextView = (TextView) listItemView.findViewById(R.id.detailE_text_view);
        // Get Detail E from the current Rewards object and
        // set this text on the detailE TextView
        detailETextView.setText(currentRewards.getDetailE());



        // Find the ImageView in the list_reward.xml layout
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_reward);

        // Get the image resource ID from the current Rewards object and
        // set the image to iconView
        if (currentRewards.hasImage()) {
            iconView.setImageResource(currentRewards.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_reward.xml layout with the ID list_item_icon
        //ImageView inviteButtonView = (ImageView) listItemView.findViewById(R.id.invite_button);

        // Get the image resource ID from the current Specials object and
        // set the image to iconView
        //if (currentSpecials.hasImage()) {
        //    inviteButtonView.setImageResource(currentSpecials.getInviteButtonResourceId());
        //    inviteButtonView.setVisibility(View.VISIBLE);
        //}
        //else{
        //    inviteButtonView.setVisibility(View.GONE);
        //}



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
