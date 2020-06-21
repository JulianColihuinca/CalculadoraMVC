package modelo;

import excepciones.Divisionpor0Exception;

public class ErrorState implements State {

	@Override
	public String suma(int op1, int op2) {
		return "Error: Presione AC para volver a estado normal";
	}

	@Override
	public String resta(int op1, int op2) {
		return "Error: Presione AC para volver a estado normal";
	}

	@Override
	public String division(int op1, int op2) throws Divisionpor0Exception {
		return "Error: Presione AC para volver a estado normal";
	}

	@Override
	public String multiplicacion(int op1, int op2) {
		return "Error: Presione AC para volver a estado normal";
	}

	@Override
	public String igual(String res) {
		return "Error: Presione AC para volver a estado normal";
	}

	@Override
	public String escribir(String actual, char op) {
		return "Error: Presione AC para volver a estado normal";
	}

}
