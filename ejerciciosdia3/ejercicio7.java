import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero limite: ");

         numemerolimite = scanner.nextLine();

        for (int i = 1; i <= numemerolimite; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es un numero par.");
            } else {
                System.out.println(i + " es un numero impar.");
            }
        }

    
    }
    
}
