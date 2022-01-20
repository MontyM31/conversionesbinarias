package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class VentanaOctal extends JFrame {

	private JPanel contentPane;
	private JTextField resultado;
	private JTextField numero;
	int Octal;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;


	public VentanaOctal() {
		setTitle("Octal a Binario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Convertir = new JButton("Convertir");
		Convertir.setBackground(Color.LIGHT_GRAY);
		Convertir.setForeground(Color.BLACK);
		Convertir.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Octal = Integer.parseInt(numero.getText());
				int decimal = 0;
				int potencia = 0;
				while (true) {
					if (Octal == 0) {
						break;
					}else {
						int temp = Octal % 10;
						decimal += temp * Math.pow(8, potencia);
						Octal = Octal / 10;
						potencia++;
					}
				}
				String binario = "";
				while(decimal > 0) {
					binario = decimal % 2 + binario;
					decimal = decimal / 2;
				}
				resultado.setText(binario);
				
			}
		});
		Convertir.setBounds(161, 190, 103, 38);
		contentPane.add(Convertir);
		
		resultado = new JTextField();
		resultado.setBounds(151, 141, 116, 38);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		numero = new JTextField();
		numero.setBounds(151, 54, 116, 38);
		contentPane.add(numero);
		numero.setColumns(10);
		
		lblNewLabel = new JLabel("OCTAL");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 29, 116, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("BINARIO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(151, 116, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ventana ven = new Ventana();
				ven.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(354, 236, 80, 25);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaOctal.class.getResource("/Imagenes/binary3.png")));
		lblNewLabel_2.setBounds(-10, 0, 444, 261);
		contentPane.add(lblNewLabel_2);
	}

}
