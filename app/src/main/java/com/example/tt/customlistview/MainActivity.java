package com.example.tt.customlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ListView list;
    private String p_arr_Title[];
    private String p_arr_Des[];
    private ArrayList<Data> p_Arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p_Arr=new ArrayList<Data>();
        p_arr_Title = getResources().getStringArray(R.array.array_item_data);
        p_arr_Des = getResources().getStringArray(R.array.array_item_detail);
        for (int i =0;i<p_arr_Title.length;i++)
        {
            Data tmp= new Data(p_arr_Title[i],p_arr_Des[i]);
            p_Arr.add(tmp);
        }

        MyCustomAdapter adapter = new MyCustomAdapter(this,R.layout.list_item,p_Arr);
        list = (ListView) findViewById(R.id.MyListView);
       list.setAdapter(adapter);

    }


    
}
