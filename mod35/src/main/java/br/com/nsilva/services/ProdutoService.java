/**
 * 
 */
package br.com.nsilva.services;

import br.com.nsilva.dao.IProdutoDAO;
import br.com.nsilva.domain.Produto;
import br.com.nsilva.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
