package model;

public class CarroPasseio extends Veiculo {
	private String dataInicio;
	private String dataTermino;
	private double quilometragemPretendida;
	private double tipoMotorizacao;
	
	// construtor
	public CarroPasseio(String modelo, int ano, String tipoContrato, String dataInicio, String dataTermino,
			double quilometragemPretendida, double tipoMotorizacao) {
		super(modelo, ano, tipoContrato);
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.quilometragemPretendida = quilometragemPretendida;
		this.tipoMotorizacao = tipoMotorizacao;
	}

	// getters e setters
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getQuilometragemPretendida() {
		return quilometragemPretendida;
	}

	public void setQuilometragemPretendida(double quilometragemPretendida) {
		this.quilometragemPretendida = quilometragemPretendida;
	}

	public double getTipoMotorizacao() {
		return tipoMotorizacao;
	}

	public void setTipoMotorizacao(double tipoMotorizacao) {
		this.tipoMotorizacao = tipoMotorizacao;
	}
	
	// polimorfismo de dadosContrato()
	public String dadosContrato() {
		return "\nModelo: " + getModelo() +
			   "\nAno: " + getAno() +
			   "\nTipo de contrato: " + getTipoContrato() +
			   "\nData inicial do aluguel: " + getDataInicio() +
			   "\nData final do aluguel: " + getDataTermino() +
			   "\nQuilometragem contratada: " + getQuilometragemPretendida() +
			   "\nMotorização do veículo: " + getTipoMotorizacao()
			   ;
	}

}
