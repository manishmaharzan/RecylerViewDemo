package com.example.manis.recylercardview.adapter;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manis.recylercardview.R;
import com.example.manis.recylercardview.ui.EditFragment;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    String [] listItem ;
    private Context context;


    public ListAdapter(String listItem[])
    {
        this.listItem=listItem;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        context=parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textView.setText(listItem[position]);
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditFragment editFragment = new EditFragment();
                FragmentManager manager = ((Activity) context).getFragmentManager();
                FragmentTransaction fragmentTransaction= manager.beginTransaction();
                fragmentTransaction.replace(R.id.container,editFragment,"edit").
                        addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItem.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        CardView card;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView) itemView.findViewById(R.id.img_crd);
            card= (CardView) itemView;
        }
    }
}