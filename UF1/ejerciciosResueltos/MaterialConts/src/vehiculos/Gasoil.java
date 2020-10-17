package vehiculos;

/* Declaración de la clase Gasoil, que hereda de Vehiculo 
e implementa GestionVehiculo gracias a esa herencia */

public class Gasoil extends Vehiculo{ 
	
	// Declaración de las variables propias de la clase
	
	private String contaminacion;
	private double tamagno_deposito;
	
	
	
	// Método constructor
	
	public Gasoil(String marca, double velocidad_actual, boolean arrancado, double precio, 
						double peso, String color, double longitud, String contaminacion, double tamagno_deposito) {
			
		super(marca, velocidad_actual, arrancado, precio, 
				peso, color, longitud);
		this.contaminacion = contaminacion;
		this.tamagno_deposito = tamagno_deposito;
			
	}
	
	
	// Método print
	
	public void print() {
		
		super.print();
			
		System.out.println("CONTAMINACIÓN: " + contaminacion + "\n"
					+ "TAMAÑO DEPÓSITO: " + tamagno_deposito + "\n"
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
