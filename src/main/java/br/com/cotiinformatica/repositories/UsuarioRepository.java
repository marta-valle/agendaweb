package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class UsuarioRepository {
	// AQUI CONTEM O QUE SERÁ ESCRITO NO BD

	// CRIAÇÃO DE CADASTRO: USA OS OBJETOS DO USUARIO
	public void create(Usuario usuario) throws Exception {
		// ABRIR CONEXÃO COM O BD
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();

	// INICIAR ESCRITA NO BD
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO usuario (nome, telefone, email, login, senha) VALUES (?, ?, ?, ?, md5(?))"); 
	// ATENÇÃO PARA AS SENHAS FICAREM CRIPTOGRAFADAS MD5 AO GRAVAR.

	// O QUE SERÁ GRAVADO EM BD
		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getTelefone());
		statement.setString(3, usuario.getEmail());
		statement.setString(4, usuario.getLogin());
		statement.setString(5, usuario.getSenha());

		statement.execute();
	// FECHAR CONEXÃO COM O BD
		connection.close();
	}
	// METODO DE CONSULTA DE USUARIO -- dia 01/05
	public Usuario findByEmail(String email) throws Exception {
		// ABRIR CONEXÃO COM O BD
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();
		
		// INICIAR ESCRITA NO BD - SELECT * FROM usuario WHERE .... = ?"
		PreparedStatement statement = connection.prepareStatement("select * from usuario where email = ?");
		statement.setString(1, email);
		
		//LER A CONSULTA DO BD = DEVOLVE A CONSULTA
		ResultSet resultSet = statement.executeQuery();
		
		//DECLARA O OBJETO VAZIO
		Usuario usuario = null;

		if (resultSet.next()) {
			usuario = new Usuario();

			usuario.setIdUsuario(resultSet.getInt("idusuario"));
			usuario.setNome(resultSet.getString("nome"));
			usuario.setTelefone(resultSet.getString("telefone"));
			usuario.setLogin(resultSet.getString("login"));
			usuario.setSenha(resultSet.getString("senha"));

		}
		connection.close();
		return usuario;
	}

	// METODO DE CONSULTA DE USUARIO - usado em: cadastroNovaSenha - dia 01/05
	public Usuario findByEmailLogin(String email, String login) throws Exception {
		// ABRIR CONEXÃO COM O BD
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();
		
		// INICIAR ESCRITA NO BD - SELECT * FROM usuario WHERE .... = ? or ....=?"
		PreparedStatement statement = connection.prepareStatement("select * from usuario where email = ? or login = ?");
		statement.setString(1, email);
		statement.setString(2, login);
		//LER A CONSULTA DO BD = DEVOLVE A CONSULTA
		ResultSet resultSet = statement.executeQuery();
		
		//DECLARA O OBJETO VAZIO
		Usuario usuario = null;

		if (resultSet.next()) {
			usuario = new Usuario();

			usuario.setIdUsuario(resultSet.getInt("idusuario"));
			usuario.setNome(resultSet.getString("nome"));
			usuario.setTelefone(resultSet.getString("telefone"));
			usuario.setLogin(resultSet.getString("login"));
			usuario.setSenha(resultSet.getString("senha"));

		}
		connection.close();
		return usuario;
	}
}
