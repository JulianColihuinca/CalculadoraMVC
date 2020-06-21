package modelo;

import java.util.Observable;

import excepciones.Divisionpor0Exception;

public class  EncendidoState implements State {

	@Override
	public String suma(int op1, int op2) {
		return Integer.toString(op1+op2);
	}

	@Override
	public String resta(int op1, int op2) {
		return Integer.toString(op1-op2);
	}

	@Override
	public String division(int op1, int op2) throws Divisionpor0Exception {
		if (op2!=0)
		   return Integer.toString(op1/op2);
		else
			throw new Divisionpor0Exception();
	}

	@Override
	public String multiplicacion(int op1, int op2) {
		return Integer.toString(op1*op2);
	}

	@Override
	public String igual(String res) {
		return res;
	}

	@Override
	public String escribir(String actual, char op) {
		return actual+op;
	}

	

}
