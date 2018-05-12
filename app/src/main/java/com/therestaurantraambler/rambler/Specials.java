package com.therestaurantraambler.rambler;

/**
 * Created by Becca on 4/15/2018.
 */

public class Specials {

    //declare private variables excluding images.
    private String mRestaurantName;
    private String mAddress;
    private String mSpecials;
    private int mInviteButtonResourceId;

    // declare the private variable for the image. Initialize to a number that is outside range
    // image resource id.  That is , initialize to false.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //create the Specials object
    public Specials (int imageResourceId, String restaurantName, String address,
                     String specials, int inviteButtonResourceId){

        mImageResourceId = imageResourceId;
        mRestaurantName = restaurantName;
        mAddress = address;
        mSpecials = specials;
        mInviteButtonResourceId = inviteButtonResourceId;

    }

    //declare public methods to obtain values from private variables declared above.

    public int getImageResourceId() {return mImageResourceId;}
    public String getRestaurantName() {return mRestaurantName;}
    public String getAddress(){return mAddress;}
    public String getSpecials(){return mSpecials;}
    public int getInviteButtonResourceId(){return mInviteButtonResourceId;}
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
