package pmg_extraordinaria_ed;

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
	@Override
	public String toString() {
		return "PMG_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
}
