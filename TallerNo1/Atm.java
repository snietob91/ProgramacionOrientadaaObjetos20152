/*
Diego Armando Rueda Robles
15-09-2015
La clase Atm es un simulador de cajero electronico
que selecciona la manera mas optima de entregar un monto de dinero
tomando como base unas denominaciones de billetes y monedas disponibles
*/
import java.util.*;
public class Atm {
public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       int valor=0;
       int rta=0;
       int contador=0;
       int[] billetes= {50000,20000,10000,5000,2000,1000,500,200,100,50};
       int[] auxBilletes= {0,0,0,0,0,0,0,0,0,0};
       int caja=0;
       int saldo=0;
	   /*Ingreso de datos*/
       System.out.println("Digite el monto a retirar");
       valor=lector.nextInt();
       caja=valor;
	   /*Validacion e identificacion de la denominacion de los billetes y monedas*/
       if((valor%50)==0){
           System.out.println(caja+ " Es un valor Valido");
           for(int i=0;i<billetes.length;i++){
                   if(caja%billetes[i]==0){
                       auxBilletes[i]=caja/billetes[i];    
                   }
                   else{auxBilletes[i]=caja/billetes[i];caja=caja%billetes[i];}            
           }
           
           for(int c=0;c<billetes.length;c++){
				if(auxBilletes[c]!=0){
					System.out.println(auxBilletes[c]+"\t"+billetes[c]+"$");
				}
               
           }            
       }
       else{System.out.println("Numero invalido");}
   }

}