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
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public ActivityTestRule<Main2Activity> main2ActivityRule = new ActivityTestRule<>(Main2Activity.class);

    @Rule
    public ActivityTestRule<NotificationActivity> notificationActivityRule = new ActivityTestRule<>(NotificationActivity.class);

    @Test
    public void shouldInjectOnMainActivity() throws Exception {
        final MainActivity activity = mainActivityRule.getActivity();
        assertNotNull("injection did not work", activity.service);
        assertNotNull("context not injected", activity.service.getContext());
        assertEquals("wrong context injected", activity.getApplicationContext(), activity.service.getContext());
    }

    @Test
    public void shouldInjectOnMain2Activity() throws Exception {
        final Main2Activity activity = main2ActivityRule.getActivity();
        assertNotNull("injection did not work", activity.service);
        assertNotNull("context not injected", activity.service.getContext());
        assertEquals("wrong context injected", activity.getApplicationContext(), activity.service.getContext());
    }

    @Test
    public void shouldInjectOnNotificationActivity() throws Exception {
        final NotificationActivity activity = notificationActivityRule.getActivity();
        assertNotNull("injection did not work", activity.notificationService);
        assertNotNull("injection did not work", activity.notificationService.injected());
    }
}
