package pmg_extraordinaria_ed;

/**
 * @author Pedro Martorell desarrollador de java
 * @version 1.0.1
 * 
 * Esta es la clase principal del proyecto donde se instancian todos los objetos y se ejcutan todos los métodos.
 */
public class Principal_PMG {

	/**
	 * @param args
	 * 
	 * Método main donde se crean las instancias de los objetos de las otras clases del proyecto y 
	 * se van a crear los métodos funcionales.
	 */
	public static void main(String[] args) {
		
		// Instanciamos un cuadrado y un círculo
		PMG_Circulo circulo1 = new PMG_Circulo();
		PMG_Circulo circulo2 = new PMG_Circulo(479, "A", 6.5, "verde");
		
		PMG_Rectangulo rectangulo1 = new PMG_Rectangulo();
		PMG_Rectangulo rectangulo2 = new PMG_Rectangulo(3.5, 1.7, "blanco");
		
				

		double area1 = extracted(rectangulo1, rectangulo2);
		

		double area2 = extracted(circulo1);
		

		double diferencia = extracted(area1, area2);
		
		
		extracted(circulo1, rectangulo1, diferencia);
		
		
		
	}

	/**
	 * @param circulo1
	 * @param rectangulo1
	 * @param diferencia
	 * 
	 *
	 *Imprimir datos
	 */
	private static void imprimirDatos(PMG_Circulo circulo1, PMG_Rectangulo rectangulo1, double diferencia) {
		System.out.println("Rectangulo: "+rectangulo1);
		System.out.println("Circulo: "+circulo1);
		System.out.println("Diferencia: "+diferencia);
	}

	/**
	 * @param area1
	 * @param area2
	 * @return
	 * 
	 * Calcula area circulo pi*R2
	 */
	private static double CalcularAreaCirculo(double area1, double area2) {
		double diferencia = area1-area2;
		System.out.println("Diferencia áreas: "+diferencia);
		return diferencia;
	}

	/**
	 * @param circulo1
	 * @return
	 * 
	 * Diferencia entre areas	de cuadrado y circulo
	 */
	private static double calcularDiferenciAreas(PMG_Circulo circulo1) {
		double radio1 = circulo1.getRadio();
		double area2 = radio1 *3.14;
		System.out.println("Area circulo: "+area2);
		return area2;
	}

	/**
	 * @param rectangulo1
	 * @param rectangulo2
	 * @return
	 * 
	 * Calcula area rectangulo ladoA * ladoB
	 */
	private static double CalcularArearectangulo(PMG_Rectangulo rectangulo1, PMG_Rectangulo rectangulo2) {
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo2.getLadoB();
		double area1 = ladoA * ladoB;
		double area2 = ladoA * ladoB;
		System.out.println("Area rectangulo  :+area1");
		return area1;
	}

}
