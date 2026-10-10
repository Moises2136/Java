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

        ImprimirMain imprimirMain = new ImprimirMain();
        SumaMain sumaMain = new SumaMain();
        RestaMain restaMain = new RestaMain();
        MultiMain multiMain = new MultiMain();
        Div_ModMain div_modMain = new Div_ModMain();
        If_elseMain if_elseMain = new If_elseMain();
        SwitchMain switchMain = new SwitchMain();
        ForMain forMain = new ForMain();
        While_doMain while_doMain = new While_doMain();
        BasicosMain basicosMain = new BasicosMain();

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
                    imprimirMain.main(args);
                    break;
                case 2:
                    sumaMain.main(args);
                    break;
                case 3:
                    restaMain.main(args);
                    break;
                case 4:
                    multiMain.main(args);
                    break;
                case 5:
                    div_modMain.main(args);
                    break;
                case 6:
                    if_elseMain.main(args);
                    break;
                case 7:
                    switchMain.main(args);
                    break;
                case 8:
                    forMain.main(args);
                    break;
                case 9:
                    while_doMain.main(args);
                    break;
                case 10:
                    basicosMain.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionF != 0);

    }
}