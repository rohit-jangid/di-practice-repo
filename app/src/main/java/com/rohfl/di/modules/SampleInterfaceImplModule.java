package com.rohfl.di.modules;

import com.rohfl.di.SampleInterface;
import com.rohfl.di.SampleInterfaceImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class SampleInterfaceImplModule {

    @Binds
    public abstract SampleInterface getSampleInterfaceImpl(SampleInterfaceImpl sampleInterfaceImpl);

}
