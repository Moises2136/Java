package Level3;

import java.util.Scanner;

import Level3.Proyectos_POO.POO_PMain;
import Level3.Polimorfismo_e_interfaces.PoliformismoMain;
import Level3.Herencia.HerenciaMain;
import Level3.Encapsulamiento_y_constructores.EncapsulamientoMain;
import Level3.Clases_y_Objetos.Clases_Objetos_Main;
import Level3.Clases_abstractas_y_excepciones.C_AbstractasMain;
import Level3.Basico.Basico3Main;

public class POO {
    public static void main(String[] args) {

        Scanner entradaPOOScanner = new Scanner(System.in);

        int opcionPOO = 0;

        do {

            System.out.println("Bienvenido al programa de Programación Orientada a Objetos en Java.");
            System.out.println("1. Clases y objetos" + "\n" +
                    "2. Encapsulamiento y Constructores" + "\n" +
                    "3. Herencia" + "\n" +
                    "4. Poliformismo e interfaces" + "\n" +
                    "5. Clases abstractas y excepciones" + "\n" +
                    "6. Proyectos POO" + "\n" +
                    "7. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionPOO = entradaPOOScanner.nextInt();

            switch (opcionPOO) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionPOO != 0);
    }
}