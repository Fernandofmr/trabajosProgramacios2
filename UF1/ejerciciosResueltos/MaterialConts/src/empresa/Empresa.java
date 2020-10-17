package empresa;


import edificios.Edificio;
import productos.Producto;
import vehiculos.Vehiculo;

// Creación de la clase Empresa

public class Empresa {
	
	// Declaración de los atributos de la clase
	
	private Edificio edificio1, edificio2, edificio3;
	private Vehiculo coche1, coche2, coche3, coche4;
	private Producto producto1, producto2, producto3, producto4, producto5, producto6;
	
	// Meto los productos en un array para hacer más eficiente el código de los métodos
	private Producto productos[] = {producto1, producto2, producto3, producto4, producto5, producto6};
	
	
	
	// Métodos constructores (sobrecarga)
	
	public Empresa() {
		
	}
	
	public Empresa(Edificio edificio1, Edificio edificio2, Edificio edificio3, 
					Vehiculo coche1, Vehiculo coche2, Vehiculo coche3, Vehiculo coche4, 
					Producto producto1, Producto producto2, Producto producto3, Producto producto4, 
					Producto producto5, Producto producto6) {
		
		this.edificio1 = edificio1;
		this.edificio2 = edificio2;
		this.edificio3 = edificio3;
		this.coche1 = coche1;
		this.coche2 = coche2;
		this.coche3 = coche3;
		this.coche4 = coche4;
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.producto4 = producto4;
		this.producto5 = producto5;
		this.producto6 = producto6;
		
	}
	
	public Empresa(Edificio edificio1, Edificio edificio2, Edificio edificio3, 
			Vehiculo coche1, Vehiculo coche2, Vehiculo coche3, Vehiculo coche4, 
			Producto[] productos) {

		this.edificio1 = edificio1;
		this.edificio2 = edificio2;
		this.edificio3 = edificio3;
		this.coche1 = coche1;
		this.coche2 = coche2;
		this.coche3 = coche3;
		this.coche4 = coche4;
		this.productos = productos;
	
	}
	
	
	// Métodos que definen las funcionalidades de la empresa
	
	public boolean crearProducto(Producto producto) {
		
		boolean aux = true;
		
		for(int i=0; i<productos.length; i++) {
			
			if(productos[i]!=null) {
			
				if(productos[i].getIdentificador()==producto.getIdentificador()) {
					
					aux = false;
					
				}
			}	
			
		}
		
		if(aux) {
			
			for(int i=0; i<productos.length; i++) {
				
				if(productos[i]==null) {
					
					productos[i] = producto;
					
					aux = true;
					
				}
				
			}
			
		}
		
		return aux;
		
	}
	
	
	public boolean venderProducto(Producto producto) {
		
		boolean aux = false;
		
		for(int i=0; i<productos.length; i++) {
			
			if(productos[i]!=null) {
			
			if(productos[i].getIdentificador()==producto.getIdentificador()) {
				
				if(productos[i].getEdificio().funcionalidadEdificio().contains("almacén")) {
					
					switch(i){
					
					case 1: producto1 = null; break;
					case 2: producto2 = null; break;
					case 3: producto3 = null; break;
					case 4: producto4 = null; break;
					case 5: producto5 = null; break;
					case 6: producto6 = null; break;
					
					}
					
					aux = true;
					
				}
				
			}
			
			}
			
		}
		
		return aux;

	}
	
	
	public boolean cambiarUbicacionProducto(Producto producto, Edificio edificio) {
		
		boolean aux = false;
		
		for(int i=0; i<productos.length; i++) {
				
			if(producto.getIdentificador() == productos[i].getIdentificador()) {
					
				productos[i].setEdificio(edificio);
					
				aux = true;
					
			}
			
		}
		
		return aux;
		
	}
	
	public void print() {
		
		System.out.println("\n\nEN ESTE MOMENTO LA EMPRESA DISPONE DE LO SIGUIENTE:");
		
		System.out.println("\n----------EDIFICIOS----------");
		
		edificio1.print();
		edificio2.print();
		edificio3.print();
		
		System.out.println("\n\n----------VEHÍCULOS----------");
		
		coche1.print();
		coche2.print();
		coche3.print();
		coche4.print();
		
		System.out.println( "\n\n----------PRODUCTOS----------");
		
		for(int i=0; i<productos.length; i++) {
			
			if(productos[i] != null) {
				
				productos[i].print();
				
			}
			
		}
		
	}
	
}
