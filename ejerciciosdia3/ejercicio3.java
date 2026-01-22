import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la contrasena: ");

        String contrasena = "Java2024";
        while (true) {
            String ingreso = scanner.nextLine();
            if (ingreso.equals(contrasena)) {
                System.out.println("Acceso concedido.");
                break;
            } else {
                System.out.print("Contrasena incorrecta. Intenta de nuevo: ");
            }
        }
    
    
}}