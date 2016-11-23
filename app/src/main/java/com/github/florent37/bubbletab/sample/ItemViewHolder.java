package com.github.florent37.bubbletab.sample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cihan on 23.11.2016.
 */

class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView isim;
    ImageView resim;
    public ItemViewHolder(View itemView) {
        super(itemView);
        isim=(TextView)itemView.findViewById(R.id.card_isim);
        resim=(ImageView)itemView.findViewById(R.id.card_resim);
    }
}
