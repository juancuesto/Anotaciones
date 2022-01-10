package S1_07_NIVELL1_E1;

public class Persona {
	
	private String nombre;
	private int edad;
	
	 public Persona(String n,int e) {
		 nombre=n;
		 edad=e;
	 }
	 public String dameNombre() {
		 return nombre;
	 }
	 public int dameEdad() {
		 return edad;
	 }
	 public void setNombre(String n) {
		  nombre=n;
	 }
	 public void setEdad(int e) {
		 edad=e;
	 }

}
