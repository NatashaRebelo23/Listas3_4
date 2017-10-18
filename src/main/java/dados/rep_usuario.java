package dados;

import java.util.List;

public interface rep_usuario {
	public void inserir(Usuario usuario);
	public List<Usuario> listar();
	public Usuario buscar(String login, String senha);
	public void alterar(Usuario original, Usuario novo);
}