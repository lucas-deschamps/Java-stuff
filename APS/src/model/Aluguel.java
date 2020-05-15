package model;

public class Aluguel {
	private String clienteNome;
	private String clienteCpf;
	private String clienteRg;
	private String clienteEndereco;
	private String veiculoLocado;
	private String dataLocacao;
	private int prazoLocacao;
	private double valor;
	private double quilometragemAcordada;
	private String formaPagamento;
	private double valorEntrada;
	
	// construtores
	public Aluguel() {
		super();
	}

	public Aluguel(String clienteNome, String clienteCpf, String clienteRg, String clienteEndereco,
			String veiculoLocado, String dataLocacao, int prazoLocacao, double valor, double quilometragemAcordada,
			String formaPagamento, double valorEntrada) {
		super();
		this.clienteNome = clienteNome;
		this.clienteCpf = clienteCpf;
		this.clienteRg = clienteRg;
		this.clienteEndereco = clienteEndereco;
		this.veiculoLocado = veiculoLocado;
		this.dataLocacao = dataLocacao;
		this.prazoLocacao = prazoLocacao;
		this.valor = valor;
		this.quilometragemAcordada = quilometragemAcordada;
		this.formaPagamento = formaPagamento;
		this.valorEntrada = valorEntrada;
	}

	// getters e setters
	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	public String getClienteRg() {
		return clienteRg;
	}

	public void setClienteRg(String clienteRg) {
		this.clienteRg = clienteRg;
	}

	public String getClienteEndereco() {
		return clienteEndereco;
	}

	public void setClienteEndereco(String clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}

	public String getVeiculoLocado() {
		return veiculoLocado;
	}

	public void setVeiculoLocado(String veiculoLocado) {
		this.veiculoLocado = veiculoLocado;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public int getPrazoLocacao() {
		return prazoLocacao;
	}

	public void setPrazoLocacao(int prazoLocacao) {
		this.prazoLocacao = prazoLocacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getQuilometragemAcordada() {
		return quilometragemAcordada;
	}

	public void setQuilometragemAcordada(double quilometragemAcordada) {
		this.quilometragemAcordada = quilometragemAcordada;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	// métodos da classe
	public String dadosContrato() {
		return "Dados do cliente:\n" +
				getClienteNome() + "\n" +
				getClienteCpf() + "\n" +
				getClienteRg() + "\n" +
				getClienteEndereco() + "\n" +
				"\nVeiculo alugado: " + getVeiculoLocado() +
				"\nData do aluguel: " + getDataLocacao() +
				"\nPrazo: " + getPrazoLocacao() + " dias" +
				"\nValor: " + getValor() +
				"\nQuilometragem acordada: " + getQuilometragemAcordada() +
				"\nForma de pagamento: " + getFormaPagamento() +
				"\nValor da entrada: " + getValorEntrada() 
				;
	}

}
