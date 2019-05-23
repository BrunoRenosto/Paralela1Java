package paralela;

public class ComparableConta implements Comparable {
	
    private Double valor;
    // outros metodos e atributos

    public int compareTo(Moto outraMoto) {
        if (this.valor < outraMoto.valor) {
            return -1;
        }
        if (this.valor > outraMoto.valor) {
            return 1;
        }
        return 0;
    }

}
