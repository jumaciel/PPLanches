/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Ana
 */
public class QueijoHamburguer extends HamburguerDecorator {
    
    public QueijoHamburguer(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Queijo";
        preco = 3.0;
    }
    
}
