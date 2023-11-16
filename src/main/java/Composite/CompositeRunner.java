package Composite;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Autore Aldo = new Autore("La leggenda di Al");
        Autore Giovanni = new Autore("La leggenda di John");
        Autore Giacomo = new Autore("La leggenda di Jack");

        NTotPag page1 = new SinglePage();
        NTotPag page2 = new SinglePage();
        NTotPag page3 = new SinglePage();
        NTotPag page4 = new SinglePage();

        Sections sessione1 = new Sections();
        Sections sessione2 = new Sections();
        Sections sessione3 = new Sections();

        sessione1.addPage(page1);
        sessione1.addPage(page2);

        sessione2.addPage(page1);
        sessione2.addPage(page2);
        sessione2.addPage(page3);
        sessione2.addPage(page4);

        sessione2.addPage(page1);
        sessione2.addPage(page2);
        sessione2.addPage(page3);
        sessione2.addPage(page4);

        Book book = new Book();
        book.addAuthor(Aldo);
        book.addAuthor(Giovanni);
        book.addAuthor(Giacomo);

        book.addPage(page1);
        book.addPage(page2);
        book.addPage(page3);
        book.addPage(page4);

        book.addPage(sessione1);
        book.addPage(sessione2);
        book.addPage(sessione3);

        book.print();
        System.out.println("Pages number: " + book.NTotPag());

    }
}