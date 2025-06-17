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
		
				
		/**
		 * Calcula area cuadrado ladoA * ladoB
		 */	
		double area1 = extracted(rectangulo1, rectangulo2);
		
		/**
		 * Calcula area circulo pi*R2
		 */	
		double area2 = extracted(circulo1);
		
		/**
		 * Diferencia entre areas	de cuadrado y circulo
		 */
		double diferencia = extracted(area1, area2);
		
		/**
		 * Imprimir datos
		 */
		extracted(circulo1, rectangulo1, diferencia);
		
		
		
	}

	public static void extracted(PMG_Circulo circulo1, PMG_Rectangulo rectangulo1, double diferencia) {
		System.out.println("Rectangulo: "+rectangulo1);
		System.out.println("Circulo: "+circulo1);
		System.out.println("Diferencia: "+diferencia);
	}

	public static double extracted(double area1, double area2) {
		double diferencia = area1-area2;
		System.out.println("Diferencia áreas: "+diferencia);
		return diferencia;
	}

	public static double extracted(PMG_Circulo circulo1) {
		double radio1 = circulo1.getRadio();
		double area2 = radio1 *3.14;
		System.out.println("Area circulo: "+area2);
		return area2;
	}

	public static double extracted(PMG_Rectangulo rectangulo1, PMG_Rectangulo rectangulo2) {
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo2.getLadoB();
		double area1 = ladoA * ladoB;
		double area2 = ladoA * ladoB;
		System.out.println("Area rectangulo  :+area1");
		return area1;
	}

}
