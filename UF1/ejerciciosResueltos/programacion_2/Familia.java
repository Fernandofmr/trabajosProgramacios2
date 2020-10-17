package programacion_2;

// Creaci�n de la clase Familia 

public abstract class Familia implements Humano{  /* Indico que se trata de una clase abstracta
 									con la palabra reservada abstract y que implementa de la interfaz Humano*/
	
	// Declaraci�n de los atributos de la clase (encapsulados)
	
	private long num_libro_familia;
	private String direccion;
	private String poblacion;
	private String provincia;
	
	
	// Declaraci�n de un m�todo abstracto
	
	public abstract void calculaIMC(double peso, double altura);
	
	
	// M�todos que obliga a implementar la interfaz Humano
	
	public boolean actualizaDNI(int dia, int mes, int agno) {
		return false;
	}

	public boolean esAlto() {
		return false;
	}

}
