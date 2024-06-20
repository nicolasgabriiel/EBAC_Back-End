import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
public class Tests {
        @Test
        public void testNomesFemininos() {
            String input = "nicolas-m,nicole-f,maria-f,joao-m,ana-f";
            List<NomeGenero> lista = Main.processarEntrada(input);

            List<String> femininos = lista.stream()
                    .filter(ng -> ng.genero.equalsIgnoreCase("f"))
                    .map(ng -> ng.nome)
                    .collect(Collectors.toList());

            // Verifique a quantidade de nomes inseridos na lista de femininos
            assertEquals( 3 , femininos.size() );
        }
}
