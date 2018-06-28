/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;
import org.simplejavamail.mailer.config.TransportStrategy;

/**
 *
 * @author Aluno
 */
public class email {
    
  /*  String nome, emailCliente, endereco;
    
    public void enviarEmail(String nome, String email, String endereco){ 
        this.nome = nome;
        this.emailCliente = email;
        this.endereco = endereco;
    }
    
    Email email = EmailBuilder.startingBlank()
    .from("PP Lanches", "phvrapedrohenrique@gmail.com")
    .to(nome, emailCliente)
    .withSubject("Pedido PP Lanches - Pedido do(a)" + nome)
    .withPlainText("Prezado " +nome+",\n seu lanche será enviado para: " + endereco +". Obrigado por comprar conosco" )
    .buildEmail();

    
Mailer mailer = MailerBuilder
  .withSMTPServer("smtp.gmail.com", 25, "phvrapedrohenrique@gmail.com", "sbzdfozugjuufncq")
  .withTransportStrategy(TransportStrategy.SMTP_TLS)
  .buildMailer()
  .sendMail(email);*/
}
