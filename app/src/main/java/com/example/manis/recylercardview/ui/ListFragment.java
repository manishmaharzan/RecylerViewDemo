package com.example.manis.recylercardview.ui;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.manis.recylercardview.R;
import com.example.manis.recylercardview.adapter.ListAdapter;

public class ListFragment extends Fragment {

    private Context context;
    private ListAdapter adapter;
    private View rootView;
    private RecyclerView recyclerView;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.rec_list);
        // recyclerView.setHasFixedSize(true);

        //settting up layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Setting up a hardCoded Data
        String[] listItem = new String[14];
        for (int i = 0; i < 14; i++) {
            listItem[i] = Integer.toString(i);
        }

        adapter = new ListAdapter(listItem);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
