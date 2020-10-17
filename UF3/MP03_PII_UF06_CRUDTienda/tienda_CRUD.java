// Programa CRUD para una tienda

package programacion_2;

// Librerías importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class tienda_CRUD {

	public static void main(String[] args) {
		
		// Creo un objeto de tipo Scanner para introducir información por teclado
		Scanner entrada = new Scanner(System.in);
		
		// Declaro las variable que voy a utilizar en el programa
		String usuario, password, seguir="", nombre;
		boolean permitido=false, continua=true, existe=false;
		int opcion=0, cantidad, id_producto;
		float precio;
		
		Statement miConsulta;
		PreparedStatement ps;
		ResultSet resultado;

		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			
			// Indico que se ha conectado a la BBDD
			if(miConexion!=null) {
				System.out.println("Conectado a la BBDD");
			}
			
			
			do {
				
				do {
					// Recojo los datos del usuario y los datos
					usuario = JOptionPane.showInputDialog("Introduce el login: ");
					password = JOptionPane.showInputDialog("Introduce el password: ");
					
					// Creo un Statement para generar la consulta
					miConsulta = miConexion.createStatement();
					
					// Lanzo la consulta y almaceno el resultado
					resultado = miConsulta.executeQuery("SELECT login, password FROM usuarios WHERE login='" + usuario + "'" + 
														" AND password='" + password + "'");
					
					if(resultado.next()) {
						permitido = true;
						System.out.println("Acceso permitido");
					}else {
						permitido = false;
						System.out.println("Acceso denegado");
					}
					
					resultado.close();
					miConsulta.close();
				}while(permitido==false);
				
				if(permitido) {
					do {
						// Menú del programa
						System.out.println("\n***GESTOR DE PRODUCTOS***\n"
								+ "1)Crear un producto\n"
								+ "2)Listar todos los productos\n"
								+ "3)Modificar un producto\n"
								+ "4)Borrar un producto\n"
								+ "0)Salir del programa\n"
								+ "\nOpción: _\n");
						
						opcion = entrada.nextInt();
						entrada.nextLine();
						
						// Diferentes opciones
						switch(opcion) {
						
						case 1:
							// Recojo datos nuevo producto
							System.out.println("Introduzca el nombre del producto");
							nombre = entrada.nextLine();
							
							System.out.println("Introduzca el precio unitario del producto");
							precio = entrada.nextFloat();
							entrada.nextLine();
							
							System.out.println("Introduzca la cantidad del producto");
							cantidad = entrada.nextInt();
							entrada.nextLine();
							
							// Creo un objeto PreparedStatement para realizar la query que introduce el producto
							ps=miConexion.prepareStatement("INSERT INTO productos(nombre, precio, cantidad) "
															+ "VALUES(?, ?, ?)");
							
							// Introducimos los valores de forma dinámica
							ps.setString(1, nombre);
							ps.setFloat(2, precio);
							ps.setInt(3, cantidad);
							
							// Ejecutamos la query final
							ps.execute();
							
							// Cerramos el PreparedStatement
							ps.close();
							
							// Informamos de la acción realizada
							System.out.println("Producto creado correctamente");
							
							break;
							
							
						case 2:
							System.out.println("-----Listado de productos-----");
							
							// Creo un Statement para poder ejecutar la consulta
							miConsulta = miConexion.createStatement();
							
							// Creo un ResultSet para almacenar el resultado de la consulta
							resultado = miConsulta.executeQuery("SELECT * FROM productos");
							
							// Leo e imprimo el resultado
							while(resultado.next()) {
								System.out.println(resultado.getInt("id") + " " + resultado.getString("nombre") + " " + 
													resultado.getFloat("precio") + "€ " + resultado.getInt("cantidad"));
							}
							
							// Cierro el ResultSet
							resultado.close();
							
							// Cierro el Statement
							miConsulta.close();
							
							break;
							
							
						case 3:
							// Creo un Statement para poder ejecutar la consulta
							miConsulta = miConexion.createStatement();
							
							// Creo un ResultSet para almacenar el resultado de la consulta
							resultado = miConsulta.executeQuery("SELECT * FROM productos");
							
							// Leo e imprimo el resultado
							while(resultado.next()) {
								System.out.println(resultado.getInt("id") + " " + resultado.getString("nombre") + " " + 
													resultado.getFloat("precio") + "€ " + resultado.getInt("cantidad"));
							}
							
							// Recojo los datos del producto a modificar
							System.out.println("\nIntroduce, a continuación, los datos del producto a modificar\n");
							
							System.out.println("Introduzca el identificador del producto");
							id_producto = entrada.nextInt();
							entrada.nextLine();
							
							// Compruebo si existe el identificador 
							miConsulta = miConexion.createStatement();
							
							resultado = miConsulta.executeQuery("SELECT id FROM productos");
							
							while(resultado.next()) {
								if(id_producto==resultado.getInt("id")) {
									existe = true;
								}
							}
							
							if(existe) {
								// Sigo recogiendo los datos 
								System.out.println("Introduzca el nombre del producto");
								nombre = entrada.nextLine();
								
								System.out.println("Introduzca el precio unitario del producto");
								precio = entrada.nextFloat();
								entrada.nextLine();
								
								System.out.println("Introduzca la cantidad del producto");
								cantidad = entrada.nextInt();
								entrada.nextLine();
								try {
									// Creo un PreparedStatement para poder lanzar la query de la modificación
									ps = miConexion.prepareStatement("UPDATE productos SET nombre=?, precio=?, cantidad=? WHERE id=?");
									ps.setString(1, nombre);
									ps.setFloat(2, precio);
									ps.setInt(3, cantidad);
									ps.setInt(4, id_producto);
									
									ps.executeUpdate();
									
									ps.close();
									
									System.out.println("Producto modificado correctamente");
								}catch(SQLException e) {
									System.out.println("El producto no se ha podido modificar");
								}
							}else {
								System.out.println("El id seleccionado no existe");
							}						
														
							break;
							
							
						case 4:
							// Me ha parecido oportuno imprimir de nuevo la lista de productos
							
							// Creo un Statement para poder ejecutar la consulta
							miConsulta = miConexion.createStatement();
							
							// Creo un ResultSet para almacenar el resultado de la consulta
							resultado = miConsulta.executeQuery("SELECT * FROM productos");
							
							// Leo e imprimo el resultado
							while(resultado.next()) {
								System.out.println(resultado.getInt("id") + " " + resultado.getString("nombre") + " " + 
													resultado.getFloat("precio") + "€ " + resultado.getInt("cantidad"));
							}
							
							// Recojo los datos del producto a modificar
							System.out.println("\nIntroduce, a continuación, los datos del producto a modificar\n");
							
							System.out.println("Introduzca el identificador del producto");
							id_producto = entrada.nextInt();
							entrada.nextLine();
							
							// Compruebo si existe el identificador 
							miConsulta = miConexion.createStatement();
							
							resultado = miConsulta.executeQuery("SELECT id FROM productos");
							
							while(resultado.next()) {
								if(id_producto==resultado.getInt("id")) {
									existe = true;
								}
							}
							
							if(existe) {							
							
								try {
									
									// Creo un PreparedStatement para poder realizar el borrado
									ps = miConexion.prepareStatement("DELETE FROM productos WHERE id=?");
									// Introduzco en la query el id almacenado
									ps.setInt(1, id_producto);
									// Ejecuto la sentencia SQL
									ps.execute();
									// Cierro el PreparedStatement
									ps.close();
									System.out.println("Producto borrado correctamente");
									
								}catch(SQLException e) {
									System.out.println("El producto no pudo ser eliminado");
								}							
							}else {
								System.out.println("El identificador no existe");
							}
							
							
							break;
							
							
						case 0:
							System.out.println("¿Estás seguro que deseas abandonar el programa? (S/N)");
							seguir = entrada.nextLine();
							
							if(seguir.equalsIgnoreCase("s")) {
								continua = false;
							}
							
							break;
							
							
						default:
							System.out.println("Opción errónea");
							break;
							
						}
						
					}while(opcion<0 || opcion>4 || continua);
				}
				
				
			}while(seguir.equalsIgnoreCase("n"));
			
			miConexion.close();
			
			// Salta la excepción
		}catch(Exception e) {
			// Informamos que no se ha conectado con la BBDD
			System.out.println("No se ha podido establecer la conexión con la BBDD");
		}

	}

}
