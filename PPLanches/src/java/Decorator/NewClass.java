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
public class NewClass {
 public static void main(String[] args) {
     Pizza minhapizza = new PizzaPadrao();
     System.out.println(minhapizza.getNome()+"="+minhapizza.getPreco());
 
     minhapizza = new Calabresa(minhapizza);
     System.out.println(minhapizza.getNome()+"="+minhapizza.getPreco());
 }
 
}
