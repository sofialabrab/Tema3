package Vista;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class ventanaFiltrar extends JFrame {
	
	private JTextField textPrecio;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaFiltrar frame = new ventanaFiltrar();
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
	public ventanaFiltrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Filtrar por precio ");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(113, 11, 264, 41);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewLabel = new JLabel("Ingrese precio referencial");
		lblNewLabel.setBounds(10, 79, 148, 14);
		contentPane.add(lblNewLabel);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(10, 104, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JButton btnNewButton = new JButton("Mayor");
		btnNewButton.setBounds(10, 154, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menor");
		btnNewButton_1.setBounds(145, 154, 89, 23);
		contentPane.add(btnNewButton_1);
		
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
