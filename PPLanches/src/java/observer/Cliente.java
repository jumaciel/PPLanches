package br.padroes.observer;

public class Cliente {
	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new msgClienteObserver(dados));

		dados.setState(new Dados("pedro","teste@","rua"));
	}
}
