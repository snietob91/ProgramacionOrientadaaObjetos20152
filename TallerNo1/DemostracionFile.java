/*
Diego Armando Rueda Robles
15-09-2015
La clase DemostracionFile sirve para abrir un cuadro
de dialogo que me permite seleccionar el archivo de texto
donde se encuantran las palabras para competir en el ahorcado
*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemostracionFile extends JFrame
{
	private File nombreArchivo;
	public DemostracionFile()
		{   mimetodo(); }   
	public void obtenerArchivoODirectorio()
		{
			// muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
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
	public  void  mimetodo()
   {
       obtenerArchivoODirectorio();
       //System.out.println("Te tengo");
   } 
    
   
} 


