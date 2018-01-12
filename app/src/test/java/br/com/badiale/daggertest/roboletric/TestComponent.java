package br.com.badiale.daggertest.roboletric;

import android.content.Context;

import org.robolectric.RuntimeEnvironment;

import javax.inject.Singleton;

import br.com.badiale.daggertest.ActivityModule;
import br.com.badiale.daggertest.ApplicationComponent;
import br.com.badiale.daggertest.ApplicationModule;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Singleton
@Component(modules = {
        TestComponent.ContextModule.class,
        ApplicationModule.class,
        ActivityModule.class
})
public interface TestComponent extends ApplicationComponent {
    void inject(ServiceInstrumentedTest test);
    void inject(SingletonServiceTest test);

    @Module
    class ContextModule {
        @Provides
        Context context() {
            return RuntimeEnvironment.application;
        }
    }
}
