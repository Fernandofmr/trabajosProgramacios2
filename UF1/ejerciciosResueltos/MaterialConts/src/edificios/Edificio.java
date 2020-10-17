package edificios;

public abstract class Edificio {
	
	// Declaración de las variables de clase
	
		private float anchura;
		private float altura;
		private float profundidad;
		private String material;
		private String tipo_edificio;
		private double precio_mercado;
		private String color;
		
		
		// Métodos constructores (sobrecarga)
		
		public Edificio() {
			
		}
		
		
		public Edificio(float anchura, float altura, float profundidad, String material,
						String tipo_funcionalidad, float precio_mercado, String color) {
			
			this.anchura = anchura;
			this.altura = altura;
			this.profundidad = profundidad;
			this.material = material;
			this.tipo_edificio = tipo_funcionalidad;
			this.precio_mercado = precio_mercado;
			this.color = color;
			
		}
		
		
		
		
		// Getters y setters
		
		public float getAnchura() {
			return anchura;
		}


		public void setAnchura(float anchura) {
			this.anchura = anchura;
		}


		public float getAltura() {
			return altura;
		}


		public void setAltura(float altura) {
			this.altura = altura;
		}


		public float getProfundidad() {
			return profundidad;
		}


		public void setProfundidad(float profundidad) {
			this.profundidad = profundidad;
		}


		public String getMaterial() {
			return material;
		}


		public void setMaterial(String material) {
			this.material = material;
		}


		public String getTipo_edificio() {
			return tipo_edificio;
		}


		public void setTipo_edificio(String tipo_edificio) {
			this.tipo_edificio = tipo_edificio;
		}


		public double getPrecio_mercado() {
			return precio_mercado;
		}


		public void setPrecio_mercado(double precio_mercado) {
			this.precio_mercado = precio_mercado;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		// Método print
		public void print() {
			
			System.out.println("******************************\n"
					+ "ANCHURA: " + anchura + "\n"
					+ "ALTURA: " + altura + "\n"
					+ "PROFUNDIDAD: " + profundidad + "\n"
					+ "MATERIAL: " + material + "\n"
					+ "TIPO DE EDIFICIO: " + tipo_edificio + "\n"
					+ "PRECIO DE MERCADO: " + precio_mercado + "\n"
					+ "COLOR: " + color + "\n"
					+ "******************************");
			
		}
		
		
		// Métodos de la clase
		
		public float costePintura(String color, float precio_pintura) {
			
			float total = precio_pintura * anchura * altura * profundidad;
			
			if(total <= 0) {
				
				return -1;
				
			}else {
				
				return total;
				
			}
			
		}
		
		
		public float costePintura(String color, float precio_pintura, String lado) {
			
			float total = 0;
			
			if(lado.equalsIgnoreCase("ladoanchura")) {
				
				total = precio_pintura * anchura * altura;
				
				return total;
				
			}else if(lado.equalsIgnoreCase("ladoaltura")) {
				
				total = precio_pintura * altura * profundidad;
				
				return total;
				
			}else if(total <= 0) {
				
				return -1;
				
			}else {
				
				return -1;
				
			}
			
		}
		
		
		public abstract String funcionalidadEdificio();

}
