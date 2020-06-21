package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.ApagadoState;
import modelo.EncendidoState;
import modelo.State;

public class CalculadoraVentana extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panelNorte;
	private JPanel panelCentral;
	private JPanel panelEste;
	//Paneles
	
	private JTextField pantalla;
	//Pantalla
	
	private JButton numeros[]=new JButton[10] ;
	{
		for (int i=0;i<10;i++)
			  numeros[i]= new JButton(Integer.toString(i));
	}
	private JButton botonSuma=new JButton("+");
	private JButton botonResta= new JButton("-");
	private JButton botonProducto= new JButton("*");
	private JButton botonDivision= new JButton("/");
	private JButton botonIgual= new JButton("=");
	private JButton botonOn= new JButton("ON");
	private JButton botonOff= new JButton("OFF");
	private JButton botonAC= new JButton("AC");
	//Botones
	
	private ActionListener controlador;
	//Controlador
	
	private State estadoActual;
	//Estado
	
	private String op1, op2;
	//Operandos
	
	public CalculadoraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.estadoActual=new ApagadoState();
		
		//PanelNorte
		this.panelNorte=new JPanel();
		this.pantalla= new JTextField();
		this.pantalla.setColumns(25);
		JPanel encierraPantalla= new JPanel();
		encierraPantalla.add(this.pantalla);
		this.panelNorte.add(encierraPantalla);
		this.contentPane.add(this.panelNorte,BorderLayout.PAGE_START);
		
		// PanelCentral
		this.panelCentral= new JPanel();
		this.panelCentral.setLayout(new GridLayout(0,3));
		this.panelCentral.add(this.botonOn);
		this.panelCentral.add(this.botonOff);
		this.panelCentral.add(this.botonAC);
		for (int i=1;i<10;i++)
			this.panelCentral.add(this.numeros[i]);
		this.panelCentral.add(this.numeros[0]);
		this.contentPane.add(this.panelCentral,BorderLayout.CENTER);
		
		
		// Panel Este
		this.panelEste=new JPanel();
		this.panelEste.setLayout(new GridLayout(0,1));
		this.panelEste.add(botonSuma);
		this.panelEste.add(botonResta);
		this.panelEste.add(botonProducto);
		this.panelEste.add(botonDivision);
		this.panelEste.add(botonIgual);
		this.contentPane.add(this.panelEste,BorderLayout.EAST);
		
		this.setVisible(true);
		
	}

	@Override
	public void setActionListener(ActionListener controlador) {
		this.controlador= controlador;	
	}
	
	private void extraeOperandos(String op) {
		
	}

	@Override
	public void suma() {
		
		
	}

	@Override
	public void resta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void igual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribir() {
		
		
	}

	@Override
	public void encender() {
		this.estadoActual= new EncendidoState();
	}

	@Override
	public void apagar() {
		this.estadoActual= new ApagadoState();
	}

	@Override
	public void ac() {
		if (this.pantalla.getText().equals("Error: Presione AC para volver a estado normal"))
			  this.estadoActual= new EncendidoState();
	}

}
