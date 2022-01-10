package S1_07_NIVELL1_E2;

public class Persona2 {
	
	private String nombre;
	private int edad;
	
	 public Persona2(String n,int e) {
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
