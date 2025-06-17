package pmg_extraordinaria_ed;
/**
 * @author Pedro Martorell desarrollador de java 	
 * @version 1.0.1
 * 
 * Esta clase es una clase modelo de rectángulo para crear objetos rectángulo en el proyecto con los atributos establecidos.
 */
public class PMG_Rectangulo {

	private int id;
	private double ladoA;
	private double ladoB;
	private String color;
	
	// Constructor por defecto
	public PMG_Rectangulo() {
		super();
	}

	// Constructor parametrizado
	/**
	 * @param ladoA
	 * @param ladoB
	 * @param color
	 * 
	 * Constructor en el que se incluyen todos los argumentos para generar un objeto rectángulo el la clase principal
	 */
	public PMG_Rectangulo( double ladoA, double ladoB, String color) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}

	// Getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Método ToString
	/**
	 *@return printea una cadena
	 */
	@Override
	public String toString() {
		return "PMG_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	
	/**
	 * @param rectangulo1
	 * @param rectangulo2
	 * @return
	 * 
	 * Calcula area rectangulo ladoA * ladoB
	 */
	public static double CalcularArearectangulo(PMG_Rectangulo rectangulo1, PMG_Rectangulo rectangulo2) {
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo2.getLadoB();
		double area1 = ladoA * ladoB;
		double area2 = ladoA * ladoB;
		System.out.println("Area rectangulo  :+area1");
		return area1;
	}
	
	
	
	
	
	
	
}
