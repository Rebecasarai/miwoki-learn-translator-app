package com.example.android.miwok;

/**
 * Created by Rebeca on 11/8/17.
 * {@link Word} represents a vocabulary word that users want to learn.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int imageResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.imageResourceId=imageResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }



}
