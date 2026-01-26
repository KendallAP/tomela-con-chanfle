import java.util.Scanner;
public class ejercicio6 {
    public static boolean Edad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");

        int edad = scanner.nextInt();

        boolean MayorDeEdad = Edad(edad);

        if (MayorDeEdad) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
