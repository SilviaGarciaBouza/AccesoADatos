package teoria.ej207_test_unitarios;

public class ConversorTemperatura {
	public double celsiusAFahrenheit(double celsius) {
        return (((celsius*9/5)+32));
	}

	public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
}