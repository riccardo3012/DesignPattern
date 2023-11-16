package Composite;

public class SinglePage implements NTotPag {

    @Override
    public int NTotPag() {
        return 1;
    }
    @Override
    public void print() {
        System.out.println("Stampa pagina");
    }
}