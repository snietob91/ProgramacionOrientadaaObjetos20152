import java.util.*;

public class Rectangulo {
	private double largo;
	private double ancho;
	private double perimetro;
	private double area;
	
	public Rectangulo(){
		this.largo=1;
		this.ancho=1;
		this.perimetro=hallarPerimetro();
		this.area=hallarArea();
		
	}
	
	public Rectangulo(double largo, double ancho){
		if((largo  <=0||largo >20.0)||(ancho  <=0||ancho >20.0))
			{System.out.println("Parametros Invalidos");
			Scanner lector= new Scanner(System.in);
			System.out.println("Ingrese  un nuevo valor para el ancho");
			double var= lector.nextDouble();
			System.out.println("Ingrese  un nuevo valor para el largo");
			double var2= lector.nextDouble();
			this.largo=var2;
			this.ancho=var;
			this.perimetro=hallarPerimetro();
			this.area=hallarArea();
			
			
			}
		else{
			this.largo=largo;
			this.ancho=ancho;
			this.perimetro=hallarPerimetro();
			this.area=hallarArea();
		}
	}
	
	
	
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		if(largo>0 && largo <=20){
			this.largo = largo;
			this.area=hallarArea();
			this.perimetro=hallarPerimetro();
		}
		else{System.out.println("Solo es permitido un valor en el intervalo (0,20]");}
		
		
	}
	
	public void setAncho(double ancho) {
		if(ancho>0 && ancho <=20){
			this.ancho = ancho;
			this.area=hallarArea();
			this.perimetro=hallarPerimetro();
		}	
		else{System.out.println("Solo es permitido un valor en el intervalo (0,20]");}
		
		
	}

	public double getAncho() {
		return ancho;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}

	private double hallarPerimetro(){
		double per=0;
		per=(2*this.largo)+(2*this.ancho);
		
		return per;
	}
	
	private double hallarArea(){
		double are=0;
		are=this.largo*this.ancho;
		
		return are;
	}

}
