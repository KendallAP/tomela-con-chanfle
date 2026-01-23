
import java.util.Scanner;
public class ejercicio4 {
    public static double CelciusAFarenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los grados celcius: ");

        double celcius = scanner.nextDouble();

        double farenheit = CelciusAFarenheit(celcius);

        System.out.println(celcius + " grados Celsius son " + farenheit + " grados");
        scanner.close();
        
        
    }
}