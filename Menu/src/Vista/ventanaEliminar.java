package Vista;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaEliminar extends JFrame {

	private JPanel contentPane;
	private JTextField textMarca;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaEliminar frame = new ventanaEliminar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaEliminar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa nombre");
		lblNewLabel.setBounds(27, 138, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa marca");
		lblNewLabel_1.setBounds(27, 65, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		textMarca = new JTextField();
		textMarca.setBounds(173, 62, 86, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(173, 135, 86, 20);
		contentPane.add(textNombre);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(92, 191, 89, 23);
		contentPane.add(btnEliminar);
		
		
		Button bVolver = new Button("Volver al inicio");
		bVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal frameIni = new  ventanaPrincipal();
				frameIni.setVisible(true);
				dispose();
				
			}
		});
		bVolver.setBounds(326, 229, 98, 22);
		contentPane.add(bVolver);
	}

}
