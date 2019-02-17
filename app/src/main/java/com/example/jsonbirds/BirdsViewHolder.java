package com.example.jsonbirds;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BirdsViewHolder extends RecyclerView.ViewHolder {
    public static final String FAMILY_NAME = "family name";
    public static final String MEMBERS = "members" ;
    private TextView familyNameTextView;

    public BirdsViewHolder(@NonNull View itemView) {
        super(itemView);

        familyNameTextView = itemView.findViewById(R.id.bird_name_textview);
    }

    public void onBind(final Bird bird){
        familyNameTextView.setText(bird.getFamily());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(), DisplayActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(FAMILY_NAME,bird.getFamily());
                bundle.putString(MEMBERS, String.valueOf(bird.getMembers()));
                intent.putExtras(bundle);
                itemView.getContext().startActivity(intent);


            }
        });
    }
}
