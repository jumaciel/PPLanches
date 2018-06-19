/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Aluno
 */
public abstract class PizzaDecorator extends Pizza{
    Pizza pizza;
    
    public PizzaDecorator(Pizza umaPizza){
        pizza=umaPizza;
}
    public String getNome(){
        return pizza.getNome() + "+" +nome;
    }
     public double getPreco(){
        return pizza.getPreco() +preco;
    }
  
}
