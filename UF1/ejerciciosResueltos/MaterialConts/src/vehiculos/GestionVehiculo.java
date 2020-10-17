package vehiculos;

// Creaci�n de la interface GestionVehiculo

public interface GestionVehiculo {
	
	// Declaraci�n de los m�todos de la interface
	
	public boolean arrancar();
	
	public boolean frenar(double velocidad_actual);
	
	public boolean acelerar(double velocidad_actual);
	
	public boolean parar();

}
