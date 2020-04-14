package controller;

import model.TV;

public class GerenciamentoTV {
	
	public static void main(String[] args) {
		TV toshiba = new TV("Toshiba", "2000", 50, "quarto");
		
		toshiba.caracteristicas();
		System.out.println(toshiba.situacaoTV());
		toshiba.setLigada(true);
		System.out.println(toshiba.situacaoTV());
		System.out.println(toshiba.ligarTV());
		toshiba.setLigada(false);
		System.out.println(toshiba.ligarTV());
		System.out.println(toshiba.situacaoTV());
		System.out.println(toshiba.desligarTV());
		System.out.println(toshiba.desligarTV());
		System.out.println(toshiba.mudarCanal(4));
		System.out.println(toshiba.ligarTV());
		System.out.println(toshiba.mudarCanal(4));
		System.out.println(toshiba.mudarCanal(3));
		System.out.println(toshiba.mudarCanal(0));
		System.out.println(toshiba.mudarCanal(71));
		System.out.println(toshiba.mudarCanal(70));
		System.out.println(toshiba.mudarCanal(70));
		System.out.println(toshiba.desligarTV());
		System.out.println(toshiba.aumentarVolume(1));
		System.out.println(toshiba.ligarTV());
		System.out.println(toshiba.aumentarVolume(20));
		System.out.println(toshiba.aumentarVolume(16));
		System.out.println(toshiba.desligarTV());
		System.out.println(toshiba.diminuirVolume(1));
		System.out.println(toshiba.ligarTV());
		System.out.println(toshiba.diminuirVolume(5));
		System.out.println(toshiba.diminuirVolume(11));
	}
	
}
