package com.example.gaurav.recyclertest2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by GAURAV on 03-06-2018.
 */

public class AdapetClass extends RecyclerView.Adapter<AdapetClass.NumberViewHolder> {
    int number;
    Context contect;

    public AdapetClass(int num, Context mContext){
        number = num;
        contect = mContext;
    }
    @Override
    public AdapetClass.NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Context contrext = parent.getContext();
        //int layoutid = R.layout.number_view;
        LayoutInflater inflater = LayoutInflater.from(contect);
        View view = inflater.inflate(R.layout.guest_list_item, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapetClass.NumberViewHolder holder, int position) {
        holder.txt.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return number;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{
            TextView txt;
        public NumberViewHolder(View itemView) {
            super(itemView);
            txt = (TextView) itemView.findViewById(R.id.name_text_view);
        }
    }
}
