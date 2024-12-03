package projeto.controller;

import java.util.List;  // Importação correta de List

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // Importação correta do Model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import projeto.model.Usuario;
import projeto.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Exibir o formulário de cadastro
    @GetMapping("/novo-usuario")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "novo-usuario";  // Página com o formulário de cadastro
    }

    // Salvar o novo usuário
    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios";  // Redireciona para a página de usuários cadastrados
    }

    // Exibir a lista de usuários
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();  // Lista de usuários
        model.addAttribute("usuarios", usuarios);
        return "usuarios";  // Página com a tabela de usuários
    }

    // Excluir um usuário
    @GetMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios";  // Redireciona de volta para a lista de usuários
    }

    // Exibir o formulário de edição de usuário
    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable("id") Long id, Model model) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        model.addAttribute("usuario", usuario);
        return "editar-usuario";  // Página para editar o usuário
    }

    // Salvar as alterações do usuário
    @PostMapping("/atualizar")
    public String atualizarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios";  // Redireciona para a lista de usuários após a atualização
    }
}
