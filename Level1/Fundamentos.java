package Level1;

import java.util.Scanner;
import Level1.Imprimir.ImprimirMain;
import Level1.Basicos.BasicosMain;
import Level1.Division_y_Modulos.Div_ModMain;
import Level1.For.ForMain;
import Level1.If_else.If_elseMain;
import Level1.Multiplicacion.MultiMain;
import Level1.Resta.RestaMain;
import Level1.Suma.SumaMain;
import Level1.Switch.SwitchMain;
import Level1.While_do_while.While_doMain;

public class Fundamentos {
    public static void main(String[] args) {

        Scanner entradaFScanner = new Scanner(System.in);

        int opcionF = 0;

        do {

            System.out.println("Bienvenido al programa de fundamentos de Java.");
            System.out.println("1. Imprimir" + "\n" +
                    "2. Suma" + "\n" +
                    "3. Resta" + "\n" +
                    "4. Multiplicación" + "\n" +
                    "5. División y módulo" + "\n" +
                    "6. Condicionales if/else" + "\n" +
                    "7. Switch" + "\n" +
                    "8. For" + "\n" +
                    "9. While y do-while" + "\n" +
                    "10. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionF = entradaFScanner.nextInt();

            switch (opcionF) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionF != 0);

    }
}