package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private Vista.ventanaAgregar ventanaAgregar = new Vista.ventanaAgregar(this);
	private Vista.ventanaMostrar ventanaMostrar = new Vista.ventanaMostrar(this);

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Inventario");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(202, 11, 141, 50);
		contentPane.add(lblNewJgoodiesTitle);
		
		JButton btnAP = new JButton("Agregar producto");
		btnAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaAgregar.setVisible(true);
				dispose();
				
			}
		});
		btnAP.setBounds(10, 76, 153, 32);
		contentPane.add(btnAP);
		
		JButton btnMostrarProductos = new JButton("Mostrar productos");
		btnMostrarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaMostrar.setVisible(true);
				dispose();
			}
		});
		btnMostrarProductos.setBounds(10, 119, 153, 32);
		contentPane.add(btnMostrarProductos);
		
		JButton btnModificarProductos = new JButton("Modificar productos");
		btnModificarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cambiar
				ventanaMostrar.setVisible(true);
				dispose();
			}
		});
		btnModificarProductos.setBounds(10, 165, 153, 32);
		contentPane.add(btnModificarProductos);
		
		JButton btnEliminarProductos = new JButton("Eliminar Productos");
		btnEliminarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cambiar
				ventanaEliminar frameAgr = new  ventanaEliminar();
				frameAgr.setVisible(true);
				dispose();
			}
		});
		btnEliminarProductos.setBounds(10, 213, 153, 32);
		contentPane.add(btnEliminarProductos);
		
		JButton btnBuscarProducto = new JButton("Buscar producto");
		btnBuscarProducto.setBounds(379, 81, 153, 32);
		contentPane.add(btnBuscarProducto);
		
		JButton btnFiltrarProducto = new JButton("Filtrar producto");
		btnFiltrarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cambiar
				ventanaFiltrar frameAgr = new  ventanaFiltrar();
				frameAgr.setVisible(true);
				dispose();
			}
		});
		btnFiltrarProducto.setBounds(379, 124, 153, 32);
		contentPane.add(btnFiltrarProducto);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.setBounds(379, 170, 153, 32);
		contentPane.add(btnReporte);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(379, 213, 153, 32);
		contentPane.add(btnSalir);
	}
}