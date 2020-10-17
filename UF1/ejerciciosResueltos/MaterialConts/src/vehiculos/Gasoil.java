package vehiculos;

/* Declaraci�n de la clase Gasoil, que hereda de Vehiculo 
e implementa GestionVehiculo gracias a esa herencia */

public class Gasoil extends Vehiculo{ 
	
	// Declaraci�n de las variables propias de la clase
	
	private String contaminacion;
	private double tamagno_deposito;
	
	
	
	// M�todo constructor
	
	public Gasoil(String marca, double velocidad_actual, boolean arrancado, double precio, 
						double peso, String color, double longitud, String contaminacion, double tamagno_deposito) {
			
		super(marca, velocidad_actual, arrancado, precio, 
				peso, color, longitud);
		this.contaminacion = contaminacion;
		this.tamagno_deposito = tamagno_deposito;
			
	}
	
	
	// M�todo print
	
	public void print() {
		
		super.print();
			
		System.out.println("CONTAMINACI�N: " + contaminacion + "\n"
					+ "TAMA�O DEP�SITO: " + tamagno_deposito + "\n"
					+ "******************************\n");
			
	}
	
	
	// Getters y setters
	
	public String getContaminacion() {
		return contaminacion;
	}


	public void setContaminacion(String contaminacion) {
		this.contaminacion = contaminacion;
	}


	public double getTamagno_deposito() {
		return tamagno_deposito;
	}


	public void setTamagno_deposito(double tamagno_deposito) {
		this.tamagno_deposito = tamagno_deposito;
	}
	
	
	
	
}
