package pmg_extraordinaria_ed;

public class PMG_Circulo {
	
	private int id;
	private String nombre;
	private double radio;	
	private String color;
	
	// Constructor por defecto
	public PMG_Circulo() {
		super();
	}

	// Constructor parametrizado
	public PMG_Circulo(int id, String nombre, double radio, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}

	// Constructor parametrizado sin el argumento id
	public PMG_Circulo(String nombre, double radio, String color) {
		super();
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}

	// Getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
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
		return "PMG_Circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}
	
	
	
	
	
	

}
