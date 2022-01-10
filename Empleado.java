package S1_07_NIVELL1_E1;

public class Empleado extends Persona {
	
	private int sueldo;
	private int antiguedad;
	
	public Empleado(String n,int e,int s,int a) {
		super(n,e);
		sueldo=s;
		antiguedad=a;
	}
	 public int dameAntiguedad() {
		 return antiguedad;
	 }
	 public int dameSueldo() {
		 return sueldo;
	 }
	 public void setNombre(int a) {
		 antiguedad=a;
	 }
	 public void setEdad(int s) {
		 sueldo=s;
	 }

}

class Jefe extends Empleado{
	private String departamento;
	private int incentivo;
	private int sueldojefe;
	
	public Jefe(String n,int e,int s,int a,String dep, int inc) {
		super(n,e,s,a);
		departamento=dep;
		incentivo=inc;
		sueldojefe=s+inc;
	}
	
	public String dameDepartamento() {
		return departamento;
	}
	
	public int dameIncentivo() {
		return incentivo;
	}
	
	public void setDepartamento(String d) {
		 departamento=d;
	}
	
	public void setIncentivo(int in) {
		incentivo=in;
	}
	public void setSueldojefe(int f)
	{
		sueldojefe=f;
	}
	//@Overrride
	public int dameSueldo() {
		return sueldojefe;
	}
	
}
