package observer;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

public class Observer {

    @Stateless
    public void servicoObserver(@Observes String mensagem) {
        System.out.println("Mensagem do Serviço: " + mensagem);
    }

}
