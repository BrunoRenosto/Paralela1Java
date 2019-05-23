
package paralela;

public class Passeio extends Moto {
	
	private int assentos = 0;
	private double seguro = 0.0;
	
	
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
		this.impostoAno *= this.imposto * 12;  //imposto anual
	}
	
	
	public void ApagarVeiculoPS(){
		this.placa = "";
		this.ano = 0;
		this.marca = "";
		this.modelo = "";
		this.valor = 0.0;
		this.km = 0.0;
		this.imposto = 0.0;
		this.impostoAno = 0.0;
		this.assentos = 0;
		this.seguro = 0.0;
	}
	
	
}

