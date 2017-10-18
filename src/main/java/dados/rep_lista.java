package dados;

import java.util.LinkedList;
import java.util.List;

public class rep_lista implements rep_usuario{
	private List<Usuario> lista = new LinkedList<Usuario>();
	
	public void inserir(Usuario u) {
		lista.add(u);
	}

	public List<Usuario> listar() {
		return lista;
	}

	public void varios_Usuarios(){
        Usuario u2 = new Usuario();
        u2.setId(2);
        u2.setNome("Maria");
        u2.setLogin("maria");
        u2.setSenha("maria");
        
        Usuario u3 = new Usuario();
        u3.setId(3);
        u3.setNome("João");
        u3.setLogin("joao");
        u3.setSenha("joao");
        
        Usuario u4 = new Usuario();
        u4.setId(4);
        u4.setNome("Francisco");
        u4.setLogin("francisco");
        u4.setSenha("francisco");
  
        Usuario u5 = new Usuario();
        u5.setId(5);
        u5.setNome("Antonio");
        u5.setLogin("antonio");
        u5.setSenha("antonio");
  
  this.lista.add(u2);
  this.lista.add(u3);
  this.lista.add(u4);
  this.lista.add(u5);
 }
	
	
	public Usuario buscar(String usuario, String senha) {
		Usuario usuario1 = null;
		for(Usuario u: lista){
			if(u.getLogin().equals(usuario)&&u.getSenha().equals(senha))
			{
				usuario1 = u;
				return usuario1;			
			}
		}
		return usuario1;
	}

	public void alterar(Usuario original, Usuario novo) {
		// TODO Auto-generated method stub
	}

}