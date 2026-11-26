/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String nombre;
        String posicion;
        int edad;
        int estatura;
        int contador = 0;
        int contEdad=0;
        int contEst = 0;
                
        String reporte = "";
        String reporteEdad = "";
        
        while(bandera==true){ // true == true // false == true
            System.out.println("Ingrese nombre del jugador"); 
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la posición"); 
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese su estatura en cm");
            estatura = entrada.nextInt();
            
            contador= contador +1;
            contEdad = contEdad + edad;
            contEst = contEst + estatura;
            

            
            reporte = String.format("%s%d.%s, %s, %d, %d\n", reporte, contador, nombre, 
                    posicion, edad, estatura);
            
            reporteEdad = String.format ("Listado de edades:\n%s%d\n",reporteEdad, 
                    edad);
            
             
            
            String salir;   
            entrada.nextLine();
            
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
            }
        }
        
        double promEdad = contEdad/contador;
        double promEst = contEst/contador;
        
        System.out.printf("%s\n%s\nPromedio edades:%.2f\n"
                + "Promedio estaturas: %.2f\n", reporte, reporteEdad,promEdad
        ,promEst);
        
        
    }
    
}
