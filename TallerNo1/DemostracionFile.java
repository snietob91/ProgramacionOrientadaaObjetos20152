/*
Diego Armando Rueda Robles
15-09-2015
La clase DemostracionFile sirve para abrir un cuadro
de dialogo que me permite seleccionar el archivo de texto
donde se encuantran las palabras para competir en el ahorcado
*/

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class DemostracionFile extends JFrame{
	private File nombreArchivo;
	public DemostracionFile(){   mimetodo(); }  /*Constructor*/ 
	public  void  mimetodo(){
		 obtenerArchivoODirectorio();
	 } 
	public void obtenerArchivoODirectorio(){
		/**Este metodo me despliega una ventana que me permite escoger
		el archivo en donde estan almacenadas las palabras con las que el jugador
		va a concursar en el ahorcado
		*/
		JFileChooser selectorArchivos = new JFileChooser();
		selectorArchivos.setFileSelectionMode(
		JFileChooser.FILES_AND_DIRECTORIES );
		int resultado = selectorArchivos.showOpenDialog( this );
		// si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, regresa
		if ( resultado == JFileChooser.CANCEL_OPTION )
			System.exit( 1 );
			nombreArchivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado
			// muestra error si es inválido
		
			if ( ( nombreArchivo == null ) || ( nombreArchivo.getName().equals( "" ) ) )
				{
					JOptionPane.showMessageDialog( this, "Nombre de archivo inválido",
					"Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE );
					System.exit( 1 );
				}    
		}  
	public File getNombreArchivo() {
	return nombreArchivo;
}

    
   
} 


