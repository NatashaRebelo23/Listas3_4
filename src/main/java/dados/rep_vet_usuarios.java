package dados;

import java.util.List;
import java.util.Vector;

public class rep_vet_usuarios implements rep_usuario{
	private List<Usuario> repositorio = new Vector<Usuario>();
	
	public void inserir(Usuario u) {
		repositorio.add(u);
	}

	public List<Usuario> listar() {
		return repositorio;
	}

	public Usuario buscar(String Usuario, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	public void alterar(Usuario original, Usuario novo) {
		// TODO Auto-generated method stub
		
	}

}