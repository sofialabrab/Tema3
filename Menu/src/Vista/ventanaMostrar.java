package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import controlador.ControladorAgregar;
import controlador.ControladorMostrar;
import modelo.FallaingresoException;
import modelo.NoregistroException;

import java.awt.Font;

public class ventanaMostrar extends JFrame {

	private JPanel contentPane;
	private ControladorMostrar cMostrar = new ControladorMostrar(this);
	private Vista.ventanaPrincipal ventanaPrincipal ;

	public ventanaMostrar(Vista.ventanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button buttonAlimentos = new Button("Alimentos");
		buttonAlimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cMostrar.botonMostrarAlimento();
				} catch (NoregistroException | IOException | FallaingresoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonAlimentos.setBounds(45, 84, 70, 22);
		contentPane.add(buttonAlimentos);
		
		Button buttonAseo = new Button("Aseo");
		buttonAseo.setBounds(159, 84, 70, 22);
		contentPane.add(buttonAseo);
		
		Button buttonTecnologia = new Button("Tecnologia");
		buttonTecnologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonTecnologia.setBounds(281, 84, 70, 22);
		contentPane.add(buttonTecnologia);
		
		Button buttonTM = new Button("Mostrar todo");
		buttonTM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cMostrar.botonMostrarTodo();
				} catch (NoregistroException | IOException | FallaingresoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonTM.setBounds(105, 152, 178, 22);
		contentPane.add(buttonTM);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Mostrar productos");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewJgoodiesTitle.setBounds(90, 11, 219, 40);
		contentPane.add(lblNewJgoodiesTitle);
		
		Button bVolver = new Button("Volver al inicio");
		bVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				dispose();
				
			}
		});
		bVolver.setBounds(326, 229, 98, 22);
		contentPane.add(bVolver);
	}
}
