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
public class CatupiryHamburguer extends HamburguerDecorator {
    
    public CatupiryHamburguer(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Catupiry";
        preco = 3.0;
    }
    
}
