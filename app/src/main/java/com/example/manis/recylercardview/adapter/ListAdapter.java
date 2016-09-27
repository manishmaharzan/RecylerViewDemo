package com.example.manis.recylercardview.adapter;

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

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    String [] listItem ;

    public ListAdapter(String listItem[])
    {
        this.listItem=listItem;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textView.setText(listItem[position]);

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"hello you just click me",Toast.LENGTH_LONG).show();
                Log.v("mylog", "Clicked");
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