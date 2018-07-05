package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Agenda;
import model.javabean.Usuario;

public class AgendaDAO implements DAO {

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
		Agenda agenda = null;
		try {
			stmt = con.createStatement();
			String sql = "insert into agenda(titulo,data,hora,endereco,bairro,cnpj) values('"
					+((Agenda)entidade).getTitulo()+"','"
					+((Agenda)entidade).getData()+"','"
					+((Agenda)entidade).getHora()+"','"
					+((Agenda)entidade).getEndereco()+"','"
					+((Agenda)entidade).getBairro()+"','"
					+((Agenda)entidade).getCnpj()+"');";
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
	public List listarAgendas() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Agenda> agendas = new ArrayList<Agenda>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM agenda;";
			ResultSet rsa = stmt.executeQuery(sql);
			while(rsa.next()) {//titulo,data,hora,endereco,bairro,cnpj
				agendas.add(new Agenda(
						rsa.getString("titulo"),
						rsa.getString("data"),
						rsa.getString("hora"),
						rsa.getString("endereco"),
						rsa.getString("bairro"),
						rsa.getString("cnpj")));
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
		return agendas;
	}

}
