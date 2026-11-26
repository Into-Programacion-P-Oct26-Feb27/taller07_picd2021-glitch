/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author SALASC
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double n = 0;
        int sumador = 1;
        int contador = 1;
        String formato = "";

        while (contador <= 8) {
            n = 1 / sumador;
            contador = contador + 1;
            formato = String.format("%s +1/%d ", formato, sumador);
            sumador = sumador + 2;

            n = 1 / (-sumador);
            contador = contador + 1;
            formato = String.format("%s -1/%d ", formato, sumador);
            sumador = sumador + 2;
        }
        
        System.out.printf("%s\n ", formato);
    }

}
