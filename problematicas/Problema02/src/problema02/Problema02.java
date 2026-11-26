/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1;
        int sumador = 2;
        int contador = 1;
        String formato = "";

        while (sumador <= 11) {
            n = contador * sumador;
            contador = contador +1;
            sumador = sumador + 1;
            
            formato = String.format("%s%d\n", formato, n);
            

        }
        System.out.printf("%s\n",formato);
    }

}
