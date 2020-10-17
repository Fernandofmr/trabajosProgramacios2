package programacion_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class interfaz_viajes {

	// Declaración de las variable de clase
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
					interfaz_viajes window = new interfaz_viajes();
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
	public interfaz_viajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Declaración de los elementos de la interfaz con sus características
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Viajes");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 26));
		lblNewLabel.setBounds(48, 41, 118, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roma");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 129, 82, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Berl\u00EDn");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_2.setBounds(48, 184, 82, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tokio");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_3.setBounds(48, 243, 82, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lisboa");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_4.setBounds(48, 306, 82, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Precio");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_5.setBounds(176, 89, 82, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(160, 129, 138, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 184, 138, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 243, 138, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 306, 138, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Mejor Precio");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(176, 458, 118, 29);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel_7.setBounds(176, 501, 179, 34);
		frame.getContentPane().add(lblNewLabel_7);

		JButton btnNewButton = new JButton("Indicar mejor precio");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnNewButton.setBounds(48, 394, 307, 41);
		// Ponemos el botón a la escucha
		btnNewButton.addActionListener(new ActionListener() {
			// Código a ejecutar cuando pulsamos este botón
			public void actionPerformed(ActionEvent arg0) {
				
				int campo1, campo2, campo3, campo4, aux;
				
				try {
					
					campo1 = Integer.parseInt(textField.getText());
					campo2 = Integer.parseInt(textField_1.getText());
					campo3 = Integer.parseInt(textField_2.getText());
					campo4 = Integer.parseInt(textField_3.getText());
					aux = campo1 + campo2 + campo3 + campo4;
					
					int campos[] = {campo1, campo2, campo3, campo4};
					
					for(int i=0; i<4; i++) {
						
						if(campos[i]<aux) {
							aux = campos[i];
						}
						
					}
					
					if(aux==campo1) {
						lblNewLabel_7.setForeground(Color.BLUE);
						lblNewLabel_7.setText("Roma - " + aux + "€");
					}else if(aux==campo2) {
						lblNewLabel_7.setForeground(Color.BLUE);
						lblNewLabel_7.setText("Berlín - " + aux + "€");
					}else if(aux==campo3) {
						lblNewLabel_7.setForeground(Color.BLUE);
						lblNewLabel_7.setText("Tokio - " + aux + "€");
					}else if(aux==campo4) {
						lblNewLabel_7.setForeground(Color.BLUE);
						lblNewLabel_7.setText("Lisboa - " + aux + "€");
					}
					
					
				}catch(NumberFormatException e) {
					// Mandamos un mensaje al usuario si el formato introducido no es válido
					lblNewLabel_7.setText("Formato no válido");
				}
				
			}
			
		});
		frame.getContentPane().add(btnNewButton);
		
	}

}
