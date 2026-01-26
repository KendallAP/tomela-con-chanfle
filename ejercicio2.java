import java.util.Scanner;
import java.util.Random;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        int numeroadivinanza = random.nextInt(1001); 

        int[] intentos = new int[1000]; 

        int contadorIntentos = 0;

        boolean acertado = false;

        System.out.println("Adivine el número entre 0 y 1000");

        while (!acertado) {
            System.out.print("Ingrese su intento: ");

            int intento = scanner.nextInt();

            boolean repetido = false;

            for (int i = 0; i < contadorIntentos; i++) {

                if (intentos[i] == intento) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {

                System.out.println("Ya intento ese numero, pruebe con otro.");
                continue;
            }

            intentos[contadorIntentos] = intento;
            contadorIntentos++;

            if (intento < numeroadivinanza) {
                System.out.println("El número es MAYOR.");

            } else if (intento > numeroadivinanza) {

                System.out.println("El número es MENOR.");

            } else {

                acertado = true;

                System.out.println("Adivinaste el número en " + contadorIntentos + " intentos.");
            }
        }

        scanner.close();
    }
}

