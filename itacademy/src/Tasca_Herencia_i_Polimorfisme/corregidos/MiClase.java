
public class MiClase {

	static {
		System.out.println("Solo saldr� una vez");

	}

	{
		System.out.println("Saldr� antes de ejecutar el constructor");
	}

	public MiClase() {
		System.out.println("Constructor");
	}

	public static void saluda() {
		System.out.println("Saludando desde m�todo est�tico");
	}

}