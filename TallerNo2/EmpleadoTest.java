
public class EmpleadoTest {

	public static void main(String[] args) {
		Empleado[] empleados= new Empleado[5];
		empleados[0]= new Empleado("Diego A.","Rueda",3420);
		empleados[1]= new Empleado("Carolina","Mendez",870);
		empleados[2]= new Empleado("Andrea P.","Gonzales",2450);
		empleados[3]= new Empleado("Shirley ","Villate",6500);
		empleados[4]= new Empleado("Dayanna","Lozada",7000);
		
		for(int c=0;c<empleados.length;c++){
			System.out.print("Empleado "+c+":  ");
			System.out.print(empleados[c].getNombre()+" ");
			System.out.print(empleados[c].getApellido()+" ");
			System.out.print("Salario anual"+" ");
			System.out.print(empleados[c].getSalarioAnual());
			System.out.println("");
		}
		System.out.printf("\n\nSalarios icrementados en un 10\n");
		
		for(int c=0;c<empleados.length;c++){
			System.out.print("Empleado "+c+":  ");
			System.out.print(empleados[c].getNombre()+" ");
			System.out.print(empleados[c].getApellido()+" ");
			System.out.print("Salario anual"+" ");
			System.out.print(empleados[c].incrementar(10));
			System.out.print(empleados[c].getSalarioAnual());
			System.out.println("");
		}

	}

}
