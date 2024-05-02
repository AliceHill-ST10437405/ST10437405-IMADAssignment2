package com.example.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity2>

    @Before
    fun setUp() {
        activityScenario = ActivityScenario.launch(MainActivity2::class.java)
    }

    @Test
    fun testFeedButton() {
        onView(withId(R.id.feedButton)).perform(click())
        // Add assertions to check if the feeding functionality works correctly
    }

    @Test
    fun testCleanButton() {
        onView(withId(R.id.cleanButton)).perform(click())
        // Add assertions to check if the cleaning functionality works correctly
    }

    @Test
    fun testPlayButton() {
        onView(withId(R.id.playButton)).perform(click())
        // Add assertions to check if the playing functionality works correctly
    }

    @After
    fun tearDown() {
        activityScenario.close()
    }
}
