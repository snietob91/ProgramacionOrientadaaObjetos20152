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
			String[] tokens = palabras.split( " " );
			System.out.println(tokens.length);
			System.out.println(tokens[0]);
			for(int i=0;i<tokens.length;i++)
				{
					System.out.println(tokens[i]);
	   
				}
   
   
		}
}
