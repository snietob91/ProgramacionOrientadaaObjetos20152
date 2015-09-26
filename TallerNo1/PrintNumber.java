/*
Diego Armando Rueda Robles
15-09-2015
La clase PrintNumber me permite leer unnumero desde consola
y obtener una lista de los numeros primos pmenores que el numero ingresado
*/

import java.util.*;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero=lector.nextInt();
        System.out.println(numero);
        if(numero>=0 && numero<=1000000000){imprimirPrimos(numero);}
        else{System.out.println("Numero fuera de Rango");}
    }
    public static void imprimirPrimos(int n){
        boolean bandera=false;
        for(int i=1;i<=n;i++)
            {
                if (i%2!=0){
                    bandera=esPrimo(n);
                    if(bandera==true){System.out.println(i);}
                }
              
            }
    }
    public static boolean esPrimo(int numero){
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
    primo = false;
    contador++;
    }
    return primo;
    }
}