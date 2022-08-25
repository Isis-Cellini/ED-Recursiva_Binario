package controller;

public class binarioController {

	public binarioController() {
		// TODO Auto-generated constructor stub
	}
	public String converte (int numero) {
		String valor = "";
		int resultado = 0;
		if (numero ==0) { //condicao de parada quando o numero chegar a 0
		return "";
		}else {
		 resultado = numero % 2; //pega o resto do numero dividido por 2
		 valor = valor + Integer.toString(resultado); //converte o resultado em string;
		 }
		
	return valor + converte (numero / 2); //divide o numero por 2 ate o numero ser 0
	}
}
