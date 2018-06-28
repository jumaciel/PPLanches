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
public class OvoHamburguer extends HamburguerDecorator {
    
    public OvoHamburguer(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Ovo";
        preco = 1.0;
    }
    
}
