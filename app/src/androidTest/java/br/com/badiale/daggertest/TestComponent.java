package br.com.badiale.daggertest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Component(modules = {
        TestComponent.ContextModule.class,
        ApplicationModule.class,
        ActivityModule.class
})
public interface TestComponent extends ApplicationComponent {
    void inject(ServiceInstrumentedTest test);

    @Module
    class ContextModule {
        @Provides
        Context context() {
            return InstrumentationRegistry.getContext();
        }
    }
}
