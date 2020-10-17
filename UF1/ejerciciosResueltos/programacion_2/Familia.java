package programacion_2;

// Creación de la clase Familia 

public abstract class Familia implements Humano{  /* Indico que se trata de una clase abstracta
 									con la palabra reservada abstract y que implementa de la interfaz Humano*/
	
	// Declaración de los atributos de la clase (encapsulados)
	
	private long num_libro_familia;
	private String direccion;
	private String poblacion;
	private String provincia;
	
	
	// Declaración de un método abstracto
	
	public abstract void calculaIMC(double peso, double altura);
	
	
	// Métodos que obliga a implementar la interfaz Humano
	
	public boolean actualizaDNI(int dia, int mes, int agno) {
		return false;
	}

	public boolean esAlto() {
		return false;
	}

}
