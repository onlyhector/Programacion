
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HolaMundo");
		int miVariable = 50;
		System.out.println(miVariable);
		++miVariable;
		System.out.println(miVariable);
		miVariable = miVariable + 1;
		System.out.println(miVariable);
		float gradosfarenheit = 98.6f;
		float gradosCentígrados = (gradosfarenheit - Constantes.GRADOS_CONGELACION_FARENHEIT)
				* Constantes.CORRECCIÓN_DE_CRECIMIENTO;

	}

}
