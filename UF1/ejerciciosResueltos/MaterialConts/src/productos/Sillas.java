package productos;

import edificios.Edificio;

//Creaci�n de la clase Sillas

public class Sillas extends Producto{
	
	// M�todo constructor heredado de Producto
	
	public Sillas(int identificador, String nombre, String tipo, double anchura, double altura, double profundidad, String color, Edificio edificio) {
		
		super(identificador, nombre, tipo, anchura, altura, profundidad, color, edificio);
		
	}

}
