import java.util.*;
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1= new Rectangulo();
		Rectangulo rec2= new Rectangulo(19.5,11);
		Rectangulo rec3= new Rectangulo(16.2,4);
		Rectangulo rec4= new Rectangulo(3.5,9);
		Rectangulo rec5= new Rectangulo(2,7.6);
		Rectangulo rec6= new Rectangulo(14.2,8);
		Rectangulo rec7= new Rectangulo(19.6,5);
		Rectangulo rec8= new Rectangulo(17.2,7);
		Rectangulo rec9= new Rectangulo(11,13);
		Rectangulo rec10= new Rectangulo(15.3,8);
		
		ArrayList<Rectangulo> rectangulos= new ArrayList<Rectangulo>();
		rectangulos.add(rec1);
		rectangulos.add(rec2);
		rectangulos.add(rec3);
		rectangulos.add(rec4);
		rectangulos.add(rec5);
		rectangulos.add(rec6);
		rectangulos.add(rec7);
		rectangulos.add(rec8);
		rectangulos.add(rec9);
		rectangulos.add(rec10);
		
		System.out.println("Largo"+"\t"+"Ancho"+"\t"+"Area"+"\t"+"Perimetro");
		for(Rectangulo s: rectangulos){
			System.out.print(s.getLargo()+"\t");
			System.out.print(s.getAncho()+"\t");
			System.out.printf("%.2f\t",s.getArea());
			System.out.printf("%.2f\n",s.getPerimetro());
		}
		System.out.println("\nCambio el ancho en el rectangulo2 \n e imprimo nuevamente el ArrayList \n");
		rec2.setAncho(19);
		
		System.out.println("Largo"+"\t"+"Ancho"+"\t"+"Area"+"\t"+"Perimetro");
		for(Rectangulo s: rectangulos){
			System.out.print(s.getLargo()+"\t");
			System.out.print(s.getAncho()+"\t");
			System.out.printf("%.2f\t",s.getArea());
			System.out.printf("%.2f\n",s.getPerimetro());

	}
	}

}
