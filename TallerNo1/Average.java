
/*
Diego Armando Rueda Robles
15-09-2015
La clase Average me permite leer numeros desde consola
y obtener el promedio de los numeros ingresados.
El programa termina cuando se ingres el numero 9999
*/
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int numeroIngresado=0;
		int contador=0;
		int suma=0;
		int promedio=0;
		do {	System.out.println("Ingrese un Numero para continuar o 9999 para salir");
				numeroIngresado=lector.nextInt();
				if(numeroIngresado== 9999){break;}
				suma+=numeroIngresado;
				contador++;
				promedio=suma/contador;
				System.out.println("El promedio es "+promedio+"\n");
			}
		while(numeroIngresado!= 9999);

	}

}