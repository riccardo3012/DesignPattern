package Composite;
import java.util.ArrayList;
import java.util.List;


public class Book implements NTotPag {
    List<Autore> autori = new ArrayList<>();
    long price;

    List<NTotPag> pagine = new ArrayList<>();

    public void addAuthor(Autore autore) {
        autori.add(autore);  // Modificato il nome della lista da 'autore' a 'autori'
    }

    public void addPage(NTotPag NTotPag) {
        pagine.add(NTotPag);
    }

    @Override
    public int NTotPag() {
        return pagine.stream().mapToInt(NTotPag::NTotPag).sum();
    }


    @Override
    public void print() {
        System.out.println("Libro");
        System.out.println("Autori:");
        autori.forEach(a -> System.out.println(a.getName()));
        pagine.forEach(NTotPag::print);
    }
}