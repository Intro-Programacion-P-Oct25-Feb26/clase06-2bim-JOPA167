/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicioclase01 {

    public static void main(String[] args) {

        int valor1 = obtenerValor();
        int valor2 = obtenerValor();
        int resultado = obtenerSuma(valor1, valor2);
        reporteFinal(valor1, valor2,resultado);

    }

    public static int obtenerValor(){
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int valor1 = 0;
        while (bandera) {
            try {
                System.out.println("INGRESE UN VALOR: ");
                valor1 = entrada.nextInt();

                if (valor1 % 2 == 1 || valor1 < 0) {
                    throw new Exception("Error en el dato");
                }
                bandera = false;

            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            }catch (Exception e){
                 System.out.printf("Ocurrió una "
                    + "excepción %s\n", e);
            }

        }
        return valor1;
    }
    
    public static int obtenerSuma (int valor1,  int valor2 ){
        int suma;
        suma = valor1 + valor2;
        return suma;
    }
    public static void reporteFinal(int a, int b, int suma){
        String mensaje = "";
        mensaje = String.format("La suma entre %d y %d es: %d", a,b,suma);
        System.out.printf("%s\n",mensaje);
    }
}
// enteros - pares
// suma
// reporte
