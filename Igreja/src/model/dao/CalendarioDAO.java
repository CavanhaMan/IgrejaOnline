package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Calendario;
import model.javabean.Usuario;

public class CalendarioDAO implements DAO {

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
		Calendario calendario = null;
		try {
			stmt = con.createStatement();//titulo,data,hora,endereco,bairro,cnpj
			String sql = "insert into calendario(titulo,data,hora,endereco,bairro,cnpj) values('"
					+((Calendario)entidade).getTitulo()+"','"
					+((Calendario)entidade).getdata()+"','"
					+((Calendario)entidade).gethora()+"','"
					+((Calendario)entidade).getEndereco()+"','"
					+((Calendario)entidade).getBairro()+"','"
					+((Calendario)entidade).getCnpj()+"');";
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
	public List listarCalendarios() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Calendario> calendarios = new ArrayList<Calendario>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM calendario;";
			ResultSet rsc = stmt.executeQuery(sql);
			while(rsc.next()) {//titulo,data,hora,endereco,bairro,cnpj
				calendarios.add(new Calendario(
						rsc.getString("titulo"),
						rsc.getString("data"),
						rsc.getString("hora"),
						rsc.getString("endereco"),
						rsc.getString("bairro"),
						rsc.getString("cnpj")));
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
		return calendarios;
	}

}
