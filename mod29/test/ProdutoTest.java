import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.ProdutoDAO;
import domain.Cliente;
import domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ProdutoTest {
    @Test
    public void cadastrarBuscarExcluirTest() throws Exception {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("02");
        produto.setNome("Produto 01");

        Integer qtd = produtoDAO.cadastrar(produto);
        assertEquals(1, (int) qtd);

        Produto produtoBD = produtoDAO.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertNotNull(qtdDel);
    }
    @Test
    public void buscarTodosTest() throws Exception {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto 02");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtos = new Produto();
        produtos.setCodigo("20");
        produtos.setNome("Outro Produto");
        Integer countCad2 = produtoDAO.cadastrar(produtos);
        assertTrue(countCad2 == 1);

        List<Produto> list = produtoDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto cli : list) {
            produtoDAO.excluir(cli);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = produtoDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }
    @Test
    public void atualizarTest() throws Exception {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto Novo");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertEquals(1, (int) countCad);

        Produto produtoBD = produtoDAO.consultar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setCodigo("20");
        produtoBD.setNome("Outro Produto");
        Integer countUpdate = produtoDAO.atualizar(produtoBD);
        assertEquals(1, (int) countUpdate);

        Produto produtoBD1 = produtoDAO.consultar("10");
        assertNull(produtoBD1);

        Produto produtoBD2 = produtoDAO.consultar("20");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());

        List<Produto> list = produtoDAO.buscarTodos();
        for (Produto prd : list) {
            produtoDAO.excluir(prd);
        }
    }
}
