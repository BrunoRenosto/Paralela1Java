package paralela;

import java.util.Arrays;
import java.util.Collections;

public class Paralela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Cadastro de uma moto
		Moto moto1 = new Moto();
		
		moto1.setPlaca("ABCD-1234");
		moto1.setAno(2000);
		moto1.setMarca("Honda");
		moto1.setModelo("CG150");
		moto1.setValor(2000.00);
		moto1.setKm(0.0);
		moto1.ImpostoM();
		
		//Cadastro de um passeio
		Passeio pas1 = new Passeio();
		
		pas1.setPlaca("EFGH-1234");
		pas1.setAno(2000);
		pas1.setMarca("BMW");
		pas1.setModelo("X1");
		pas1.setValor(20000.00);
		pas1.setKm(0.0);
		pas.setAssentos(4);
		pas1.ImpostoP();
		pas1.setSeguro();
		
		//Cadastro de um SUV
		suv suv1 = new suv();
		
		suv1.setPlaca("IJKL-1234");
		suv1.setAno(2000);
		suv1.setMarca("JEEP");
		suv1.setModelo("Renegate");
		suv1.setValor(25000.00);
		suv1.setKm(0.0);
		suv1.setAssentos(5);
		suv1.ImpostoS();
		suv1.setSeguro();
		
		
		//imprime o imposto anual
		System.out.println(moto1.getImpostoAno());
		System.out.println(pas1.getImpostoAno());
		System.out.println(suv1.getImpostoAno());
		
		
		//criacao de uma lista
		List<Veiculo> lista = new ArrayList<Veiculo>();
		
		//adicao dos veiculos a lista
		lista.add(moto1);
		lista.add(pas1);
		lista.add(suv1);
		
		//comando de organizacao da lista
		Arrays.sort(lista.value, Collections.reverseOrder());
		
		//para remover o veiculo usar lista.remove(nome_do_veiculo);
		//ou lista.delete(nome_do_veiculo);
		
		
	}

}
