import dao.AcessorioDAO;
import dao.CarroDAO;
import dao.MarcaDAO;

import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void cadastrar() {
        CarroDAO carro = new CarroDAO();
        MarcaDAO marca = new MarcaDAO();
        AcessorioDAO acessorio = new AcessorioDAO();

        carro.setCodigo("Carro1");
        carro.setNome("Carro de Teste");
        carro = carroDao.cadastrar(carro);
        assertNotNull(carro);
        assertNotNull(carro.getId());

        marca.setCodigo("MarcaX");
        marca.setNome("marca de Teste");
        marca = carroDao.cadastrar(marca);
        assertNotNull(marca);
        assertNotNull(marca.getId());

        acessorio.setCodigo("AcessorioX");
        acessorio.setNome("acessorio de Teste");
        acessorio = carroDao.cadastrar(acessorio);
        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }


}
