package com.rohfl.di;

import android.util.Log;

import javax.inject.Inject;

public class OtherObject {

    private final String TAG = "OtherObject";

    @Inject public OtherObject(OtherOtherObject otherOtherObject, SampleInterface sampleInterface) {
        Log.d(TAG, "OtherObject");
    }

}
