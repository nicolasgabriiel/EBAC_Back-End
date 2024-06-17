import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de carros usando Generics
        List<Carro> listaDeCarros = new ArrayList<>();

        // Instanciando alguns carros e adicionando à lista
        Honda civic = new Honda("Honda Civic");
        Fiat argo = new Fiat("Fiat Argo");
        Toyota corolla = new Toyota("Toyota Corolla");

        listaDeCarros.add(civic);
        listaDeCarros.add(argo);
        listaDeCarros.add(corolla);

        // Iterando sobre a lista e imprimindo os modelos dos carros
        for (Carro carro : listaDeCarros) {
            System.out.println(carro.getModelo());
        }
    }
}