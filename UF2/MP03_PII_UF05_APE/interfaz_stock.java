package programacion_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class interfaz_stock {

	// Declaración de las variables de clase
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_stock window = new interfaz_stock();
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
	public interfaz_stock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Declaración de los componentes de la interfaz con sus características
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 18));
		frame.setBounds(100, 100, 700, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stock Almacen");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setBounds(43, 11, 170, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pimientos");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(43, 83, 107, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tomates");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(43, 190, 107, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Patatas");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(43, 292, 107, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Precio");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(167, 60, 74, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cantidad");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(292, 62, 74, 17);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Subtotal");
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(477, 60, 74, 21);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setBounds(145, 84, 107, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_1.setBounds(280, 84, 107, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(Color.WHITE);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_2.setBounds(466, 84, 107, 33);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_3.setBounds(145, 191, 107, 33);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_4.setBounds(280, 191, 107, 33);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBackground(Color.WHITE);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_5.setBounds(466, 191, 107, 33);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_6.setBounds(145, 293, 107, 33);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_7.setBounds(280, 293, 107, 33);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBackground(Color.WHITE);
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_8.setBounds(466, 293, 107, 33);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Precio");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(167, 167, 74, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_8 = new JLabel("Cantidad");
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(292, 167, 67, 21);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Subtotal");
		lblNewLabel_9.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(477, 169, 67, 17);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Precio");
		lblNewLabel_10.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(167, 267, 74, 21);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Cantidad");
		lblNewLabel_11.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(292, 267, 67, 21);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Subtotal");
		lblNewLabel_12.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(477, 267, 74, 21);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBackground(Color.WHITE);
		textField_9.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_9.setBounds(466, 391, 107, 33);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total");
		lblNewLabel_13.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(488, 370, 74, 21);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_14.setBounds(145, 474, 152, 33);
		frame.getContentPane().add(lblNewLabel_14);
		
		JButton btnNewButton = new JButton("Calcular Stock");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
		// Pongo el botón a la escucha
		btnNewButton.addActionListener(new ActionListener() {
			// Código a ejecutar cuando se pulsa este botón
			public void actionPerformed(ActionEvent arg0) {
				
				float campo1, campo2, campo3, campo4, campo5, campo6;
				float subtotal1, subtotal2, subtotal3, total;
				
				try {
					
					campo1 = Float.parseFloat(textField.getText());
					campo2 = Float.parseFloat(textField_1.getText());
					campo3 = Float.parseFloat(textField_3.getText());
					campo4 = Float.parseFloat(textField_4.getText());
					campo5 = Float.parseFloat(textField_6.getText());
					campo6 = Float.parseFloat(textField_7.getText());
					
					subtotal1 = campo1 * campo2;
					subtotal2 = campo3 * campo4;
					subtotal3 = campo5 * campo6;
					
					total = subtotal1 + subtotal2 +subtotal3;
					
					lblNewLabel_14.setText("");
					
					textField_2.setText("" + subtotal1);
					textField_5.setText("" + subtotal2);
					textField_8.setText("" + subtotal3);
					
					textField_9.setText("" + total);
					
				}catch(NumberFormatException e){
					// Lanzamos un mensaje al usuario si el formato introducido no es válido
					lblNewLabel_14.setText("Formato erróneo");
				}
				
			}
			
		});
		btnNewButton.setBounds(429, 471, 161, 38);
		frame.getContentPane().add(btnNewButton);
	}

}
