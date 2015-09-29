/*
Diego Armando Rueda Robles
15-09-2015
La clase PruebaDemostracionFile sirve para correr el
programa ahorcado, el programa selecciona una palabra aleatoria
de un archivo seleccionado por el usuario
y pregunta letras con el objetivo de  encontrar la  palabra secreta
El programa aun esta en fase de Pruebas 
*/

import java.io.File;
import java.util.StringTokenizer;
import javax.swing.JFrame;

public class PruebaDemostracionFile
{
	public static void main( String[] args )
		{
			DemostracionFile aplicacion = new DemostracionFile();
			aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			System.out.println("Bienvenido  a la consola");
			CopyOffileInputStream pod= new CopyOffileInputStream(aplicacion.getNombreArchivo());
			String palabras= pod.str;
			String[] tokens = palabras.split( " " );/*Palabras del archivo a un arreglo*/
			System.out.println(tokens.length);
			for(int i=0;i<tokens.length;i++)
				{
					System.out.println(tokens[i]);/*Para mostrar todas las palabras*/
	   
				}
			
			System.out.println("La palabra con la que competirá es");
			Random aleatorio = new Random();
			int minimo=0;
			int maximo=tokens.length-1;
			/*Imprime la palabra aleatoria  con la que se competira*/
			System.out.println(tokens[(int)(aleatorio.nextDouble() * maximo + minimo)]);
   
   
		}
}
