package com.charity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity6 extends Activity {

    ListView list;
    LazyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_six);

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
        adapter = new LazyAdapter(this, songsList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });

    }
}
