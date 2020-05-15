package model;

public class Caminhao extends Veiculo {
	private String tipoCarga;
	private double peso;
	private String origem;
	private String destino;
	private String dataEntrega;
	private String dataDevolucao;
	
	// construtor
	public Caminhao(String modelo, int ano, String tipoContrato, String tipoCarga, double peso, String origem,
			String destino, String dataEntrega, String dataDevolucao) {
		super(modelo, ano, tipoContrato);
		this.tipoCarga = tipoCarga;
		this.peso = peso;
		this.origem = origem;
		this.destino = destino;
		this.dataEntrega = dataEntrega;
		this.dataDevolucao = dataDevolucao;
	}

	// getters e setters
	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	// polimorfismo de dadosContrato()
	public String dadosContrato() {
		return "\nModelo: " + getModelo() +
				"\nAno: " + getAno() +
			   "\nTipo de contrato: " + getTipoContrato() +
			   "\nTipo de carga: " + getTipoCarga() +
			   "\nPeso: " + getPeso() + "kg" +
			   "\nOrigem: " + getOrigem() +
			   "\nDestino: " + getDestino() +
			   "\nData de entrega da carga: " + getDataEntrega() +
			   "\nData de devolução do caminhão: " + getDataDevolucao()
			   ;
	}

}
