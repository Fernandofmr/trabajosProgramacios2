// Programa para borrar todo el contenido de una tabla

package programacion_2;

// Librerías importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class borrar_tablaBBDD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		try {
			// Establezco la conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			// Informo de la conexión
			if(miConexion!=null) {
				System.out.println("Conectado a la BBDD\n");
			}
			
			// Pregunto al usuario qué desea hacer
			System.out.println("Deseas borrar el contenido de la tabla 'alumnno'(yes/no)");
			String decision = entrada.nextLine();
			
			// Realizo la decisión del usuario
			if(decision.equalsIgnoreCase("yes")) {
				
				// Creo un statement para poder realizar el borrado de datos
				Statement miConsulta = miConexion.createStatement();
				
				// Realizo la modificación
				miConsulta.executeUpdate("TRUNCATE TABLE alumno");
				
				// Informo de lo realizado
				System.out.println("Toda la información de la tabla alumno ha sido borrada");
				
				// Cierro el Statement
				miConsulta.close();
				
				// Cierro la conexión
				miConexion.close();
			}else if(decision.equalsIgnoreCase("no")){
				System.out.println("Has decidido no borrar la información");
			}else {
				System.out.println("Esa opción no está contemplada");
			}
			
		}catch(Exception e) {
			// Informo del fallo en la conexión
			System.out.println("No se ha podido establecer la conexión con la BBDD\n");
		}

	}

}
