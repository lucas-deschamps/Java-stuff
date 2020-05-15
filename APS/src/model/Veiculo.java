package model;

public class Veiculo extends Aluguel {
	private String modelo;
	private int ano;
	private String tipoContrato;
	
	// construtores
	public Veiculo() {
		super();
	}

	public Veiculo(String tipoContrato) {
		super();
		this.tipoContrato = tipoContrato;
	}

	public Veiculo(String modelo, String tipoContrato) {
		super();
		this.modelo = modelo;
		this.tipoContrato = tipoContrato;
	}

	public Veiculo(String modelo, int ano, String tipoContrato) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.tipoContrato = tipoContrato;
	}

	// getters e setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
