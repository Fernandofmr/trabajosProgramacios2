package productos;

import edificios.Edificio;
import edificios.Fabrica; // Importamos las clases necesarias

//Creación de la clase Producto

public class Producto {
	
	// Declaración de variables de clase;
	
	private int identificador;
	private String nombre;
	private String tipo;
	private double anchura;
	private double altura;
	private double profundidad;
	private String color;
	private Edificio edificio; 
	
	
	// Métodos constructores (sobrecarga)
	
	public Producto() {
		
	}
	
	public Producto(int identificador, String nombre, String tipo, double anchura, double altura, double profundidad, String color, Edificio edificio) {
		
		this.identificador = identificador;
		this.nombre = nombre;
		this.tipo = tipo;
		this.anchura = anchura;
		this.altura = altura;
		this.profundidad = profundidad;
		this.color = color;
		this.edificio = edificio;
		
	}
	
	
	// Métodos getters y setters
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	
	
	// Método print

	public void print() {
		
		System.out.println("********************\n"
				+ "IDENTIFICADOR: " + identificador + "\n"
				+ "NOMBRE: " + nombre + "\n"
				+ "TIPO: " + tipo + "\n"
				+ "ANCHURA: " + anchura + "\n"
				+ "PROFUNDIDAD: " + profundidad + "\n"
				+ "COLOR: " + color + "\n"
				+ "EDIFICIO: " + edificio.getTipo_edificio() + "\n"
				+ "********************");
		
	}

}
