package Vista;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaModificar extends JFrame {

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
					ventanaModificar frame = new ventanaModificar();
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
	public ventanaModificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Modificar producto");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(96, 11, 241, 31);
		contentPane.add(lblNewJgoodiesTitle);
		
		textMarca = new JTextField();
		textMarca.setBounds(124, 67, 111, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(124, 101, 111, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lbIngresarMarca = new JLabel("Ingrese marca");
		lbIngresarMarca.setBounds(20, 70, 94, 14);
		contentPane.add(lbIngresarMarca);
		
		JLabel lblIngreseNombre = new JLabel("Ingrese nombre");
		lblIngreseNombre.setBounds(20, 104, 94, 14);
		contentPane.add(lblIngreseNombre);
		
		JButton btnNombre = new JButton("Nombre");
		btnNombre.setBounds(10, 149, 89, 23);
		contentPane.add(btnNombre);
		
		JButton btnPrecio = new JButton("Precio");
		btnPrecio.setBounds(10, 183, 89, 23);
		contentPane.add(btnPrecio);
		
		JButton btnCategoria = new JButton("Categoria");
		btnCategoria.setBounds(146, 149, 89, 23);
		contentPane.add(btnCategoria);
		
		JButton btnStock = new JButton("Stock");
		btnStock.setBounds(146, 183, 89, 23);
		contentPane.add(btnStock);
		
		JButton btnTamao = new JButton("Tamaño");
		btnTamao.setBounds(263, 149, 89, 23);
		contentPane.add(btnTamao);
		
		
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
