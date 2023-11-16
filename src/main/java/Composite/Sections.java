package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sections implements NTotPag{
    protected List<NTotPag> pages = new ArrayList<>();

    @Override
    public int NTotPag() {
        return pages.stream().mapToInt(NTotPag::NTotPag).sum();
    }

    @Override
    public void print() {
        System.out.println("Sezione");
        pages.forEach(NTotPag::print);
    }

    public void addPage(NTotPag paginaUno) {
        pages.add(paginaUno);
    }
}
