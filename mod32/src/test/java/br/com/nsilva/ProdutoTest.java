/**
 * 
 */
package br.com.nsilva;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.nsilva.dao.ProdutoDao;
import br.com.nsilva.dao.IProdutoDao;
import br.com.nsilva.domain.Produto;


public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("cod");
		produto.setDescricao("PRODUTO TESTE");
		produto.setNome("Produto que faz tal coisa");
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
