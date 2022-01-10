package com.rohfl.di;

import android.util.Log;

import javax.inject.Inject;

public class SampleObject {

    private final String TAG = "SAMPLEOBJECT";

    @Inject
    public SampleObject(){
        Log.d(TAG, "SampleObject: Created");
    }

    public void hello() {
        Log.d(TAG, "hello: hello Method Called");
    }

}
