package com.example.manis.recylercardview.ui;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.manis.recylercardview.R;

public class EditFragment extends Fragment {

    static interface EditListener {
        void itemClicked(long id);
    } ;

    private EditListener listener;

    public EditFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_edit, container, false);
        ImageView image = (ImageView) v.findViewById(R.id.edit_img);

        image.setImageResource(R.drawable.edit_img);
        return v;
    }


}
