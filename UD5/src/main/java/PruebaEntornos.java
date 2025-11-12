import java.time.LocalDateTime;
import java.util.Scanner;

public class PruebaEntornos {
    public static void main(String[] args) {

        final int anio = 2025;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento:");
        int anyo = sc.nextInt();

        
        System.out.println("Año actual: " + anio);
        LocalDateTime fechaActual = LocalDateTime.now();
        int edad = fechaActual.getYear() - anyo;
        System.out.println("---------------------------");
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
