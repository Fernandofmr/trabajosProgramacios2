package empresa;

import edificios.Almacen;
import edificios.Fabrica;
import edificios.Oficina;
import productos.Producto;
import productos.Puertas;
import productos.Sillas;
import productos.Ventanas;
import vehiculos.Electricos;
import vehiculos.Gasoil;
import vehiculos.Gasolina;


// Iniciamos el programa
public class start {

	public static void main(String[] args) {

		boolean aux = true;
		int contador=0;

		// Creo los objetos Vehiculo
		Electricos coche1 = new Electricos("Ford", 50.0, true, 30100, 1200, "azul", 2500, 150, 240);
		Electricos coche2 = new Electricos("Hyundai", 50.0, true, 26.700, 1240, "negro", 2800, 140, 220);
		Gasoil coche3 = new Gasoil("Seat", 80.0, true, 22000, 1380, "blanco", 2900, "alta", 80);	
		Gasolina coche4 = new Gasolina("Opel", 80.0, true, 18000, 1340, "blanco", 2750, "media", 70);
		
		
		// Creo los edificios
		Fabrica fabrica = new Fabrica(500, 100, 500, "ladrillo y cemento", "Fábrica (crear el producto)", 500000, "gris");
		Almacen almacen = new Almacen(300, 50, 300, "polipropileno", "Almacén (almacenar producto)", 500000, "beige");
		Oficina oficina = new Oficina(200, 10, 200, "paneles OSB", "Oficina (etiquetar el producto)", 500000, "marrón");
		
		// Creo los productos
		Puertas puerta1 = new Puertas(1, "puerta", "madera", 72.5, 203, 50.5, "marrón", fabrica);
		Puertas puerta2 = new Puertas(2, "puerta", "PVC", 82.5, 203, 60.5, "blanco", fabrica);
		Sillas silla1 = new Sillas(3, "silla", "madera", 350, 800, 425, "marrón", fabrica);
		Sillas silla2 = new Sillas(4, "silla", "PVC", 350, 800, 425, "blanco", fabrica);
		Ventanas ventana1 = new Ventanas(5, "ventana", "madera", 120, 150, 80, "marrón", fabrica);
		Ventanas ventana2 = new Ventanas(6, "ventana", "PVC", 120, 150, 80, "blanco", fabrica);
		
		// Meto los productos en un array para hacer más eficiente el código en la clase Empresa
		Producto[] productos = {puerta1, puerta2, silla1, silla2, ventana1, ventana2};
		
		
		// Creo la empresa
		Empresa empresa = new Empresa(fabrica, almacen, oficina, coche1, coche2, coche3, coche4, productos);
		
		
		// Imprimo las características de la empresa
		empresa.print();		
		
		
		// Freno los vehículos que van a 80 km/h
		if(coche3.frenar(30)) {
			
			System.out.println("\nEl coche " + coche3.getMarca() + " ha frenado y "
					+ "ahora circula a " + coche3.getVelocidad_actual() + "km/h.");
			
		}
		
		if(coche4.frenar(30)) {
			
			System.out.println("El coche " + coche4.getMarca() + " ha frenado y "
					+ "ahora circula a " + coche4.getVelocidad_actual() + "km/h.");
			
		}
		
		
		// Calculo el precio de pintar la fábrica completa de color verde
		float precioCoste = fabrica.costePintura("verde", 30);
		
		System.out.println("\nEl precio de pintar la fábrica de color verde es " + precioCoste);
		
		
		// Cambio la ubicación de las sillas
		System.out.println();
		aux = empresa.cambiarUbicacionProducto(silla1, oficina);
		
		if(aux) {
			
			System.out.println("El producto " + silla1.getIdentificador() + " se ha trasladado de edificio satisfactoriamente"
					+ " y ahora se encuentra en " + silla1.getEdificio().getTipo_edificio());
			
		}else {
			
			System.out.println("Ha ocurrido algo inesperado y no se ha podido cambiar el producto " + silla1.getIdentificador() + " de edificio");
			
		}
		
		aux = empresa.cambiarUbicacionProducto(silla2, oficina);
		
		if(aux) {
			
			System.out.println("El producto " + silla2.getIdentificador() + " se ha trasladado de edificio satisfactoriamente"
					+ " y ahora se encuentra en " + silla2.getEdificio().getTipo_edificio());
			
		}else {
			
			System.out.println("Ha ocurrido algo inesperado y no se ha podido cambiar el producto " + silla2.getIdentificador() + " de edificio");
			
		}
		
		
		// Cambio la ubicación de las puertas
		System.out.println();
		aux = empresa.cambiarUbicacionProducto(puerta1, almacen);
		
		if(aux) {
			
			System.out.println("El producto " + puerta1.getIdentificador() + " se ha trasladado de edificio satisfactoriamente"
					+ " y ahora se encuentra en " + puerta1.getEdificio().getTipo_edificio());
			
		}else {
			
			System.out.println("Ha ocurrido algo inesperado y no se ha podido cambiar el producto " + puerta1.getIdentificador() + " de edificio");
			
		}
		
		aux = empresa.cambiarUbicacionProducto(puerta2, almacen);
		
		if(aux) {
			
			System.out.println("El producto " + puerta2.getIdentificador() + " se ha trasladado de edificio satisfactoriamente"
					+ " y ahora se encuentra en " + puerta2.getEdificio().getTipo_edificio());
			
		}else {
			
			System.out.println("Ha ocurrido algo inesperado y no se ha podido cambiar el producto " + puerta2.getIdentificador() + " de edificio");
			
		}
		
		
		// Vendo productos
		System.out.println();
		aux = empresa.venderProducto(puerta1);
		
		if(aux) {
			
			System.out.println("El producto " + puerta1.getNombre() + " se ha vendido y ya no figura en la empresa");
			
			productos[0] = null;
			
			
		}else {
			
			System.out.println("El producto " + puerta1.getNombre() + " no está disponible para su venta");
			
		}
		
		aux = empresa.venderProducto(silla1);
		
		if(aux) {
			
			System.out.println("El producto " + silla1.getNombre() + " se ha vendido y ya no figura en la empresa");
			
			productos[3] = null;
			
		}else {
			
			System.out.println("El producto " + silla1.getNombre() + " no está disponible para su venta");
			
		}
		
		for(int i=0; i<productos.length; i++) {
			if(productos[i]!=null) {
				contador ++;
			}
		}
		
		
		// Visualizo los productos que existen actualmente en la empresa
		System.out.println("\nActualmente la empresa dispone de " + contador + " productos,\n"
				+ "son los siguientes: ");
		System.out.println("----------PRODUCTOS----------");
		for(Producto p:productos) {
			if(p!=null) {
				p.print();
			}			
		}
		
		
		
		// Creo productos
		System.out.println();
		Puertas puertaNueva = new Puertas(2, "puerta", "madera", 72.5, 203, 50.5, "marrón", fabrica);
		
		aux = empresa.crearProducto(puertaNueva);
			
		if(aux == false) {
				
			System.out.println("No se ha creado la puerta con el identificador " + puertaNueva.getIdentificador() + " porque ese identificador ya existe");
				
		}else {
				
			System.out.println("La nueva puerta con el identificador " + puertaNueva.getIdentificador() + " se ha creado correctamente");
				
		}
		
		
		Puertas puertaNueva2 = new Puertas(10, "puerta", "PVC", 72.5, 203, 50.5, "blanco", fabrica);
		
		aux = empresa.crearProducto(puertaNueva2);
		
		if(aux == false) {
				
			System.out.println("No se ha creado la puerta con el identificador " + puertaNueva2.getIdentificador() + " porque ese identificador ya existe");
				
		}else {
				
			System.out.println("La nueva puerta con el identificador " + puertaNueva2.getIdentificador() + " se ha creado correctamente");
				
		}
		
		
		// Visualizo como queda la empresa al final
		empresa.print();
			

	}

}
