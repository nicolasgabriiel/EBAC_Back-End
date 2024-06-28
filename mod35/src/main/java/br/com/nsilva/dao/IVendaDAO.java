/**
 * 
 */
package br.com.nsilva.dao;

import br.com.nsilva.dao.generic.IGenericDAO;
import br.com.nsilva.domain.Venda;
import br.com.nsilva.exceptions.DAOException;
import br.com.nsilva.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
