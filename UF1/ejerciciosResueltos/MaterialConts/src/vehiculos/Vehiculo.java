package vehiculos;

// Creación de la clase Vehiculo, que implementa de GestionVehiculo

public class Vehiculo implements GestionVehiculo{
	
	// Declaración de las variables de clase
	
		private String marca;
		protected double velocidad_actual;
		protected boolean arrancado;
		private double precio;
		private double peso;
		private String color;
		private double longitud;
		
		
		
	// Método constructor
		
	public Vehiculo(String marca, double velocidad_actual, boolean arrancado, double precio, 
						double peso, String color, double longitud) {
			
		this.marca = marca;
		this.velocidad_actual = velocidad_actual;
		this.arrancado = arrancado;
		this.precio = precio;
		this.peso = peso;
		this.color = color;
		this.longitud = longitud;
			
	}
	
	
	// Método print
	
	public void print() {
		
		System.out.println("******************************\n"
				+ "MARCA: " + marca + "\n"
				+ "VELOCIDAD ACTUAL: " + velocidad_actual + "\n"
				+ "ARRANCADO: " + arrancado + "\n"
				+ "PRECIO: " + precio + "\n"
				+ "PESO: " + peso + "\n"
				+ "COLOR: " + color + "\n"
				+ "LONGITUD: " + longitud);
		
	}
	
	// Getters y setters
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getVelocidad_actual() {
		return velocidad_actual;
	}


	public void setVelocidad_actual(double velocidad_actual) {
		this.velocidad_actual = velocidad_actual;
	}


	public boolean isArrancado() {
		return arrancado;
	}


	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	// Métodos implementados por la interfaz
	
		public boolean arrancar() {
					
			if(arrancado) {
						
				return false;
						
			}else {

				return true;
						
			}	
					
		}

				
		public boolean frenar(double velocidad_reducida) {
					
			if(arrancado) {
						
				velocidad_actual -= velocidad_reducida;
						
				if(velocidad_actual < 0) {
							
					this.setVelocidad_actual(0);
							
				}
						
				return true;
						
			}else {

				return false;
						
			}	
					
		}

				
		public boolean acelerar(double velocidad_aumentada) {
					
			if(arrancado) {
						
				velocidad_actual += velocidad_aumentada;
						
				this.setVelocidad_actual(velocidad_actual);
						
				return true;
						
			}else {

				return false;
						
			}	
					
		}

				
				
		public boolean parar() {
					
			if(arrancado) {
						
				return true;
						
			}else {

				return false;
						
			}	
					
		}
	
}
