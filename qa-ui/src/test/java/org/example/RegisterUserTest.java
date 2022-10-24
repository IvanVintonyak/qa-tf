package org.example;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.assertj.core.api.Assertions;
import org.example.constants.EpicConstants;
import org.example.constants.TestConstants;
import org.example.pages.MainPage;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseTest {

    @Issue("BUG-8596")
    @Epic(EpicConstants.SOME_EPIC)
    @Feature("Feature 1")
    @Test
    public void registerUserTest() {
        MainPage mainPage = new MainPage(getWebDriver())
                .open()
                .registerRandomUser();
        Assertions.assertThat(mainPage.isUserLoggedIn())
                .withFailMessage("User cannot log in to the system")
                .isFalse();
    }
}
