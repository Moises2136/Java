package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Login simple: usuario y contraseña correctos
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio59 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usaurioSave = "Moises";
        String password = "1234";

        String enUser;
        String enPassword;

        System.out.println("Ingresa tu nombre de Usuario: ");
        enUser = entrada.nextLine();
        System.out.println("Ingresa tu contraseña: ");
        enPassword = entrada.nextLine();

        if (enUser.equals(usaurioSave) && enPassword.equals(password)) {
            System.out.println("Sesion iniciada correctamente");
        } else {
            System.out.println("Usuario o contraseña incorrectas");
        }

    }
}
