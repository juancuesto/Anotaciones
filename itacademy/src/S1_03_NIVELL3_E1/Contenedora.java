package S1_03_NIVELL3_E1;

public class Contenedora {
	
	private int TAMA�O=3;
	public Contenedora() {
		
		String[] lista=new String[TAMA�O];
		
		lista[0]="palabra1";
		lista[2]="palabra2";
		lista[3]="palabra3";
	}
	
	public void Add(String a) {
		if(a.length()>1) {
			TAMA�O++;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
