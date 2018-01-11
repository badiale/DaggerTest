package br.com.badiale.daggertest;

import dagger.Component;

@Component(modules = {
        ContextModule.class,
        ApplicationModule.class,
        ActivityModule.class
})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
