package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Usuario;

public class UsuarioDAO implements DAO {

	public Usuario busca(String nomeUsuario, String senha) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		Usuario usuario = null;
		try {
			stmt = con.createStatement();
			String sql = "SELECT nome FROM usuarios where usuario='" 
					+ nomeUsuario + "' and senha='" 
					+ senha + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				nomeUsuario = rs.getString("nome");
				usuario = new Usuario(nomeUsuario);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return usuario;
	}

	@Override
	public Object recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		//conectar com sgbd
		Connection con = FabricaDeConexoes.getConnection();
		//montar a consulta
		Statement stmt = null;
		Usuario usuario = null;
		try {
			stmt = con.createStatement();
			String sql = "insert into usuarios(nome,usuario,senha,cpf,email,endereco,bairro,telefone,cargo) values('"
					+((Usuario)entidade).getNome()+"','"
					+((Usuario)entidade).getNomeUsuario()+"','"
					+((Usuario)entidade).getSenha()+"','"
					+((Usuario)entidade).getCpf()+"','"
					+((Usuario)entidade).getEmail()+"','"
					+((Usuario)entidade).getEndereco()+"','"
					+((Usuario)entidade).getBairro()+"','"
					+((Usuario)entidade).getTelefone()+"','"
					+((Usuario)entidade).getCargo()+"');";
			stmt.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub

	}

	//@Override
	public List listarUsuarios() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM usuarios;";
			ResultSet rsu = stmt.executeQuery(sql);
			while(rsu.next()) {
				usuarios.add(new Usuario(
						rsu.getString("nome"),
						rsu.getString("usuario"),
						rsu.getString("senha"),
						rsu.getString("cpf"),
						rsu.getString("email"),
						rsu.getString("endereco"),
						rsu.getString("bairro"),
						rsu.getString("telefone"),
						rsu.getString("cargo")));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return usuarios;
	}

}
