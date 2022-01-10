package S1_07_NIVELL1_E2;

import S1_07_NIVELL1_E1.Empleado;

public class Empleado2 extends Persona2 {
	
	private int sueldo;
	private int antiguedad;
	
	public Empleado2(String n,int e,int s,int a) {
		super(n,e);
		sueldo=s;
		antiguedad=a;
	}
	@Deprecated
	public String retornarNombre() {
		return this.dameNombre();
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

class Jefe extends Empleado2{
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
