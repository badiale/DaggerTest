package br.com.badiale.daggertest;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;

import dagger.Module;
import dagger.Provides;

@Module
class ContextModule {
    private final Context context;

    ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
