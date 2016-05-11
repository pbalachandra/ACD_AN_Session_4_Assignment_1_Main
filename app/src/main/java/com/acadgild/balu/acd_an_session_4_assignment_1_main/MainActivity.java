package com.acadgild.balu.acd_an_session_4_assignment_1_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    Button button_asc, button_desc;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_asc = (Button) findViewById(R.id.button_asc);
        button_desc = (Button) findViewById(R.id.button_desc);
        listView = (ListView) findViewById(R.id.listView);

        arrayList = new ArrayList<>();
        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");
        arrayList.add("June");
        arrayList.add("July");
        arrayList.add("August");
        arrayList.add("September");
        arrayList.add("October");
        arrayList.add("November");
        arrayList.add("December");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        button_asc.setOnClickListener(this);
        button_desc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.button_asc)
            Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        else
            Collections.sort(arrayList, Collections.reverseOrder());
        arrayAdapter.notifyDataSetChanged();
    }
}
