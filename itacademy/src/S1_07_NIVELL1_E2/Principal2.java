package S1_07_NIVELL1_E2;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona2 per=new Persona2("Lius",33);
		Empleado2 emp=new Empleado2("Ana",28,2500,6);
		Jefe jef=new Jefe("Sandra",40,4500,15,"Finanzas",2000);
		
		System.out.println(jef.dameNombre());
		System.out.println(jef.retornarNombre());
		System.out.println(per.dameNombre());
		System.out.println(emp.dameAntiguedad());

	}

}
