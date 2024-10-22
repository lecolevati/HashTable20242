package view;

import controller.NumerosController;

public class Principal {

	public static void main(String[] args) {
		NumerosController numerosController = new NumerosController();
		int[] vet = { 3, 69, 96, 73, 53, 42, 20, 51, 83, 50 };
		try {
			for (int numero : vet) {
				numerosController.add(numero);
			}
			numerosController.print(1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
