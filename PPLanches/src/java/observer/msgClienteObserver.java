package br.padroes.observer;

public class msgClienteObserver extends DadosObserver {

	public msgClienteObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		System.out.println("Parabéns " + dados.getState().nome
				+ "!! Você foi cadastrado com sucesso com o email " + dados.getState().email + ". Seus pedidos serão enviados para:  "
				+ dados.getState().endereco);
	}

}
