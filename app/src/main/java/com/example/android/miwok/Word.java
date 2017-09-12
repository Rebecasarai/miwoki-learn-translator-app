package com.example.android.miwok;

/**
 * Created by Rebeca on 11/8/17.
 * {@link Word} represents a vocabulary word that users want to learn.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
   private static final int NO_IMAGE_PROVIDED = -1;

    /*
    * Creates a new Word Object
    * @param defaultTranslation
    * @param miwokTranslation
    * @param  imageResourceId
    *
    */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImageResourceId=imageResourceId;
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
        return mImageResourceId;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }


    /**
     * Returns whether or not there is an image for this word.
     */
     public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
     }



}
