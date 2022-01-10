package S1_07_NIVELL1_E1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1=new Persona("Juan",49);
		Empleado e1=new Empleado("Alberto",33,2500,5);
		Jefe j1=new Jefe("Ana",38,3500,10,"Finanzas",2000);
		
		System.out.println(p1.dameNombre());
		System.out.println(e1.dameSueldo());
		System.out.println(e1.dameNombre());
		System.out.println(j1.dameSueldo());
		System.out.println(j1.dameIncentivo());
		System.out.println(j1.dameEdad());

	}

}
