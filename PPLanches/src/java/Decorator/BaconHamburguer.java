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
public class BaconHamburguer extends HamburguerDecorator {
    
    public BaconHamburguer(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Bacon";
        preco = 2.0;
    }
    
}
