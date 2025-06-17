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
	 * Método main dónde se crean las instancias de los objetos de las otras clases del proyecto y 
	 * se van a crear los métodos funcionales.
	 */
	public static void main(String[] args) {
		
		// Instanciamos un cuadrado y un círculo
		PMG_Circulo circulo1 = new PMG_Circulo();
		PMG_Circulo circulo2 = new PMG_Circulo(479, "A", 6.5, "verde");
		
		PMG_Rectangulo2 rectangulo1 = new PMG_Rectangulo2();
		PMG_Rectangulo2 rectangulo2 = new PMG_Rectangulo2(3.5, 1.7, "blanco");
		
				
				
		//Calcula area cuadrado ladoA * ladoB
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo2.getLadoB();
		double area1 = ladoA * ladoB;
		double area1 = ladoA * ladoB;
		System.out.println("Area rectangulo  :+area1");
		
		//Calcula area circulo pi*R2
		double radio1 = circulo1.getRadio();
		double area2 = radio1 *3.14;
		System.out.println("Area circulo: "+area2);
		
		// Diferencia entre areas	de cuadrado y circulo
		double diferencia = area1-area2;
		System.out.println("Diferencia áreas: "+diferencia);
		
		//Imprimir datos
		System.out.println("Rectangulo: "+rectangulo1);
		System.out.println("Circulo: "+circulo1);
		System.out.println("Diferencia: "+diferencia);
		
		
		
	}

}
