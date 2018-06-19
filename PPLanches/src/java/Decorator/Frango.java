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
public class Frango extends PizzaDecorator{
        
    public Frango(Pizza umaPizza) {
        super(umaPizza);
        nome = "Frango";
        preco = 4.0;
    }
}
