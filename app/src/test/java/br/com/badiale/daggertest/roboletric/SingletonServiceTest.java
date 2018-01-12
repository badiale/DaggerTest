package br.com.badiale.daggertest.roboletric;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import javax.inject.Inject;

import br.com.badiale.daggertest.Service;
import br.com.badiale.daggertest.SingletonService;

import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class SingletonServiceTest {
    @Inject
    SingletonService singletonService1;

    @Inject
    SingletonService singletonService2;

    @Inject
    Service service1;

    @Inject
    Service service2;

    @Before
    public void before() {
        DaggerTestComponent.create().inject(this);
    }

    @Test
    public void shouldBeSingleton() {
        assertTrue("deveriam ser instancias iguais", singletonService1 == singletonService2);
    }

    @Test
    public void shouldNotBeSingleton() {
        assertTrue("deveriam ser instancias diferentes", service1 != service2);
    }
}
