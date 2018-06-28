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
public class FrangoHamburguer extends HamburguerDecorator {
    
    public FrangoHamburguer(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Frango";
        preco = 5.0;
    }
    
}
