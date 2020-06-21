package vista;

import java.awt.event.ActionListener;


public interface IVista {
	
	void setActionListener(ActionListener controlador);
	void suma();
	void resta();
	void  division();
	void multiplicacion();
	void igual();
	void escribir();
	void encender();
	void apagar();
	void ac();
}
