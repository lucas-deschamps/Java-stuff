package model;

public class CarroEsportivo extends Veiculo {
	private int tempoAluguel;

	// construtor
	public CarroEsportivo(String modelo, String tipoContrato, int tempoAluguel) {
		super(modelo, tipoContrato);
		this.tempoAluguel = tempoAluguel;
	}

	// getters e setters
	public int getTempoAluguel() {
		return tempoAluguel;
	}

	public void setTempoAluguel(int tempoAluguel) {
		this.tempoAluguel = tempoAluguel;
	}

	// polimorfismo de dadosContrato()
	public String dadosContrato() {
		return "\nModelo: " + getModelo() +
			   "\nTipo de contrato: " + getTipoContrato() +
			   "\nTempo de aluguel: " + getTempoAluguel() + " minutos"
				;
	}

}
