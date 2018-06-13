package state;

import model.Funcionario;

public class FuncionarioCadastrado implements FuncionarioEstado{

    @Override
    public String getEstado(Funcionario f) {
        return "Cadastrado";
    }

    @Override
    public String Cadastrado(Funcionario f) {
        return "Cadastro não realizado uma vez que demitido";
    }

    @Override
    public String Demitido(Funcionario f) {
        f.setFuncEstado(new FuncionarioDemitido());
        return "Funcionario(a) pode ser demitido";
    }
    
}
