package edificios;

// Creación de la clase Fabrica

public class Fabrica extends Edificio{
	
	// Método constructor heredado de Edificio
	
	public Fabrica(float anchura, float altura, float profundidad, String material,
					String tipo_edificio, float precio_mercado, String color) {
			
		super(anchura, altura, profundidad, material,
				tipo_edificio, precio_mercado, color);
			
	}
	
	public Fabrica() {
		
	}
	

	// Método implementado debido a su herencia
	
	public String funcionalidadEdificio() {
		
		String informacion = "En la fábrica se crea el producto";
		
		return informacion;
		
	}
	
	

}
