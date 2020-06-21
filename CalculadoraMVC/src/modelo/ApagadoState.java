package modelo;

import excepciones.Divisionpor0Exception;


public class ApagadoState implements State{

	@Override
	public String suma(int op1, int op2) {
		return "Calculadora Apagada";
	}

	@Override
	public String resta(int op1, int op2) {
		return "Calculadora Apagada";
	}

	@Override
	public String division(int op1, int op2) throws Divisionpor0Exception {
		return "Calculadora Apagada";
	}

	@Override
	public String multiplicacion(int op1, int op2) {
		return "Calculadora Apagada";
	}

	@Override
	public String igual(String res) {
		return "Calculadora Apagada";
	}

	@Override
	public String escribir(String actual, char op) {
		return "Calculadora Apagada";
	}



}
