package br.com.badiale.daggertest;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();

    @ContributesAndroidInjector
    abstract Main2Activity contributeMain2ActivityInjector();

    @ContributesAndroidInjector
    abstract NotificationActivity contributeNotificationActivityInjector();
}
