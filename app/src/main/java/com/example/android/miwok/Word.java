package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private Integer imageResourceID;
    private Integer audioResourceID;
    private Boolean isImageExist;


    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        isImageExist=false;
    }


    public Word(String defaultTranslation, String miwokTranslation,Integer audioResourceID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceID = audioResourceID;
        isImageExist=false;
    }

    public Word(String defaultTranslation, String miwokTranslation,Integer imageResourceID,Integer audioResourceID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
        isImageExist=true;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public Integer getImageResourceID() {
        return imageResourceID;
    }

    public Integer getAudioResourceID() {
        return audioResourceID;
    }

    public Boolean getImageExist() {
        return isImageExist;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceID=" + imageResourceID +
                ", audioResourceID=" + audioResourceID +
                ", isImageExist=" + isImageExist +
                '}';
    }
}
