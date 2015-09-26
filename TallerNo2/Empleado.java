
public class Empleado {
	private String nombre;
	private String apellido;
	private double salario;
	private double salarioAnual;
	
	public Empleado(String nombre,String apellido, double salario){
		this.nombre=nombre;
		this.apellido=apellido;
		if(salario<0){this.salario=0;}
		else{this.salario=salario;}
		this.salarioAnual=this.salario*12;
		
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSalario() {
		return salario;
	}
	
	public double  incrementar(double  porcentaje){
		
		
		this.salarioAnual=this.salarioAnual+(this.salarioAnual* porcentaje)/100;
		return  salarioAnual;
		
	}

}
