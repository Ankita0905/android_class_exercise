package com.example.android_class_exercise;

import java.io.Serializable;

public class Marks implements Serializable
{
int mIos,mSwift,mAndroid,mJava,mDbms;

    public int getmIos(int i) {
        return mIos;
    }

    public void setmIos(int mIos) {
        this.mIos = mIos;
    }

    public int getmSwift(int i) {
        return mSwift;
    }

    public void setmSwift(int mSwift) {
        this.mSwift = mSwift;
    }

    public int getmAndroid() {
        return mAndroid;
    }

    public void setmAndroid(int mAndroid) {
        this.mAndroid = mAndroid;
    }

    public int getmJava() {
        return mJava;
    }

    public void setmJava(int mJava) {
        this.mJava = mJava;
    }

    public int getmDbms() {
        return mDbms;
    }

    public void setmDbms(int mDbms) {
        this.mDbms = mDbms;
    }
}
