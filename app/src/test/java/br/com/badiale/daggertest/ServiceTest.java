package br.com.badiale.daggertest;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
    @Mock
    private Context context;

    @InjectMocks
    private Service subject;

    @Test
    public void mockIsInjected() {
        assertEquals("Context was not injected", subject.getContext(), context);
    }
}