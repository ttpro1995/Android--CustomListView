package com.example.tt.customlistview;

import android.support.v4.view.PagerTitleStrip;

/**
 * Created by TT on 12/31/2014.
 */
public class Data {
    private String Title;
    private String Description;


    public Data(String description, String title) {
        Description = description;
        Title = title;
    }

    //default constructor
    public Data() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
