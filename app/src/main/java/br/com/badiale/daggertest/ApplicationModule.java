package br.com.badiale.daggertest;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;

import dagger.Module;
import dagger.Provides;

@Module
class ApplicationModule {
    private final Context context;

    ApplicationModule(MyApplication context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }

    @Provides
    NotificationManagerCompat notificationManagerCompat() {
        return NotificationManagerCompat.from(context);
    }
}
