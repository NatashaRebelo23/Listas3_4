package dados;


public class Usuario {
	int id;
	String nome, senha, login, usuario;
	
	public int getId() {
		return id;
	}
	public String getLogin(){
		return usuario;
	}
	public String getSenha(){
		return senha;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public void setLogin(String usuario){
		this.usuario= usuario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}