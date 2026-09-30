package Level3.Herencia;

import java.util.Scanner;

public class HerenciaMain {

    public static void main(String[] args) {

        Scanner entradaHerencia = new Scanner(System.in);

        Ejercicio186 E186 = new Ejercicio186();
        Ejercicio187 E187 = new Ejercicio187();
        Ejercicio188 E188 = new Ejercicio188();
        Ejercicio189 E189 = new Ejercicio189();
        Ejercicio190 E190 = new Ejercicio190();
        Ejercicio191 E191 = new Ejercicio191();
        Ejercicio192 E192 = new Ejercicio192();
        Ejercicio193 E193 = new Ejercicio193();
        Ejercicio194 E194 = new Ejercicio194();
        Ejercicio195 E195 = new Ejercicio195();

        int opcionHerencia = 0;

        do {

            System.out.println("1. Animal → Perro, Gato" + "\n" +
                    "2. Vehiculo → Auto, Moto" + "\n" +
                    "3. super en constructores" + "\n" +
                    "4. Sobrescribir métodos con @Override" + "\n" +
                    "5. Empleado → Gerente, Programador" + "\n" +
                    "6. Figura → Cuadrado, Triangulo" + "\n" +
                    "7. CuentaBancaria → Ahorro, Credito" + "\n" +
                    "8. Herencia de 3 niveles" + "\n" +
                    "9. protected vs private" + "\n" +
                    "10. toString heredado y sobrescrito" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionHerencia = entradaHerencia.nextInt();

            switch (opcionHerencia) {
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

        } while (opcionHerencia != 0);

    }

}
