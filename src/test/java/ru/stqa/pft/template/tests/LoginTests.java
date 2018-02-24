package ru.stqa.pft.template.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.template.appmanager.HttpSession;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {

    @Test
    public void testLogin() throws IOException {
        HttpSession session = app.newSession();
         assertTrue(session.login("username", "root"));
         assertTrue(session.isLoggedInAs("administrator"));
    }
}
