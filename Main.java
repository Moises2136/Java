
// importamos las clases necesarias para el programa
import Level1.Fundamentos;
import Level2.Arrays_Strings;
import Level3.POO;
import Level4.Recursion_Busqueda_Ordenamiento;
import Level5.Estructuras_lineales;
import Level6.Arboles_Grafos;
import Level7.Avanzado;
import Level8.Servicios_APIs;

import java.util.Scanner; //importamos la clase Scanner para leer la entrada del usuario

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" --------------------------- MENU --------------------------- ");
            System.out.println("Bienvenido al programa de Java");
            System.out.println("Seleccione una opción del menú:");
            System.out.println("1. Nivel 1 Fundamentos" + "\n2. Nivel 2 Arrays y Strings" + "\n3. Nivel 3 POO"
                    + "\n4. Nivel 4 Recursion Busqueda y Ordenamiento" + "\n5. Nivel 5 Estructuras Lineales"
                    + "\n6. Nivel 6 Arboles y Grafos" + "\n7. Nivel 7 Avanzado" + "\n8. Nivel 8 Servicios API´s"
                    + "\n0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entrando al Nivel 1 ...");
                    Fundamentos.main(args);
                    break;
                case 2:
                    System.out.println("Entrando al Nivel 2 ...");
                    Arrays_Strings.main(args);
                    break;
                case 3:
                    System.out.println("Entrando al Nivel 3 ...");
                    POO.main(args);
                    break;
                case 4:
                    System.out.println("Entrando al Nivel 4 ...");
                    Recursion_Busqueda_Ordenamiento.main(args);
                    break;
                case 5:
                    System.out.println("Entrando al Nivel 5 ...");
                    Estructuras_lineales.main(args);
                    break;
                case 6:
                    System.out.println("Entrando al Nivel 6 ...");
                    Arboles_Grafos.main(args);
                    break;
                case 7:
                    System.out.println("Entrando al Nivel 7 ...");
                    Avanzado.main(args);
                    break;
                case 8:
                    System.out.println("Entrando al Nivel 8 ...");
                    Servicios_APIs.main(args);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
