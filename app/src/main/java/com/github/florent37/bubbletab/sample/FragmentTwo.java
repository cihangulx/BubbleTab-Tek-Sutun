package com.github.florent37.bubbletab.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cihan on 23.11.2016.
 */

public class FragmentTwo extends Fragment{
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_two,container,false);
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        List<Item> itemList=new ArrayList<>();


        //Buraya itemleri ekleyeceksin abi
        itemList.add(new Item("Bu bir",R.drawable.itema));
        itemList.add(new Item("Bu iki",R.drawable.itemb));

        ItemAdapter itemAdapter=new ItemAdapter(itemList);

        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
