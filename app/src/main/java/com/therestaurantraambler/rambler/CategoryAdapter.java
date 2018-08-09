package com.therestaurantraambler.rambler;

//Created by Becca on 8/9/18

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Specials} objects.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }



    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayWineFragment();
        } else if (position == 1) {
            return new MondayBeerFragment();
        } else if (position == 2) {
            return new MondayCocktailsFragment();
        } else if (position == 3) {
            return new MondayAppetizersFragment();
        } else {
            return new MondayCoffeeFragment();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }
}
