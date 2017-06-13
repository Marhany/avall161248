package br.univel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	
	private static final String SQL_BUSCA_TODOS = "SELECT * FROM CONTATO";

	public List<Cliente> getTodos() {
		
		Connection con = ConexaoDB
				.getInstance()
				.getConnection();
		
		List<Cliente> lista = new ArrayList<>();
		try (PreparedStatement ps = con
					.prepareStatement(SQL_BUSCA_TODOS);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getLong(1));
				c.setNome(rs.getString(2));
				c.setTelefone(rs.getString(3));
				lista.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
}
