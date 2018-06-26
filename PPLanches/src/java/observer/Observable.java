
package observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;
  
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class Observable {
         @Inject
         private String mensagem;
  
         @Inject
         Event<String> evento;
          
         public void iniciaServico(){
                   evento.fire("Iniciando o serviço " + mensagem);
         }
}