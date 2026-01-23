import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el nombre del mes: ");

    String nombreDelMes = scanner.nextLine();

    switch (nombreDelMes) {
        case "enero":
            System.out.println("Tiene 31 días.");
            break;
        case "febrero":
            System.out.println("Tiene 28 días.");
            break;
        case "marzo":
            System.out.println("Tiene 31 días.");
            break;
        case "abril":
            System.out.println("Tiene 30 días.");
            break;
        case "mayo":
            System.out.println("Tiene 31 días.");
            break;
        case "junio":
            System.out.println("Tiene 30 días.");
            break;
        case "julio":
            System.out.println("Tiene 31 días.");
            break;
        case "agosto":
            System.out.println("Tiene 31 días.");
            break;
        case "septiembre":
            System.out.println("Tiene 30 días.");
            break;
        case "octubre":
            System.out.println("Tiene 31 días.");
            break;
        case "noviembre":
            System.out.println("Tiene 30 días.");
            break;
        case "diciembre":
            System.out.println("Tiene 31 días.");
            break;
    }
    }
}
