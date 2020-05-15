package controller;
import model.Aluguel;
import model.Caminhao;
import model.CarroEsportivo;
import model.CarroPasseio;

public class Testes {

	public static void main(String[] args) {
		Aluguel a1 = new Aluguel(
								 "João Lucas",
								 "123.456.789-10",
								 "12.345.678-9",
								 "Rua Java, 404",
								 "Caminhão",
								 "13/05/2020",
								 60,
								 7200.56,
								 7200,
								 "Depósito bancário",
								 1000
								);
		
		Caminhao v1 = new Caminhao("Volvo NH", 2000, "Caminhão", "Camas", 3000, "Rio de Janeiro", "São Paulo", "12/05/2020", "13/05/2020");
		CarroEsportivo l1 = new CarroEsportivo("Lamborghini Aventador", "Esportivo", 120);
		CarroPasseio g1 = new CarroPasseio("Gol", 2015, "Passeio", "13/05/2020", "23/05/2020", 960, 1.6);
		
		System.out.println(a1.dadosContrato());
		System.out.println(v1.dadosContrato());
		System.out.println(l1.dadosContrato());
		System.out.println(g1.dadosContrato());
	}

}
