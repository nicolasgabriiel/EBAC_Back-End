/**
 * 
 */
package br.com.nsilva.dao.jpa;

import br.com.nsilva.dao.generic.jpa.GenericJpaDAO;
import br.com.nsilva.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
