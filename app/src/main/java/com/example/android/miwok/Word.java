package com.example.android.miwok;

/**
 * Created by HP-PC on 19-01-2017.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE;

    private int mAudioResourceId;

    private static final int NO_IMAGE = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int aResource){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        mAudioResourceId = aResource;

    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int vResource,int aResource){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        mImageResourceId = vResource;
        mAudioResourceId = aResource;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
