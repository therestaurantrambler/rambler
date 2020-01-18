package com.therestaurantraambler.rambler;

/**
 * Created by Becca on 1/17/2020.
 */


//Create the class
public class Rewards {

    //declare private member variables excluding images.
    private String mRestaurantName;
    private String mPhone;
    private String mDetailA;
    private String mDetailB;
    private String mDetailC;
    private String mDetailD;
    private String mDetailE;


    // declare the private variable for the image. Initialize to a number that is outside range
    // image resource id.  That is , initialize to false.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //create the Rewards object (Constructor)
    //@mImageResourceId is the image of the restaurant
    //@mRestaurantName is the name of the establishment
    //@mPhone is the phone number of the restaurant
    //@mDetailA is the first detail of the reward program
    //@mDetailB is the second detail of the reward program
    //@mDetailC is the third detail of the reward program
    //@mDetailD is the fourth detail of the reward program
    //@mDetailE is the fifth detail of the reward program

    //Intitalize the global mVariables to the value that is passed in
    public Rewards (int imageResourceId, String restaurantName, String phone,
                     String detailA, String detailB, String detailC, String detailD,
                        String detailE ){

        mImageResourceId = imageResourceId;
        mRestaurantName = restaurantName;
        mPhone = phone;
        mDetailA = detailA;
        mDetailB = detailB;
        mDetailC = detailC;
        mDetailD = detailD;
        mDetailE = detailE;


    }

    //declare public methods to obtain values from private variables declared above.

    public int getImageResourceId() {return mImageResourceId;}
    public String getRestaurantName() {return mRestaurantName;}
    public String getPhone(){return mPhone;}
    public String getDetailA(){return mDetailA;}
    public String getDetailB(){return mDetailB;}
    public String getDetailC(){return mDetailC;}
    public String getDetailD(){return mDetailD;}
    public String getDetailE(){return mDetailE;}
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }






}

