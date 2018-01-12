package br.com.badiale.daggertest.roboletric;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import javax.inject.Inject;

import br.com.badiale.daggertest.Service;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class ServiceInstrumentedTest {
    @Inject
    Service service;

    @Before
    public void before() {
        DaggerTestComponent.create().inject(this);
    }

    @Test
    public void shouldInject() throws Exception {
        assertEquals("wrong context injected", service.getContext(), RuntimeEnvironment.application);
    }
}
