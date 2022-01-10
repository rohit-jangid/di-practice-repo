package com.rohfl.di.modules;

import com.rohfl.di.SampleInterface;
import com.rohfl.di.SampleInterfaceImpl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class SampleInterfaceImplTwoModule{

    @Provides
    public SampleInterface getSampleInterfaceImpl(SampleInterfaceImpl sampleInterface) {
        return sampleInterface;
    }

}
