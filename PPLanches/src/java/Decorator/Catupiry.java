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
public class Catupiry extends PizzaDecorator {
    
        public Catupiry(Pizza umaPizza) {
        super(umaPizza);
        nome = "Catupiry";
        preco = 3.0;
    }

}

