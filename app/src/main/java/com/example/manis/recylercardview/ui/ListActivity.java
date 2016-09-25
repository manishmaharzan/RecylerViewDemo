package com.example.manis.recylercardview.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.manis.recylercardview.R;
import com.example.manis.recylercardview.adapter.MyAdapter;

public class ListActivity extends Activity
{
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_list);
       // recyclerView.setHasFixedSize(true);

        //settting up layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Setting up a hardCoded Data
        String [] listItem =new String[14];
        for(int i=0;i<14;i++)
        {
            listItem[i]=Integer.toString(i);
        }

        adapter = new MyAdapter(listItem);
        recyclerView.setAdapter(adapter);

    }
}
