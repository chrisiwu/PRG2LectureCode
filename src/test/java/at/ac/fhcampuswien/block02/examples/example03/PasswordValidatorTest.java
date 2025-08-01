package at.ac.fhcampuswien.block02.examples.example03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    // first Method called for one time for initialization purpose
    @BeforeAll
    static void initialize() {
    }

    // method called for each test method is called
    @BeforeEach
    void setUp() {
    }

    // test method including scenario 1 for method 1
    @Test
    @DisplayName("Has password valid length.")
    public void password_is_at_least_6_characters() {
        PasswordValidator pw = new PasswordValidator();
        assertTrue(pw.isValid("pw1234"));
    }

    // test method including scenario 1 for method 2
    @Test
    @DisplayName("Display login failed if password incorrect.")
    public void wrong_password_returns_login_failed() {
        PasswordValidator pw = new PasswordValidator();
        assertEquals("Login failed.", pw.showMessage(false));
    }

    // test if exceptions are thrown
    @Test
    @DisplayName("Throws exception when password is null.")
    public void throws_exception_when_password_is_null() {
        PasswordValidator pw = new PasswordValidator();
        assertThrows(IllegalArgumentException.class, () -> pw.isValid(null));
    }
}