package br.com.badiale.daggertest;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ServiceInstrumentedTest {
    @Inject
    Service service;

    @Before
    public void before() {
        DaggerTestComponent.create().inject(this);
    }

    @Test
    public void shouldInject() throws Exception {
        assertEquals("wrong context injected", service.getContext(), InstrumentationRegistry.getContext());
    }
}
