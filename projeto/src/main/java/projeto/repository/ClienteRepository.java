package projeto.repository;

import org.springframework.data.repository.CrudRepository;

import projeto.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
