/**
 * 
 */
package br.com.nsilva.dao.jpa;

import br.com.nsilva.dao.generic.jpa.GenericJpaDAO;
import br.com.nsilva.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
