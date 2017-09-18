package com.example.android.miwok;

/**
 * Created by Rebeca on 11/8/17.
 * {@link Word} represents a vocabulary word that users want to learn.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId = NO_AUDIO_PROVIDED;

    /** Constant value that represents no image was provided for this word */
   private static final int NO_IMAGE_PROVIDED = -1;
    /** Constant value that represents no audio was provided for this word */
    private static final int NO_AUDIO_PROVIDED = -1;

    /*
    * Creates a new Word Object
    * @param defaultTranslation
    * @param miwokTranslation
    * @param  imageResourceId
    * @param audioResourceId is the resource ID for the audio file associated with this word
    *
    */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImageResourceId=imageResourceId;
        mAudioResourceId= audioResourceId;
    }

      /*
    * Creates a new Word Object
    * @param defaultTranslation
    * @param miwokTranslation
    * @param audioResourceId is the resource ID for the audio file associated with this word
    *
    */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId= audioResourceId;
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

    public void setPosition(int position) {
        this.mAudioResourceId = position;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
     public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
     }

    /**
     * Returns whether or not there is an audio for this word.
     */
    public boolean hasAudio() {
        return mAudioResourceId != NO_AUDIO_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
