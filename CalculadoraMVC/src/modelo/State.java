package modelo;

import excepciones.Divisionpor0Exception;

public interface State {
	
	String suma(int op1,int op2);
	String resta(int op1,int op2);
	String division(int op1,int op2) throws Divisionpor0Exception;
	String multiplicacion(int op1,int op2);
	String igual(String res);
	String escribir(String actual,char op );
}
