import java.util.Scanner;
public class ejercicio5 {
    public static int generarTabla(int numero) {
        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero para generar tabla de multiplicar: ");

        int numero = scanner.nextInt();
        
        generarTabla(numero);
    }
}
