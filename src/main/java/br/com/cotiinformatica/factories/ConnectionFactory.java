package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//RESPONSAVEL POR ABRIR A CONEXÃO JUNTO AO BANCO
	//EM SCRIPT SQL ESTA OS MODELOS DAS TABELAS
	public Connection getConnection() throws Exception {
		
		String drive = "org.postgresql.Driver";
		String host= "jdbc:postgresql://localhost:5432/contatosweb_coti";
		String user = "postgres";
		String password = "0902";
		Class.forName(drive);
				
		return DriverManager.getConnection(host, user, password);
		
		
		
	}
}