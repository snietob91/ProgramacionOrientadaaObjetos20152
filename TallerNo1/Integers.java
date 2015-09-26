/*
Diego Armando Rueda Robles
15-09-2015
La clase Integer sirve para realizar
una comparacion basica entre numeros
que ingresa el usuario.
Basicamente lo que se hace es comparar dos numeros
e identificar  cual es mayor, cual es menor
o si son iguales
*/

import java.util.*;

public class Integers {
	public static void main(String[] args) {
		Scanner lector;
		int numeroA=0;
		int numeroB=0;

		/*Entrada de datos*/
		lector= new Scanner(System.in);
		System.out.println("Ingrese un primer numero");
		numeroA= lector.nextInt();
		System.out.println("Ingrese un segundo  numero");
		numeroB= lector.nextInt();
		lector.close();

		/*Validaciones*/
		if(numeroA%2 ==0)
			{System.out.println("El numero "+numeroA+" es par");}
		else{System.out.println("El numero "+numeroA+" es impar");}
		
		if(numeroB%2 ==0)
			{System.out.println("El numero "+numeroB+" es par");}
		else{System.out.println("El numero "+numeroB+" es impar");}
		
		if(numeroA>numeroB){System.out.println("El numero "+numeroA+" es Mayor que "+numeroB);}
		if(numeroA<numeroB){System.out.println("El numero "+numeroA+" es Menor que "+numeroB);}
		if(numeroA==numeroB){System.out.println("El numero "+numeroA+" es Igual "+numeroB);}	
	}

}