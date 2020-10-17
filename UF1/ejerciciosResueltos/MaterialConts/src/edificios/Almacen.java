package edificios;

//Creaci�n de la clase Almacen

public class Almacen extends Edificio{
	
	// M�todo constructor heredado de Edificio
	
	public Almacen(float anchura, float altura, float profundidad, String material,
					String tipo_edificio, float precio_mercado, String color) {
		
		super( anchura, altura, profundidad, material,
				tipo_edificio, precio_mercado, color);
		
	}
	
	
	// M�todo implementado debido a su herencia
	
	public String funcionalidadEdificio() {
		
		String informacion = "En el almac�n se guarda el producto para posteriormente venderlo";
		
		return informacion;
		
	}
	

}
