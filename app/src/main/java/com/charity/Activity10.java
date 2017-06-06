package com.charity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity10 extends AppCompatActivity {

    ListView list;
    LazyAdapter10 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);


        ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> s = new HashMap<String, String>();
        s.put("name", "name");
        s.put("det", "detail");

        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);
        songsList.add(s);

        list = (ListView) findViewById(R.id.list);

        // Getting adapter by passing xml data ArrayList
        adapter = new LazyAdapter10(this, songsList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });


    }
}
