package com.rohfl.di;

import android.util.Log;

import javax.inject.Inject;

public class SampleInterfaceImpl implements SampleInterface{

    private final String TAG = "SAMPLEINTERFACEIMPL";

    @Inject
    public SampleInterfaceImpl() {
        helloThere();
    }

    @Override public void helloThere() {
        Log.d(TAG, "helloThere");
    }

}
