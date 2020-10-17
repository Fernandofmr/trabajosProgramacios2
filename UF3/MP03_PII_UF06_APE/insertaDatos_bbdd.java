// Programa para insertar nuevos registros en una tabla

package programacion_2;

// Librer�as importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertaDatos_bbdd {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre, apellidos, dni, curso;
		int edad;

		try {
			// Creo la conexi�n
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			// Informo que se ha conectado a la BBDD
			if(miConexion!=null) {
				System.out.println("Se ha conectado a la BBDD satisfactoriamente\n");
			}
			
			// Almaceno los datos introducidos por el usuario
			System.out.println("**Recogiendo datos para la inserci�n de un nuevo alumno**\n");
			System.out.println("NOMBRE: ");	
			nombre = entrada.nextLine();
			
			System.out.println("APELLIDOS: ");
			apellidos = entrada.nextLine();
			
			System.out.println("DNI: ");
			dni = entrada.nextLine();
			
			System.out.println("CURSO: ");
			curso = entrada.nextLine();
			
			System.out.println("EDAD: ");
			edad = entrada.nextInt();
			
			// Creo un PreparedStatement que me permitir� insertar datos nuevos a la tabla
			PreparedStatement inserta = miConexion.prepareStatement("INSERT INTO alumno(nombre, apellidos, dni, curso, edad) "
																	+ "VALUES(?, ?, ?, ?, ?)");
			
			// Introduzco los datos que formar�n parte de la query
			inserta.setString(1, nombre);
			inserta.setString(2, apellidos);
			inserta.setString(3, dni);
			inserta.setString(4, curso);
			inserta.setInt(5, edad);
			
			// Ejecuto la query
			inserta.execute();
			
			// Cierro el PreparedStatement
			inserta.close();
			
			// Cierro la conexi�n
			miConexion.close();
			
			// Informo que la inserci�n se ha realizado satisfactoriamente
			System.out.println("Se ha insertado un nuevo registro en la tabla");
			
		}catch(Exception e) {
			// Informo en el supuesto que no se haya realizado la conexi�n
			System.out.println("No se ha podido establecer la conexi�n con la BBDD\n");
		}

	}

}
