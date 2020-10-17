package edificios;

// Creaci�n de la clase Fabrica

public class Fabrica extends Edificio{
	
	// M�todo constructor heredado de Edificio
	
	public Fabrica(float anchura, float altura, float profundidad, String material,
					String tipo_edificio, float precio_mercado, String color) {
			
		super(anchura, altura, profundidad, material,
				tipo_edificio, precio_mercado, color);
			
	}
	
	public Fabrica() {
		
	}
	

	// M�todo implementado debido a su herencia
	
	public String funcionalidadEdificio() {
		
		String informacion = "En la f�brica se crea el producto";
		
		return informacion;
		
	}
	
	

}
