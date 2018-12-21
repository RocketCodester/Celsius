/*
 9/9/14
 JDK 1.7
 Convert Fahrenheit to Celsius
 */

public class Celsius {

    public static void main(String[] args) {
        //declare variables
        double fah = 100;
        double cel = 5.0 / 9 * (fah - 32);
        //output
        System.out.println("Fahrenheit: " + fah + "\nCelsius: " + cel);
    }
}
