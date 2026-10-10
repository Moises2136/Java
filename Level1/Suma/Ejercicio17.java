package Level1.Suma;

/**
 * Clase que suma los numero del 1 al 10
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio17 {

    /**
     * Metodo para sumar dos valores del 1 al 10
     *
     * @param num1  tiene un valor de int un numero
     * @param num2  tiene un valor de int un numero
     * @param num3  tiene un valor de int un numero
     * @param num4  tiene un valor de int un numero
     * @param num5  tiene un valor de int un numero
     * @param num6  tiene un valor de int un numero
     * @param num7  tiene un valor de int un numero
     * @param num8  tiene un valor de int un numero
     * @param num9  tiene un valor de int un numero
     * @param num10 tiene un valor de int un numero
     */
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int resultado = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        int resultad2 = num1;
        resultad2 += num2;
        resultad2 += num3;
        resultad2 += num4;
        resultad2 += num5;
        resultad2 += num6;
        resultad2 += num7;
        resultad2 += num8;
        resultad2 += num9;
        resultad2 += num10;

        System.out.println("La suma de los numeros del 1 al 10 es: " + resultado);
        System.out.println("La suma de los numeros del 1 al 10 es: " + resultad2);

    }
}
