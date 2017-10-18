package controles;

import dados.*;
import java.util.List;

public class controle{
	private rep_usuario repositorio;
	
	public controle(rep_usuario tipo){
		this.repositorio = tipo;
	}
	
	public void insere(Usuario u){
		repositorio.inserir(u);
	}
	
	public List<Usuario> lista(){
		return repositorio.listar();
	}
	public Usuario buscar(String login, String senha){
		return repositorio.buscar(login, senha);
	}
}