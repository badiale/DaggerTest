package br.com.badiale.daggertest;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    @Provides
    NotificationManagerCompat notificationManagerCompat(Context context) {
        return NotificationManagerCompat.from(context);
    }
}
