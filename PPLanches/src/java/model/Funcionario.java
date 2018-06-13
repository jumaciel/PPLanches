package model;

import state.FuncionarioEstado;
import state.FuncionarioCadastrado;

public class Funcionario {
    private int codFunc;
    private String nome;
    private String sobrenome;
    private String status;
    private FuncionarioEstado funcEstado;

    public Funcionario(int codFunc, String nome, String sobrenome, String status ) {
        this.codFunc = codFunc;
        this.nome = nome;
        this.sobrenome = sobrenome;
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
