package com.example.jsonbirds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.jsonbirds.BirdsViewHolder.FAMILY_NAME;
import static com.example.jsonbirds.BirdsViewHolder.MEMBERS;

public class DisplayActivity extends AppCompatActivity {
    private TextView familyNameTextView;
    private TextView membersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_activty);

        familyNameTextView = findViewById(R.id.familyName_textView);
        membersTextView = findViewById(R.id.members_textView);

        Intent intent = getIntent();
        intent.getExtras();
        String familyName = intent.getStringExtra(FAMILY_NAME);
        String members = intent.getStringExtra(MEMBERS);

        familyNameTextView.setText(familyName);
        membersTextView.setText(members);

    }




}
