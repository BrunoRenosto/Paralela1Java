package paralela;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Paralela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Cadastro de uma moto
		Moto moto1 = new Moto();
		
		moto1.setPlaca("ABCD-1234");
		moto1.setAno(2000);
		moto1.setMarca("Honda");
		moto1.setModelo("CG150");
		moto1.setValor(2000.00);
		moto1.setKm(0.0);
		moto1.impostoM();
		
		//Cadastro de um passeio
		Passeio pas1 = new Passeio();
		
		pas1.setPlaca("EFGH-1234");
		pas1.setAno(2000);
		pas1.setMarca("BMW");
		pas1.setModelo("X1");
		pas1.setValor(20000.00);
		pas1.setKm(0.0);
		pas1.setAssentos(4);
		pas1.impostoP();
		pas1.setSeguroP();
		
		//Cadastro de um SUV
		suv suv1 = new suv();
		
		suv1.setPlaca("IJKL-1234");
		suv1.setAno(2000);
		suv1.setMarca("JEEP");
		suv1.setModelo("Renegate");
		suv1.setValor(25000.00);
		suv1.setKm(0.0);
		suv1.setAssentos(5);
		suv1.impostoS();
		suv1.setSeguroS();
		
		
		//imprime o imposto anual
		System.out.println(moto1.getImpostoAno());
		System.out.println(pas1.getImpostoAno());
		System.out.println(suv1.getImpostoAno());
		
		
		//criacao de uma lista
		List<Moto> lista = new ArrayList<Moto>();
		
		//adicao dos veiculos a lista
		lista.add(moto1);
		lista.add(pas1);
		lista.add(suv1);
		
		
		//comando de organizacao da lista
		//Arrays.sort(lista.value, Collections.reverseOrder());
		Collections.sort(lista);
		Collections.reverseOrder(lista);
		
		System.out.println("Digite a placa do veiculo q  vc deseja remover");
		Strintg veic = input.nextLine();
		
		for(int i = 0; i < lista.size(); i++) {
	        Moto mt = Moto lista.get(i);
	        if((mt.getPlaca()).equals(veic)){
	        	list.remove(i);
	        }
	    }
		


		
	}

}