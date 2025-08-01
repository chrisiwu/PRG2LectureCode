package at.ac.fhcampuswien.block02.examples.example04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostalAddressTest {
    @DisplayName("Pass zip codes 4 Vienna.")
    @ParameterizedTest // junit-jupiter-params dependency needed
    @ValueSource(ints = {1010, 1020, 1030}) // values that shall be tested
    public void zip_codes_4_vienna(int zip_code) { // will contain values from @ValueSource
        String actual = PostalAddress.getState(zip_code);

        String expected = "Wien";
        assertEquals(expected, actual);
    }
}