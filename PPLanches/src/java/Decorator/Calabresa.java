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
public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza umaPizza) {
        super(umaPizza);
        nome="Calabresa";
        preco=1.0;
    }

    
    

}
