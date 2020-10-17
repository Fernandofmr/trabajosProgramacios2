// Programa que muestra los datos de una tabla ordenados ascendentemente

package programacion_2;

// Librer�as importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class muestraDatosOrdenados_bbdd {

	public static void main(String[] args) {

		try {
			// Creo la conexi�n con la BBDD
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos", "root", "");
			
			// Informo que la conexi�n se ha realizado
			if(miConexion!=null) {
				System.out.println("Conexi�n con la BBDD realizada correctamente\n");
			}
			
			// Creo un Statement para poder generar la consulta
			Statement miConsulta = miConexion.createStatement();
			
			// Creo un ResultSet para almacenar el resultado de la consulta
			ResultSet resultado = miConsulta.executeQuery("SELECT * FROM alumno ORDER BY apellidos ASC");
			
			// Leo e imprimo el resultado de la consulta
			while(resultado.next()) {
				System.out.println(resultado.getInt("identificador") + "-" + resultado.getString("nombre") + "-" +
									resultado.getString("apellidos") + "-" + resultado.getString("dni") + "-" + 
									resultado.getString("curso") + "-" + resultado.getInt("edad"));
			}
			
			// Cierro el ResultSet
			resultado.close();
			
			// Cierro el Statement
			miConsulta.close();
			
			// Cierro la conexi�n
			miConexion.close();
			
			//Lanzo la excepci�n generada al fallar la conexi�n
		}catch(Exception e) {
			System.out.println("No se ha podido establecer la conexi�n con la BBDD");
		}

	}

}
