package edu.sjsu.android.temperature;

public class ConverterUtil {

    //Convert to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5/9);
    }



    //Convert to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius * 9) / 5) + 32;
    }

}
