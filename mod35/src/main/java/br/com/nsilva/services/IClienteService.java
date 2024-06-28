/**
 * 
 */
package br.com.nsilva.services;

import br.com.nsilva.domain.Cliente;
import br.com.nsilva.exceptions.DAOException;
import br.com.nsilva.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
