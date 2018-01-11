package br.com.badiale.daggertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        final MainActivity activity = activityActivityTestRule.getActivity();
        assertNotNull("injection did not work", activity.service);
        assertNotNull("context not injected", activity.service.getContext());
        assertEquals("wrong context injected", activity.getApplicationContext(), activity.service.getContext());
    }
}
