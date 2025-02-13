package assignment.temperatureconverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private static TemperatureConverter converter;
    private double temperatureFahrenheit;
    private double temperatureCelsius;
    @BeforeAll
    static void beforeAll() {
        converter = new TemperatureConverter();
    }

    @ParameterizedTest
    @CsvSource({
            "32, 0.0",
            "212, 100.0",
            "-40, -40.0",
            "100, 37.78"
    })
    void testFahrenheitToCelsius(double input, double expected) {
        assertEquals(expected, converter.fahrenheitToCelsius(input), 0.01);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 32.0",
            "100, 212.0",
            "-40, -40.0",
            "37, 98.6"
    })
    void testCelsiusToFahrenheit(double input, double expected) {
        assertEquals(expected, converter.celsiusToFahrenheit(input), 0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(51)); // Above threshold
        assertTrue(converter.isExtremeTemperature(-41)); // Below threshold
        assertFalse(converter.isExtremeTemperature(25)); // Normal temperature
        assertFalse(converter.isExtremeTemperature(50)); // Edge case
        assertFalse(converter.isExtremeTemperature(-40)); // Edge case
    }
}