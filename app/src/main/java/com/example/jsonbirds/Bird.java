package com.example.jsonbirds;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Bird {
    private String family;
    private Members members;

    public Bird(String family, Members members) {
        this.family = family;
        this.members = members;
    }

    public String getFamily() {
        return family;
    }

    public Members getMembers() {
        return members;
    }
}
