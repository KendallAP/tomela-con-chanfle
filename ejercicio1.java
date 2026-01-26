import java.util.Scanner;
import java.util.Random;

public class ejercicio1 {
    
public static int encontrarMayor(int[][] matriz) {
    int mayor = matriz[0][0];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > mayor) {
                mayor = matriz[i][j];
            }
        }
    }

    return mayor;
}

public static int sumaresquinasmatriz(int[][] matriz) {
        int N = matriz.length;
        int suma = matriz[0][0] + matriz[0][N - 1] + matriz[N - 1][0] + matriz[N - 1][N - 1];
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz (N): ");
        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(21); 
            }
        }
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int sumaEsquinas = sumaresquinasmatriz(matriz);

        System.out.println("La suma de las esquinas es: " + sumaEsquinas);

        int mayor = encontrarMayor(matriz);

        System.out.println("El mayor elemento de la matriz es: " + mayor);

        scanner.close();
    }
}
