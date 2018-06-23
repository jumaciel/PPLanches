package model;

import state.FuncionarioEstado;
import state.FuncionarioCadastrado;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String sobrenome;
    private String status;
    private FuncionarioEstado funcEstado;

    public Funcionario(int idFuncionario, String nome, String sobrenome, String status ) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.status = status;

    }

    public Funcionario(String nome, String sobrenome, String status) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.status = status;
    }
    
    

    public Funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario() {
        this.funcEstado = new FuncionarioCadastrado();
    }

    
    public String Cadastrar(Funcionario f) {
        return funcEstado.Cadastrado(f);
    }

    public String Demitido(Funcionario f) {
        return funcEstado.Demitido(f);
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FuncionarioEstado getFuncEstado() {
        return funcEstado;
    }

    public void setFuncEstado(FuncionarioEstado funcEstado) {
        this.funcEstado = funcEstado;
    }

 
    
    
    
    
    
     
    
    
}
