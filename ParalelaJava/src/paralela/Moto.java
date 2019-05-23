
package paralela;

public class Moto{
	//criacao dos atribudos da classe Moto
	private String placa = "";
	private int ano = 0;
	private String marca = "";
	private String modelo = "";
	private Double valor = 0.0;
	private Double km = 0.0;
	private Double imposto = 0.0;
	private Double impostoAno = 0.0;
	
	//seters
	
	public void setPlaca(String Placa) {
		if(this.placa.equals("")) {
		this.placa = Placa;
		}
	}
	
	public void setAno(int defAno) {
		if(this.ano == 0) {
			this.ano = defAno;
		}
	}
	
	public void setMarca(String defMarca) {
		if(this.marca.equals("")) {
			this.marca = defMarca;
		}
	}
	
	public void setModelo(String defModelo) {
		if(this.modelo.equals("")) {
			this.modelo = defModelo;
		}
	}
	
	public void setValor(Double defValor) {
	
		this.valor = defValor;
		
	}
	
	public void setKm(Double defKm) {
		
		this.km = defKm;
		
	}
	//calcula o imposto sobre o veiculo moto
	public void impostoM(){
		this.imposto = this.valor * 0.025;
		this.impostoAno = this.imposto * 12;  //imposto anual
	}
	
	//geters
	
	public String getPlaca(){
		return this.placa;
	}
	
	
	public int getAno(){
		return this.ano;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public Double getValor(){
		return this.valor;
	}
	
	public int getKm(){
		return this.km;
	}
	
	
	public double getImposto(){
		return this.imposto;
	}
	
	public double getImpostoAno(){
		return this.impostoAno;
	}
	
	//funcao andar
	
	public void KmAndados(Double defKm) {
		
		this.km += defKm;
		
	}
	
	//funcao apgar veiculo
	
	public void ApagarVeiculoM(){
		this.placa = "";
		this.ano = 0;
		this.marca = "";
		this.modelo = "";
		this.valor = 0.0;
		this.km = 0.0;
		this.imposto = 0.0;
		this.impostoAno = 0.0;
	}
	

}
