import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ordenandoAlfabeticamente();
    }
    public static void ordenandoAlfabeticamente() {
        List<String> lista = new ArrayList<String>();

        lista.add("Nícolas gabriel");
        lista.add("Gabriel Rojai");
        lista.add("Mariana Rocha");
        lista.add("Brenda Azevedo");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}