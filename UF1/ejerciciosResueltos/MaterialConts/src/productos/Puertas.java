package productos;

import edificios.Edificio;

//Creación de la clase Puertas

public class Puertas extends Producto{
	
	// Método constructor heredado de Producto
	
	public Puertas(int identificador, String nombre, String tipo, double anchura, double altura, double profundidad, String color, Edificio edificio) {
		
		super(identificador, nombre, tipo, anchura, altura, profundidad, color, edificio);
		
	}

}
