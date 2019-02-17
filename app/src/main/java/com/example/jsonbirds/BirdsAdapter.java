package com.example.jsonbirds;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class BirdsAdapter extends RecyclerView.Adapter<BirdsViewHolder> {
    private List<Bird> birdList;

    public BirdsAdapter(List<Bird> birdList) {
        this.birdList = birdList;
    }

    @NonNull
    @Override
    public BirdsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.birds_itemview,viewGroup,false);
        return new BirdsViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdsViewHolder birdsViewHolder, int i) {
        Bird bird = birdList.get(i);
        birdsViewHolder.onBind(bird);
    }

    @Override
    public int getItemCount() {
        return birdList.size();
    }
}
