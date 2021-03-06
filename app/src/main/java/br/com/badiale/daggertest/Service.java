package br.com.badiale.daggertest;

import android.content.Context;

import javax.inject.Inject;

public class Service {

    private final Context context;

    @Inject
    public Service(final Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
