package vehiculos;

// Creación de la interface GestionVehiculo

public interface GestionVehiculo {
	
	// Declaración de los métodos de la interface
	
	public boolean arrancar();
	
	public boolean frenar(double velocidad_actual);
	
	public boolean acelerar(double velocidad_actual);
	
	public boolean parar();

}
