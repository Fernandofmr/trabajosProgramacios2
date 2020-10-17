// Programa para borrar todo el contenido de una tabla

package programacion_2;

// Librer�as importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class borrar_tablaBBDD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		try {
			// Establezco la conexi�n
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			// Informo de la conexi�n
			if(miConexion!=null) {
				System.out.println("Conectado a la BBDD\n");
			}
			
			// Pregunto al usuario qu� desea hacer
			System.out.println("Deseas borrar el contenido de la tabla 'alumnno'(yes/no)");
			String decision = entrada.nextLine();
			
			// Realizo la decisi�n del usuario
			if(decision.equalsIgnoreCase("yes")) {
				
				// Creo un statement para poder realizar el borrado de datos
				Statement miConsulta = miConexion.createStatement();
				
				// Realizo la modificaci�n
				miConsulta.executeUpdate("TRUNCATE TABLE alumno");
				
				// Informo de lo realizado
				System.out.println("Toda la informaci�n de la tabla alumno ha sido borrada");
				
				// Cierro el Statement
				miConsulta.close();
				
				// Cierro la conexi�n
				miConexion.close();
			}else if(decision.equalsIgnoreCase("no")){
				System.out.println("Has decidido no borrar la informaci�n");
			}else {
				System.out.println("Esa opci�n no est� contemplada");
			}
			
		}catch(Exception e) {
			// Informo del fallo en la conexi�n
			System.out.println("No se ha podido establecer la conexi�n con la BBDD\n");
		}

	}

}
