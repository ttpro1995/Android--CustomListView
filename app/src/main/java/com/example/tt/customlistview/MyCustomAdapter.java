package com.example.tt.customlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TT on 12/31/2014.
 */
public class MyCustomAdapter extends ArrayAdapter<Data> {
    private Context context;
    private int resource;
    private ArrayList<Data> objects;

    //constructor
    public MyCustomAdapter(Context context, int resource, ArrayList<Data> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @Override //getView
    public View getView(int position, View convertView, ViewGroup parent) {
        View Item_view = convertView;
        if (Item_view==null)
        Item_view = new CustomViewGroup(getContext());

        //the data, which contain Title and Description
        Data myData = objects.get(position);

        //bind TextView
        TextView Title = ((CustomViewGroup)Item_view).TitleContent;
        TextView Description = ((CustomViewGroup)Item_view).DescriptionContent;

        //Set text fo TextView
        Title.setText(myData.getTitle());
        Description.setText(myData.getDescription());

        return Item_view;//return

    }
}
