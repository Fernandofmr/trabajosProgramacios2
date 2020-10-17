package edificios;

//Creación de la clase Oficina

public class Oficina extends Edificio{
	
	// Método constructor heredado de Edificio
	
	public Oficina(float anchura, float altura, float profundidad, String material,
					String tipo_edificio, float precio_mercado, String color) {
			
		super( anchura, altura, profundidad, material,
				tipo_edificio, precio_mercado, color);
			
	}
	
	
	// Método implementado debido a su herencia

	public String funcionalidadEdificio() {
		
		String informacion = "En la oficina se etiqueta el producto";
		
		return informacion;
		
	}

}
