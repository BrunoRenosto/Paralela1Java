package paralela;

public class Passeio extends Moto {
	
	protected int assentos = 0;
	protected double seguro = 0.0;
	
	
	//seters
	public void setAssentos(int defAssentos) {
		if(this.assentos == 0) {
			this.assentos = defAssentos;
		}
	}
	
	public void setSeguroP() {
		
		this.seguro = this.valor * 0.01;
	}
	//calcula o imposto sobre o veiculo passeio
	public void impostoP(){
		this.imposto = this.valor * 0.05;
		this.impostoAno += this.imposto;  //imposto anual
	}
	
	
	public void ApagarVeiculoPS(){
		this.placa = this.setPlaca("");
		this.ano = this.setAno(0);
		this.marca = this.setMarca("");
		this.modelo = this.setModelo("");
		this.valor = this.setValor(0.0);
		this.km = this.setKm(0.0);
		this.impostoAno = this.impostoAno - this.impostoP();
		this.imposto = this.impostoP();
		this.assentos = 0;
		this.seguro = 0.0;
	}
	
	
}