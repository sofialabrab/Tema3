package Vista;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import controlador.ControladorAgregar;
import modelo.FallaingresoException;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ventanaAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField nomProducto;
	private JTextField textCategoria;
	private JTextField textMarca;
	private JTextField textTamaño;
	private JTextField textPrecio;
	private JTextField textStock;
	private ControladorAgregar cAgregar = new ControladorAgregar(this);
	private Vista.ventanaPrincipal ventanaPrincipal ;

	public ventanaAgregar(Vista.ventanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Agregar producto");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(97, 0, 288, 42);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewLabel = new JLabel("Ingrese el nombre");
		lblNewLabel.setBounds(10, 75, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngreseLaCategoria = new JLabel("Ingrese la categoria");
		lblIngreseLaCategoria.setBounds(10, 102, 118, 14);
		contentPane.add(lblIngreseLaCategoria);
		
		JLabel lblIngreseElTamao = new JLabel("Ingrese el tama;o");
		lblIngreseElTamao.setBounds(10, 152, 118, 14);
		contentPane.add(lblIngreseElTamao);
		
		JLabel lblIngreseElPrecio = new JLabel("Ingrese el precio");
		lblIngreseElPrecio.setBounds(10, 177, 118, 14);
		contentPane.add(lblIngreseElPrecio);
		
		JLabel lblIngreseElStock = new JLabel("Ingrese el stock");
		lblIngreseElStock.setBounds(10, 202, 118, 14);
		contentPane.add(lblIngreseElStock);
		
		JLabel lblIngreseLaMarca = new JLabel("Ingrese la marca");
		lblIngreseLaMarca.setBounds(10, 127, 118, 14);
		contentPane.add(lblIngreseLaMarca);
		
		nomProducto = new JTextField();
		nomProducto.setBounds(150, 72, 124, 20);
		contentPane.add(nomProducto);
		nomProducto.setColumns(10);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(150, 99, 124, 20);
		contentPane.add(textCategoria);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(150, 124, 124, 20);
		contentPane.add(textMarca);
		
		textTamaño = new JTextField();
		textTamaño.setColumns(10);
		textTamaño.setBounds(150, 149, 124, 20);
		contentPane.add(textTamaño);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(150, 174, 124, 20);
		contentPane.add(textPrecio);
		
		textStock = new JTextField();
		textStock.setColumns(10);
		textStock.setBounds(150, 199, 124, 20);
		contentPane.add(textStock);
		
		Button bVolver = new Button("Volver al inicio");
		bVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				dispose();
			}
		});
		bVolver.setBounds(326, 229, 98, 22);
		contentPane.add(bVolver);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cAgregar.botonAgregar();
				} catch (FallaingresoException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setBounds(335, 123, 89, 23);
		contentPane.add(btnAgregar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(284, 98, 58, 22);
		contentPane.add(comboBox);
		
		comboBox.addItem("hola");
		comboBox.addItem("chao");
	}
	
	public JTextField getNomProducto() 
	{
		return nomProducto;
		
	}
	public JTextField getTextCategoria() 
	{
		return textCategoria;
		
	}
	public JTextField getTextMarca() 
	{
		return textMarca;
		
	}
	public JTextField getTextTamaño() 
	{
		return textTamaño;
		
	}
	public JTextField getTextPrecio() 
	{
		return textPrecio;
		
	}
	public JTextField getTextStock() 
	{
		return textStock;
		
	}
}
