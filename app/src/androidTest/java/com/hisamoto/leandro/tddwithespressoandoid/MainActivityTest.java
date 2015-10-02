package com.hisamoto.leandro.tddwithespressoandoid;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 *
 * http://www.mobiltec.com.br/blog/index.php/testes-de-interface-com-o-espresso/
 * Tem que ter um dispositivo conectado como definido no Configuration Run
 *
 * @author Leandro Shindi Ekamoto
 *
 * */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldShowWelcomeText() {
        onView(
                withText("Welcome to TDD with Expresso")
        ).check(
                matches(
                        isDisplayed()
                )
        );
    }

    @Test
    public void verificaCampoTextoIdValor() {
        onView(
                withId(R.id.nome)
        ).check(
                matches(
                        allOf(
                                isDisplayed(),
                                withText("Leandro Shindi Ekamoto")
                        )
                )
        );
    }
}