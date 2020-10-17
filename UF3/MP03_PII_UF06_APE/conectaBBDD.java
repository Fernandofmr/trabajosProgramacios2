// Programa para conectar con una base de datos

package programacion_2;

// Librerías importadas
import java.sql.Connection;
import java.sql.DriverManager;

public class conectaBBDD {

	public static void main(String[] args) {

		try {
			// Creo la conexión indicándole la ruta de la base de datos
			Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			System.out.println("Correcto");
			
			// Cierro la conexión
			miconexion.close();
			
		// Lanzo la excepción que genera el programa	
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
