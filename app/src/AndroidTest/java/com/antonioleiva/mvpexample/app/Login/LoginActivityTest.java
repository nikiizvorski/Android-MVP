package com.antonioleiva.mvpexample.app.Login;

import android.support.test.espresso.ViewAssertion;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import com.antonioleiva.mvpexample.app.R;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by NIKI on 7/31/2016.
 */
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mLoginTestRule =
            new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void testSetUsernameError() throws Exception {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.username)).perform(typeText("james"));
    }

    @Test
    public void testSetPasswordError() throws Exception {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.password)).perform(typeText("bond"));
    }

    @Test
    public void testNavigateToHome() throws Exception {
        onView(withId(R.id.username)).perform(typeText("james"));
        onView(withId(R.id.password)).perform(typeText("bond"));
        onView(withId(R.id.button)).perform(click());
    }

    @Test
    public void testOnClick() throws Exception {
        onView(withId(R.id.button)).perform(click());
    }
}