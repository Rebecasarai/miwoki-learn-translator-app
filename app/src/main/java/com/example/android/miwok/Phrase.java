package com.example.android.miwok;

/**
 * Created by Sevilla on 11/9/17.
 */

public class Phrase {
    private String english;
    private String miwoktransl;

    public Phrase(String english, String miwoktransl) {
        this.english = english;
        this.miwoktransl = miwoktransl;
    }

    public String getEnglish() {
        return english;
    }

    public String getMiwoktransl() {
        return miwoktransl;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setMiwoktransl(String miwoktransl) {
        this.miwoktransl = miwoktransl;
    }
}
