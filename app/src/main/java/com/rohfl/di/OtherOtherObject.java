package com.rohfl.di;

import android.util.Log;

import javax.inject.Inject;

public class OtherOtherObject {

    private final String TAG = "OtherOtherObject";

    @Inject
    public OtherOtherObject() {
        Log.d(TAG, "OtherOtherObject");
    }

}
