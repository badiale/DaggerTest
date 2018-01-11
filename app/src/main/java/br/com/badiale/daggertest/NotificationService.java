package br.com.badiale.daggertest;

import android.support.v4.app.NotificationManagerCompat;

import javax.inject.Inject;

public class NotificationService {
    private final NotificationManagerCompat notificationManager;

    @Inject
    NotificationService(final NotificationManagerCompat notificationManager) {
        this.notificationManager = notificationManager;
    }

    public boolean injected() {
        return notificationManager != null;
    }
}
