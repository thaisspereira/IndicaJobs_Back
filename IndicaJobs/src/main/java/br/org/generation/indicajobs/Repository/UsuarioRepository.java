package br.org.generation.indicajobs.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.indicajobs.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	public List<Usuario> findByIdUsuario (long IdUsuario);
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
}