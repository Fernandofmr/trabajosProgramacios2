package programacion_2;

public class usoPersona {

	public static void main(String[] args) {
		
		boolean aux; // Creo una variable boleana que me servirá de auxiliar en algunas operaciones
		
		// Creación de tres objetos Persona correspondientes a los miembros de mi familia
		
		Persona personas[]= new Persona[3];
		
		Persona elizabeth = new Persona();
		Persona adrian = new Persona();
		Persona fernando = new Persona();
		
		
		// Asignación de atributos a los objetos Persona creados 
		
		elizabeth.setNombre("Elizabeth");
		elizabeth.setEdad(35);
		elizabeth.setDni("78945626E");
		elizabeth.setFecha_caducidad(2021, 06, 06);
		elizabeth.setSexo("M");
		elizabeth.setPeso(58.2);
		elizabeth.setAltura(1.68);
		
		adrian.setNombre("Adrián");
		adrian.setEdad(4);
		adrian.setDni("7895231A");
		adrian.setFecha_caducidad(2021, 04, 15);
		adrian.setSexo("V");
		adrian.setPeso(16.5);
		adrian.setAltura(1.10);
		
		fernando.setNombre("Fernando");
		fernando.setEdad(35);
		fernando.setDni("78956634F");
		fernando.setFecha_caducidad(2022, 07, 23);
		fernando.setSexo("V");
		fernando.setPeso(77.10);
		fernando.setAltura(1.81);
		
		personas[0] = elizabeth;
		personas[1] = adrian;
		personas[2] = fernando;
		
		
		// Imprimo en pantalla las características de las instancias creadas
		
		for (Persona p:personas){
			
			System.out.println(p.print());
			
		}
		
		
		// Verifico si los DNI de mi familia son correctos
		
		System.out.println("\n********************");
		
		for (int i=0; i<personas.length; i++) {
			
			if(personas[i].esDNICorrecto(personas[i].getDni())==true) {
			
			System.out.println("El dni de " + personas[i].getNombre() + " es correcto");
			
			}else {
				
				System.out.println("El dni de " + personas[i].getNombre() + " es incorrecto");
			}
			
			
		}
		
		System.out.println("********************\n");
		
		
		// Compruebo los IMC de los integrantes de la familia
		
		System.out.println("\n********************");
		
		for (Persona p:personas) {
			
			p.calculaIMC(p.getPeso(), p.getAltura());
			
			System.out.println();
			
		}
		
		System.out.println("********************\n");
		
		
		// Actualizo el DNI de uno de los miembros de la família
		
		System.out.println("\n********************");
		
		aux = elizabeth.actualizaDNI(07, 12, 2022);
		
		if(aux) {
			
			System.out.println("La actualización de la fecha se ha realizado correctamente");
			
			System.out.println("La nueva fecha de caducidad es " + elizabeth.getFecha_caducidad() + "\n");
			
		}else {
			
			System.out.println("¡ERROR! No se ha podido actualizar la fecha porque no es superior a la almacenada actualmente");
			
			System.out.println("La fecha de caducidad sigue siendo " + elizabeth.getFecha_caducidad() + "\n");
			
		}
		
		
		// Compruebo si los integrantes de la família son altos o no
		
		for (Persona p:personas) {
			
			if(p.esAlto()) {
				
				if(p.getSexo().equalsIgnoreCase("v")) {
				
					System.out.println(p.getNombre() + " es alto, mide " + p.getAltura());
					
				}else {
					
					System.out.println(p.getNombre() + " es alta, mide " + p.getAltura());
					
				}
				
			}else {
				
				if(p.getSexo().equalsIgnoreCase("v")) {
					
					System.out.println(p.getNombre() + " no es alto, mide " + p.getAltura());
					
				}else {
					
					System.out.println(p.getNombre() + " no es alta, mide " + p.getAltura());
					
				}
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("********************\n");

	}

}
