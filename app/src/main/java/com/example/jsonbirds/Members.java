package com.example.jsonbirds;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Members {
    private List<String> members;

    public Members(List<String> members) {
        this.members = new ArrayList<>(members);
    }

    public List<String> getMembers() {
        return members;
    }

    @NonNull
    @Override
    public String toString() {
        return members.toString();
    }
}
