import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Consultar Saldo");

        System.out.println("2. Retirar");

        System.out.println("3. Salir");

        System.out.print("Elige una opción: ");

        String opcion = scanner.nextLine();
        switch (opcion) {
        case "1":
            System.out.println("Tu saldo es de $1000.");
            break;
        case "2":
            System.out.print("Ingresa la cantidad a retirar: ");

            String cantidad = scanner.nextLine();
            
            System.out.println("Has retirado $" + cantidad + ".");
            break;
        case "3":
            System.out.println("Saliendo del sistema.");
            break;
        }
    }
}
