package projeto.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projeto.model.Cliente;
import projeto.repository.ClienteRepository;

@Service
@Transactional
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Iterable<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
