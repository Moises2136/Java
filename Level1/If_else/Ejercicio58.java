package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Triángulo equilátero, isósceles o escaleno
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio58 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado_1;
        double lado_2;
        double lado_3;

        System.out.println("Introduce la longitud del primer lado del triangulo");
        lado_1 = entrada.nextDouble();
        System.out.println("Introduce la longitud del segundo lado del triangulo");
        lado_2 = entrada.nextDouble();
        System.out.println("Introduce la longitud del tercer lado del triangulo");
        lado_3 = entrada.nextDouble();

        if (lado_1 == lado_2 && lado_2 == lado_3 && lado_1 == lado_3) {
            System.out.println("Es un triangulo Equilatero");
        } else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3) {
            System.out.println("Es un tringualo Isóceles");
        } else if (lado_1 != lado_2 && lado_2 != lado_3 && lado_1 != lado_3) {
            System.out.println("Es un triangulo Escaleno");
        }
    }
}
