package com.example.android.miwok;

/**
 * Created by Rebeca on 11/8/17.
 * {@link Word} represents a vocabulary word that users want to learn.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation/*, int imageResourceId*/ ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

}
