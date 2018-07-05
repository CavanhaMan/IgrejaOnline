package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Igreja;

public class IgrejaDAO implements DAO {

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
		Igreja igreja = null;
		try {
			stmt = con.createStatement();//cnpj,nome,endereco,bairro,telefone;
			String sql = "insert into igreja(cnpj,nome,endereco,bairro,telefone) values('"
					+((Igreja)entidade).getCnpj()+"','"
					+((Igreja)entidade).getNome()+"','"
					+((Igreja)entidade).getEndereco()+"','"
					+((Igreja)entidade).getBairro()+"','"
					+((Igreja)entidade).getTelefone()+"');";
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
	public List listarIgrejas() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Igreja> igrejas = new ArrayList<Igreja>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM igreja;";
			ResultSet rsi = stmt.executeQuery(sql);//cnpj,nome,endereco,bairro,telefone;
			while(rsi.next()) {
				igrejas.add(new Igreja(
						rsi.getString("cnpj"),
						rsi.getString("nome"),
						rsi.getString("endereco"),
						rsi.getString("bairro"),
						rsi.getString("telefone")));
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
		return igrejas;
	}

}
