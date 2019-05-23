package paralela;

public class suv extends Passeio {
	
	
	//seter do seguro do SUV
	public void setSeguroS(int valor) {
		
		this.seguro = valor * 0.015;
	}
	

	//calcula o imposto sobre o veiculo SUV
	public void impostoS(Double valor){
		this.imposto = valor * 0.08;
		this.impostoAno = this.imposto * 12; //imposto anual
	}
	
}