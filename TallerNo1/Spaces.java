/*
Diego Armando Rueda Robles
15-09-2015
La clase Spaces me permite leer un numero desde consola
y separar los digitos que integran ese numero
*/
import java.util.Scanner;

public class Spaces {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int numeroIngresado=0;
		int copiaNumero=0;
		int[] digitos;
		System.out.println("Ingrese un numero");
		Integer n= lector.nextInt();
		copiaNumero=n;
		String b=n.toString();/*Para conocer la cantidad de digitos del numero*/
		digitos= new int[b.length()];/*Arreglo para almacenar los digitos */
		
		/*Rompimiento del numero ingresado en sus digitos componentes*/
		for(int i=b.length()-1;i>=0;i--){
			digitos[i]=copiaNumero/(int)(Math.pow(10, i));
			copiaNumero=copiaNumero%(int)(Math.pow(10, i));	
		}
	
		/*Visualizacion de el arreglo de enteros*/
		for(int i=b.length()-1;i>=0;i--){
			System.out.print(digitos[i]+"   ");
		}

	}

}