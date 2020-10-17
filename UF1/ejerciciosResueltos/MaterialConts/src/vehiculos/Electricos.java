package vehiculos;

/* Declaraci�n de la clase Electricos, que hereda de Vehiculo 
e implementa GestionVehiculo gracias a esa herencia */

public class Electricos extends Vehiculo{
	
	// Declaraci�n de las variables de clase
	
	private int potencia;
	private double velocidad_maxima;
	
	
	
	// M�todo constructor
	
	public Electricos(String marca, double velocidad_actual, boolean arrancado, double precio, 
						double peso, String color, double longitud, int potencia, double velocidad_maxima) {
		
		super(marca, velocidad_actual, arrancado, precio, 
				peso, color, longitud);
		this.potencia = potencia;
		this.velocidad_maxima = velocidad_maxima;
		
	}
	
	
	// M�todo print
	
	public void print() {
			
		super.print();
			
		System.out.println("POTENCIA: " + potencia + "\n"
					+ "VELOCIDAD M�XIMA: " + velocidad_maxima + "\n"
					+ "******************************\n");
			
	}
	
	
	// Getters y setters
	
	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public double getVelocidad_maxima() {
		return velocidad_maxima;
	}


	public void setVelocidad_maxima(double velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}
	

}
