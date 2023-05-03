package br.com.cotiinformatica.entities;

//CLASSE DE MODELO: PADRÃO JAVABEANS
public class Usuario {
	Integer idUsuario;
	String nome;
	String telefone;
	String email;
	String login;
	String senha;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer idUsuario, String nome, String telefone, String email, String login, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ ", login=" + login + ", senha=" + senha + "]";
	}

}
