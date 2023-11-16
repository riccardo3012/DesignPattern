package ChainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {


        Colonnello colonnello = new Colonnello();
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);


        capitano.doCheck(500);
    }
}

/* crea un'istanza di ogni classe (Capitano, Maggiore, Colonnello) e le collega in modo gerarchico tramite il metodo setSuperiore.
Infine, chiama il metodo doCheck(500) del Capitano. Questa chiamata viene inoltrata lungo la catena di responsabilità, e ogni ufficiale verifica
 se la cifra passata è inferiore o uguale al suo stipendio. La catena è organizzata dal Capitano al Maggiore e infine al Colonnello.
Quindi lo stipendio di Capitano è maggiore di 500" verrà stampato perché il capitano ha uno stipendio di 1000,
e la cifra passata è 500. La catena poi continua fino al Maggiore e infine al Colonnello, ma nessuno degli ufficiali successivi stamperà un
 messaggio poiché il capitano ha già gestito la richiesta.*/
