package model;

public class TV {
	private String fabricante;
	private String modelo;
	private int tamanhoTela;
	private String localizacao;
	private boolean ligada;
	private int volume;
	private int canal;
	
	// método construtor simples
	public TV() {
		super();
	}

	// método construtor completo
	public TV(String fabricante, String modelo, int tamanhoTela, String localizacao, boolean ligada, int volume,
			int canal) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tamanhoTela = tamanhoTela;
		this.localizacao = localizacao;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}

	// método construtor personalizado
	public TV(String fabricante, String modelo, int tamanhoTela, String localizacao) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tamanhoTela = tamanhoTela;
		this.localizacao = localizacao;
		this.ligada = false;
		this.volume = 0;
		this.canal = 0;
	}

	// getters e setters
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	// métodos da classe
	public void caracteristicas() {
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tamanho da tela: " + this.tamanhoTela);
		System.out.println("Localização: " + this.localizacao);
	}
	
	public String situacaoTV() {
		if (this.ligada) {
			return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + 
					this.localizacao + " está LIGADA, no canal " + this.canal + " e com volume " + this.volume + ".";
		}
		return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " está DESLIGADA.";
	}
	
	public String ligarTV() {
		if (!this.ligada) {
			this.ligada = true;
			this.canal = 4;
			this.volume = 15;
			return "A TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " foi LIGADA agora.";
		}
		return "A TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " já estava ligada no canal " +
				this.canal + " e no volume " + this.volume + ".";
	}
	
	public String desligarTV() {
		if (this.ligada) {
			this.canal = 0;
			this.volume = 0;
			this.ligada = false;
			return "A TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " foi DESLIGADA agora.";
		}
		return "A TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " já estava desligada.";
	}
	
	public String mudarCanal(int canal) {
		if (!this.ligada) {
			return "ERRO: TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " está DESLIGADA!" +
					" Não é possível mudar o canal.";
		}
		
		if (this.ligada && this.canal != canal) {
			if (canal >= 1 && canal <= 70) {
				this.canal = canal;
				return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " mudou para o canal " + this.canal + ".";
			} else {
				return "ERRO: Canal solicitado não existe!" +
						" TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " continua no canal " + this.canal + ".";
			}
		}
		
		return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " já estava no canal " + this.canal + ".";
	}
	
	public String aumentarVolume(int acrescimo) {
		if (!this.ligada) {
			return "ERRO: TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " está DESLIGADA!" +
					" Não é possível aumentar o volume.";
		}
		
		if ((this.volume + acrescimo) > 50) {
			this.volume = 50;
			return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " aumentou o volume para o máximo, que é 50!";
		}
		
		this.volume += acrescimo;
		return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " aumentou o volume para " + this.volume + ".";
	}
	
	public String diminuirVolume(int decrescimo) {
		if (!this.ligada) {
			return "ERRO: TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " está DESLIGADA!" +
					" Não é possível diminuir o volume.";
		}
		
		if ((this.volume - decrescimo) < 0) {
			this.volume = 0;
			return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " diminuiu para o volume 0!";
		}
		
		this.volume -= decrescimo;
		return "TV " + this.fabricante + " " + this.tamanhoTela + " polegadas " + this.localizacao + " diminuiu o volume para " + this.volume + ".";
	}
}
