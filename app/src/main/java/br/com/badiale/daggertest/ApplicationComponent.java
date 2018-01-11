package br.com.badiale.daggertest;

import dagger.Component;

@Component(modules = {
        ApplicationModule.class,
        MainActivityModule.class
})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
