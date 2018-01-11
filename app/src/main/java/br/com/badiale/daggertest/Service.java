package br.com.badiale.daggertest;

import android.content.Context;

public class Service {

    private final Context context;

    public Service(final Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
