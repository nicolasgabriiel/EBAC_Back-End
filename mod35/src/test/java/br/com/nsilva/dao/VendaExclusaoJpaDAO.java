/**
 * 
 */
package br.com.nsilva.dao;

import br.com.nsilva.dao.generic.jpa.GenericJpaDAO;
import br.com.nsilva.dao.jpa.IVendaJpaDAO;
import br.com.nsilva.domain.jpa.VendaJpa;
import br.com.nsilva.exceptions.DAOException;
import br.com.nsilva.exceptions.TipoChaveNaoEncontradaException;


public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
