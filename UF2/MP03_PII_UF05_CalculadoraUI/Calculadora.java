// Programa que ejecuta una calculadora

package programacion_2;

// Librerías importadas
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Calculadora {

	// Variables de la clase
	private JFrame frame;
	private JTextField textField;
	private boolean inicio=true;
	private int valor = 0;
	private int total = 0;
	private JButton btnNewButton_13, btnNewButton_14, btnNewButton_15, btnNewButton_16, btnNewButton_1, 
					btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5, btnNewButton_6, 
					btnNewButton_7, btnNewButton_8, btnNewButton_9, btnNewButton_10, btnNewButton_11, btnNewButton_12;
	private int numero1, numero2;
	private String operacion, fichero_txt, par_txt;
	private File fichero = new File("historico.txt");
	private FileWriter datos;
	private PrintWriter escritura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 
		// Código del JTexField dándole propiedades
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 36));
		textField.setEnabled(false);
		textField.setForeground(Color.BLACK);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setBackground(Color.WHITE);
		textField.setBounds(30, 11, 295, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Creación de botones con sus propiedades
		JButton btnNewButton = new JButton("C");
		// Código a ejecutar al pulsar este botón
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					numero1 = 0;
					numero2 = 0;
					textField.setText("");
					inicio = true;
					total = 0;
					btnNewButton_13.setEnabled(true);
					btnNewButton_14.setEnabled(true);
					btnNewButton_15.setEnabled(true);
					btnNewButton_16.setEnabled(true);
					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
					btnNewButton_5.setEnabled(true);
					btnNewButton_6.setEnabled(true);
					btnNewButton_7.setEnabled(true);
					btnNewButton_8.setEnabled(true);
					btnNewButton_9.setEnabled(true);
					btnNewButton_10.setEnabled(true);
					btnNewButton_11.setEnabled(true);
					btnNewButton_12.setEnabled(true);
				}catch(NumberFormatException ex) {
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(30, 99, 59, 76);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Par");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				numero1 = Integer.parseInt(textField.getText());
				if(numero1 % 2 == 0) {
					textField.setText("Par");
				}else {
					textField.setText("Impar");
				}
				
				par_txt = numero1 + " = " + textField.getText();
				
				try {
					
					if(!fichero.exists()) {
						try {
							fichero.createNewFile();
							datos = new FileWriter(fichero, true);
							escritura = new PrintWriter(datos);
							escritura.println("\t\tHISTÓRICO CALCULADORA\t\t\n");
							datos.close();
							escritura.close();
						}catch(IOException ex) {
							System.out.println("No se ha podido crear el fichero");
						}
						
					}
					datos = new FileWriter(fichero, true);
					escritura = new PrintWriter(datos);
					escritura.println(par_txt);
					datos.close();
					escritura.close();
				}catch(IOException ex) {
					System.out.println("No se ha podido escribir en el fichero");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(99, 99, 94, 76);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("1");
		btnNewButton_2.addActionListener(new EventoBotones());
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(30, 198, 59, 59);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("2");
		btnNewButton_3.addActionListener(new EventoBotones());
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(99, 198, 59, 59);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new EventoBotones());
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(168, 198, 60, 59);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new EventoBotones());
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(30, 281, 59, 59);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new EventoBotones());
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(99, 281, 59, 59);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new EventoBotones());
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(168, 281, 60, 59);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new EventoBotones());
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(30, 363, 59, 59);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new EventoBotones());
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9.setBounds(99, 363, 59, 59);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new EventoBotones());
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_10.setBounds(168, 362, 59, 60);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new EventoBotones());
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_11.setBounds(30, 443, 59, 59);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("=");
		btnNewButton_12.addActionListener(new Evento_resultado());
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_12.setBounds(99, 443, 129, 59);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new Evento_operaciones());
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_13.setBounds(266, 198, 59, 59);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new Evento_operaciones());
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_14.setBounds(266, 281, 59, 59);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new Evento_operaciones());
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_15.setBounds(266, 363, 59, 59);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("/");
		btnNewButton_16.addActionListener(new Evento_operaciones());
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_16.setBounds(266, 443, 59, 59);
		frame.getContentPane().add(btnNewButton_16);
	}
	
	// Código a ejecutar al pulsar botones numéricos
	class EventoBotones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			try {
				
				if(inicio) {
					inicio = false;
					textField.setText(e.getActionCommand());
				}else {
					valor = Integer.parseInt(textField.getText());
					textField.setText(valor + e.getActionCommand());
				}
				
			}catch(NumberFormatException ex) {
				textField.setText("error");
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
			}
			
		}
		
	}
	
	// Código a ejecutar al pulsar operaciones matemáticas
	class Evento_operaciones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int aux;
			
			
			try {
				
				operacion= e.getActionCommand();
				numero1 = Integer.parseInt(textField.getText());
				textField.setText("");
				inicio = true;
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				
			}catch(NumberFormatException ex) {
				textField.setText("error");
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
			}
			
		}
		
	}
	
	// Código a ejecutar al pulsar =
	class Evento_resultado implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
			
			try {
				
				numero2 = Integer.parseInt(textField.getText());
				inicio = true;
				
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);

				// Diferentes opciones según la operación marcada
				switch(operacion) {
				
				case "+":
					total = (numero1 + numero2);
					textField.setText("" + total);
					break;
					
				case "-":
					total = (numero1 - numero2);
					textField.setText("" + total);
					break;
					
				case "*":
					total = (numero1 * numero2);
					textField.setText("" + total);
					break;
					
				case "/":
					if(numero2==0) {
						textField.setText("Indeterminación");
						btnNewButton_13.setEnabled(false);
						btnNewButton_14.setEnabled(false);
						btnNewButton_15.setEnabled(false);
						btnNewButton_16.setEnabled(false);
						btnNewButton_1.setEnabled(false);
						btnNewButton_2.setEnabled(false);
						btnNewButton_3.setEnabled(false);
						btnNewButton_4.setEnabled(false);
						btnNewButton_5.setEnabled(false);
						btnNewButton_6.setEnabled(false);
						btnNewButton_7.setEnabled(false);
						btnNewButton_8.setEnabled(false);
						btnNewButton_9.setEnabled(false);
						btnNewButton_10.setEnabled(false);
						btnNewButton_11.setEnabled(false);
						btnNewButton_12.setEnabled(false);
					}else {
						total = (numero1 / numero2);
						textField.setText("" + total);
					}
					
					break;
					
				}
				
			}catch(NumberFormatException ex) {
				textField.setText("error");
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				
			}
			
			
			// Código que almacena las operaciones introducidas en la calculadora
			fichero_txt = numero1 + " " + operacion + " " + numero2 + " = " + total;
			
			try {
				
				if(!fichero.exists()) {
					try {
						fichero.createNewFile();
						datos = new FileWriter(fichero, true);
						escritura = new PrintWriter(datos);
						escritura.println("\t\tHISTÓRICO CALCULADORA\t\t\n");
						datos.close();
						escritura.close();
					}catch(IOException e) {
						System.out.println("No se ha podido crear el fichero");
					}
					
				}
				datos = new FileWriter(fichero, true);
				escritura = new PrintWriter(datos);
				escritura.println(fichero_txt);
				datos.close();
				escritura.close();
			}catch(IOException e) {
				System.out.println("No se ha podido escribir en el fichero");
			}
			
		}
		
	}
}
