package com.github.florent37.bubbletab.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Cihan on 23.11.2016.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);

        ItemViewHolder itemviewholder = new ItemViewHolder(view);

        return itemviewholder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        holder.isim.setText(itemList.get(position).getIsim());
        holder.resim.setImageResource(itemList.get(position).getResim());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
