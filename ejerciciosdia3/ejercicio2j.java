import java.util.Scanner;

public class ejercicio2j {

    public static void main(String[] args) {

        String calificacion = "Desconocida";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la calificación (A, B, C, D, F): ");
        switch (scanner.nextLine().toUpperCase()) {
            case "A":
                calificacion = "Excelente";
                break;
            case "B":
                calificacion = "Muy buena";
                break;
            case "C":
                calificacion = "Buena";
                break;
            case "D":
                calificacion = "Suficiente";
                break;
            case "F":
                calificacion = "Reprobado";
                break;

        }

        System.out.println("La calificación es: " + calificacion);
    }
}        