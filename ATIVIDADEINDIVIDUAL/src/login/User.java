//Esta classe faz parte do package login.
package login;

//Imports necessários utilizados no código para trabalhar com banco de dados (estes imports fazem parte do JDBC).
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Classe User que se encontra dentro do package login.
public class User {
	//Método para conectar com o Banco de dados.
	public Connection conectarBD () {
		Connection conn = null; //Criando variável para conexão.
		try {
			Class.forName("com.mysql.Driver.Manager").newInstance(); //Driver do MySQL para permitir conexão.
			String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; //URL com endereço do banco de dados contendo: (nome do banco, usuário e senha)
			conn = DriverManager.getConnection(url); // Abre uma conexão com a URL acima.
		}catch (Exception e) { } // Caso ocorra algum erro, nada será exibido.
		return conn; } //Retorna a conexão.
	public String nome=""; 	//Variável que vai guardar o nome do usuário caso a consulta dê certo!
	public boolean result = false; //Boolean que indica se o usuário foi encontrado ou não.
	
	//Método criado para verificar se no banco de dados existe o login e senha.
	public boolean verificarUsuario (String login, String senha) { 
		String sql = " "; //Aqui começa a montar o comando Sql.
		Connection conn = conectarBD(); //Abre uma conexão, chamando o método criado acima.
		//INSTRUÇÃO SQL.
		sql += "select nome from usuarios "; //Select para buscar o nome do usuário no banco.
		sql += "where login = " + "'" + login + "'"; //Compara o login digitado pelo usuário.
		sql += " and senha = " + "'" + senha + "';"; //Compara a senha digitada pelo usuário.
		try {
			Statement st = conn.createStatement(); //Cria um objeto para enviar os comandos Sql ao banco de dados.
			ResultSet rs = st.executeQuery(sql); //O código executa o Select e recebe os resultados dentro do ResultSet.
			if(rs.next()) { //Condição onde se existir uma linha, significa que foi encontrado o usuário.
				result = true; //Marca que foi encontrado o usuário.
				nome = rs.getString("nome");} //Guarda (armazena) o nome retornado do banco de dados.
		}catch (Exception e) { } //Caso aconteça algum erro, ele é ignorado.
		return result;} //Retorna verdadeiro ou falso dependendo da consulta.
} //fim da classe
