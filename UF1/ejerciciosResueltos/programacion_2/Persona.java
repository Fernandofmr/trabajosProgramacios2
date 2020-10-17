package programacion_2; 


// Creación de la clase Persona, que hereda de la clase Familia

public class Persona extends Familia{
	
	// Declaración de atributos para la clase (encapsulados)
	
	private String nombre;
	private int edad;
	private String dni;
	private String fecha_caducidad;
	private String sexo;
	private double peso;
	private double altura;
	private int dia, mes, agno;
	
	
	// Creación de constructores (sobrecarga)
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public Persona(String dni) {
		
		this.dni = dni;
		
	}
	
	
	// Creación de métodos getters y setters
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	
	public void setFecha_caducidad(int agno, int mes, int dia) {
		this.agno = agno;
		this.mes = mes;
		this.dia = dia;
		fecha_caducidad = dia + "/" + mes + "/" + agno;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	// Creación de métodos adicionales:
	
	// -Determina si es mayor de edad
	public boolean esMayorDeEdad(int edad) {
		
		if(edad>=18) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
	// -Determina si es mujer
	public boolean esMujer(String sexo) {
		
		if(sexo.equalsIgnoreCase("m")) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
	// -Devuelve el valor de todos los parámetros
	public String print() {
		
		String valores= "--------------------\n"
				+ "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n"
				+ "DNI: " + dni + "\n"
				+ "FECHA DE CADUCIDAD: " + fecha_caducidad + "\n"
				+ "SEXO: " + sexo + "\n"
				+ "PESO: " + peso + " kg.\n"
				+ "ALTURA: " + altura + " cm.\n"
				+ "--------------------";
		
		return valores;
		
	}
	
	
	// -Devuelve si el dni introducido es correcto
	public boolean esDNICorrecto(String dni) {
		
		int numero = Integer.parseInt(dni.substring(0, 7));;
		String letra = dni.substring(8);
		boolean resultado;
		
		try {
			
            Integer.parseInt(letra);
            
            resultado = false;
            
        } catch (NumberFormatException excepcion) {
        	
            resultado = true;
            
        }
		
		if (dni.length()==9) {			
			
			if(numero>=0 && resultado==true) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		}else {
			
			return false;
		}
		
	}


	// Método obligado a implementarse porque la clase hereda de Familia
	
	public void calculaIMC(double peso, double altura) {
		
		peso = Math.round(peso);
		altura = Math.pow(altura, 2);
		
		double imc = peso / altura;
		
		if(imc >= 25) {
			
			System.out.println("El IMC de " + nombre + " está por encima del barómetro establecido \n"
					+ "pero no creo que debas preocuparte de la opinión de este humilde programa");
			
		}else if(imc < 18.5) {
			
			System.out.println("El IMC de " + nombre + " está por debajo de los límites establecidos \n"
					+ "por este programa. Por favor, revísalo con un especialista de verdad.");
			
		}else {
			
			System.out.println("El IMC de " + nombre + " está perfecto.");
			
		}
		
	}
	
	
	// Métodos implementados marcados por la interfaz Humano
	
	public boolean actualizaDNI(int dia, int mes, int agno) {
		
		if(this.agno > agno) {
			
			return false;
			
		}else if(this.agno == agno){
			
			if(this.mes > mes) {
				
				return false;
				
			}else if(this.mes == mes) {
				
				if(this.dia > dia) {
					
					return false;
					
				}else if(this.dia == dia) {
					
					return false;
					
				}else {
					
					this.dia = dia;
					this.mes = mes;
					this.agno = agno;
					this.setFecha_caducidad(agno, mes, dia);
					
					return true;
					
				}
				
			}else {
				
				this.dia = dia;
				this.mes = mes;
				this.agno = agno;
				this.setFecha_caducidad(agno, mes, dia);
				
				return true;
				
			}
			
		}else {
			
			this.dia = dia;
			this.mes = mes;
			this.agno = agno;
			this.setFecha_caducidad(agno, mes, dia);
			
			return true;
			
		}
		
	}

	public boolean esAlto() {

		if(this.altura > 1.80) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}


}
