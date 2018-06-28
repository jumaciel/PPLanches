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
public abstract class HamburguerDecorator extends HamburguerLanche {
    Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer umHamburguer) {
        this.hamburguer = umHamburguer;
    }
    
    public String getNome(){
        return hamburguer.getNome() +" + "+nome;
    }
    public Double getPreco(){
        return hamburguer.getPreco() + preco;
    }
    
}
