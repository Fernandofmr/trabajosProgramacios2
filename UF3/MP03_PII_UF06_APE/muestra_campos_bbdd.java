// Programa que muestra todos los campos de una tabla de una bbdd

package programacion_2;

// Librerías importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class muestra_campos_bbdd {

	public static void main(String[] args) {
		
		try {
			// Establezco la conexión con la BBDD
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			// Informo que se ha establecido la conexión
			if(miConexion!=null) {
				System.out.println("Conectado a la BBDD correctamente\n");
			}
			
			// Creo un Statement que me permitirá generar una consulta
			Statement miConsulta = miConexion.createStatement();
			
			// Almaceno en un resultset el resultado de la consulta
			ResultSet resultado = miConsulta.executeQuery("SELECT * FROM alumno");
			
			// Leo e imprimo en consola el resultado de la consulta
			while(resultado.next()) {
				System.out.println(resultado.getInt("identificador") + "-" + resultado.getString("nombre") + "-" + 
									resultado.getString("apellidos") + "-"  + resultado.getString("dni") + "-" + 
									resultado.getString("curso") + "-" + resultado.getInt("edad"));
			}
			
			// Cierro el Statement
			miConsulta.close();
			
			// Cierro el ResultSet
			resultado.close();
			
			// Cierro la conexión con la BBDD
			miConexion.close();
		
			//Lanzo la excepción generada al fallar la conexión
		}catch(Exception e) {
			System.out.println("No se ha podido establecer la conexión con la BBDD\n");
		}

	}

}
