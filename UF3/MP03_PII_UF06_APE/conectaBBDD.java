// Programa para conectar con una base de datos

package programacion_2;

// Librer�as importadas
import java.sql.Connection;
import java.sql.DriverManager;

public class conectaBBDD {

	public static void main(String[] args) {

		try {
			// Creo la conexi�n indic�ndole la ruta de la base de datos
			Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			System.out.println("Correcto");
			
			// Cierro la conexi�n
			miconexion.close();
			
		// Lanzo la excepci�n que genera el programa	
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
