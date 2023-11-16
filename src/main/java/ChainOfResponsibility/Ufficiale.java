package ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    private Ufficiale superiore;
    private double stipendio;

    public void doCheck(double cifra){
        if(cifra <= this.stipendio) System.out.println("Lo stipendio di " + this.getClass().getSimpleName() + " è maggiore di " + cifra);
        if(superiore != null) {
            this.superiore.doCheck(cifra);
        } else {
            System.out.println("Non ci sono altri ufficiali di grado superiore");
        }
    }
}
/*Questo pattern permette a più oggetti di gestire una richiesta senza che il mittente conosca esplicitamente quale oggetto la sta gestendo.
 Questa classe è la base per la catena di responsabilità. Ogni ufficiale ha un superiore e uno stipendio.
Il metodo doCheck(double cifra) è implementato in modo che ogni ufficiale confronti la cifra passata con il proprio stipendio.
Se la cifra è inferiore o uguale allo stipendio dell'ufficiale corrente, stampa un messaggio. Successivamente, se c'è un ufficiale superiore, passa la richiesta a lui.
Classi di Gradi Militari (Capitano, Maggiore, Colonnello):
*/