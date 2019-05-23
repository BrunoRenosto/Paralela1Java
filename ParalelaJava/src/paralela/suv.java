package paralela;

public class suv extends Passeio {
	
	
	//seter do seguro do SUV
	private void setSeguroS() {
		
		this.seguro = this.valor * 0.015;
	}
	

	//calcula o imposto sobre o veiculo SUV
	public void impostoS(){
		this.imposto = this.valor * 0.08;
		this.impostoAno += this.imposto; //imposto anual
	}
	
	public void ApagarVeiculoPS(){
		this.placa = this.setPlaca("");
		this.ano = this.setAno(0);
		this.marca = this.setMarca("");
		this.modelo = this.setModelo("");
		this.valor = this.setValor(0.0);
		this.km = this.setKm(0.0);
		this.impostoAno = this.impostoAno - this.impostoS();
		this.imposto = this.impostoS();
		this.assentos = 0;
		this.seguro = 0.0;
	}
	
}