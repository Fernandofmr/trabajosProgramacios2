package programacion_2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Registrar_usuario {

	// Declaración de las variables de la clase
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar_usuario window = new Registrar_usuario();
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
	public Registrar_usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Declaración de los elementos de la interfaz y sus características
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar usuario");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(34, 34, 232, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(61, 123, 138, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A\u00F1o nacimiento");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(61, 175, 138, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(61, 244, 138, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Provincia");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(61, 314, 138, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(230, 123, 159, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_1.setBounds(230, 176, 159, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_2.setBounds(230, 244, 159, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_3.setBounds(230, 314, 159, 34);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_5.setBounds(131, 469, 343, 31);
		lblNewLabel_5.setForeground(Color.RED);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(399, 175, 28, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(399, 244, 28, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(399, 314, 28, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(401, 123, 28, 22);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Registrar usuario");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		// Ponemos el botón a la escucha
		btnNewButton.addActionListener(new ActionListener() {
			// Código a ejecutar al pulsar el botón
			public void actionPerformed(ActionEvent arg0) {
				
				String campo1, campo2, campo3, campo4;
				int agno;
				campo1 = textField.getText();
				campo2 = textField_1.getText();
				campo3 = textField_2.getText();
				campo4 = textField_3.getText();
				
				if(campo1.equals("") || campo2.equals("") || campo3.equals("") || campo4.equals("")) {
					
					lblNewLabel_5.setForeground(Color.RED);
					lblNewLabel_5.setText("*Todas las cajas son obligatorias");
					lblNewLabel_6.setText("*");
					lblNewLabel_7.setText("*");
					lblNewLabel_8.setText("*");
					lblNewLabel_9.setText("*");
					
				}else { 
				
					agno = Integer.parseInt(textField_1.getText());
					
					if(agno>=1900 && agno<=2019) {
						campo2 = "ok";
					}
					
					if(campo2.equals("ok")) {
						
						if(campo3.equalsIgnoreCase("barcelona") || campo3.equalsIgnoreCase("hospitalet")) {
							
							if(campo4.equalsIgnoreCase("Barcelona")) {
								
								lblNewLabel_5.setForeground(Color.GREEN);
								lblNewLabel_5.setText("Registro correcto");
								lblNewLabel_6.setText("");
								lblNewLabel_7.setText("");
								lblNewLabel_8.setText("");
								lblNewLabel_9.setText("");
								
							}else {
								lblNewLabel_5.setForeground(Color.RED);
								lblNewLabel_5.setText("*Provincia no válida");
								lblNewLabel_8.setText("*");
							}
							
						}else if(campo3.equalsIgnoreCase("leganes")) {
							
							if(campo4.equalsIgnoreCase("Madrid")) {
								
								lblNewLabel_5.setForeground(Color.GREEN);
								lblNewLabel_5.setText("Registro correcto");
								lblNewLabel_6.setText("");
								lblNewLabel_7.setText("");
								lblNewLabel_8.setText("");
								lblNewLabel_9.setText("");
								
							}else {
								lblNewLabel_5.setForeground(Color.RED);
								lblNewLabel_5.setText("*Provincia no válida");
								lblNewLabel_8.setText("*");
							}
							
						}else {
							lblNewLabel_5.setForeground(Color.RED);
							lblNewLabel_5.setText("*Ciudad no válida");
							lblNewLabel_7.setText("*");
						}
						
						
						
					}else {
						lblNewLabel_5.setForeground(Color.RED);
						lblNewLabel_5.setText("*Año de nacimiento erróneo");
						lblNewLabel_6.setText("*");
					}
				
				}
				
			}
			
		});
		btnNewButton.setBounds(162, 413, 227, 34);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
