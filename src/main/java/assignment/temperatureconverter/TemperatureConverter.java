package assignment.temperatureconverter;

public class TemperatureConverter {
    public TemperatureConverter() {

    }
    public double fahrenheitToCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32)*5/9;
    }
    public double celsiusToFahrenheit(double temperatureCelsius) {
        return (temperatureCelsius *9/5 + 32);
    }
    public boolean isExtremeTemperature(double temperatureCelsius) {
        return (temperatureCelsius > 50 || temperatureCelsius < -40);
    }
}
