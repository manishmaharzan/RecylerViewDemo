package com.example.manis.recylercardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manis.recylercardview.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    String [] listItem ;

    public MyAdapter(String listItem[])
    {
        this.listItem=listItem;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(listItem[position]);
    }


    @Override
    public int getItemCount() {
        return listItem.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}