package model;

import state.FuncionarioEstado;
import state.FuncionarioCadastrado;

public class Funcionario {
    private int codFunc;
    private String nomeFunc;
    private String sobrenomeFunc;
    private String status;
    private FuncionarioEstado funcEstado;

    public Funcionario(int codFunc, String nome, String sobrenome, String status ) {
        this.codFunc = codFunc;
        this.nomeFunc = nome;
        this.sobrenomeFunc = sobrenome;
        this.status = status;

    }

    public Funcionario(int codFunc) {
        this.codFunc = codFunc;
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

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getSobrenomeFunc() {
        return sobrenomeFunc;
    }

    public void setSobrenomeFunc(String sobrenomeFunc) {
        this.sobrenomeFunc = sobrenomeFunc;
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
