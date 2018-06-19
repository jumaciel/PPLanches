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
public class Queijo extends PizzaDecorator {

    public Queijo(Pizza umaPizza) {
        super(umaPizza);
        nome = "Queijo";
        preco = 4.0;
    }
}
