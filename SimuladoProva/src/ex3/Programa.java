package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		LeitorArquivo leitorArquivo = new LeitorArquivo();
		List<Carga> cargas = leitorArquivo.lerArquivo();

		Collections.sort(cargas, Collections.reverseOrder());

		ArrayList<Carga> primeiraMetade = new ArrayList<>();
		ArrayList<Carga> segundaMetade = new ArrayList<>();
		boolean controle = false;

		for (Carga carga : cargas) {
			
			if (controle) {
				primeiraMetade.add(carga);
				controle = false;
			} else {
				segundaMetade.add(carga);
				controle = true;
			}

		}

		for (Carga carga : primeiraMetade) {
			System.out.println(carga);
		}

		Collections.sort(segundaMetade);

		for (Carga carga : segundaMetade) {
			System.out.println(carga);
		}

	}

}
