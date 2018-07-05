package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Usuario;
import model.javabean.Agenda;
import model.javabean.Igreja;
import model.javabean.Calendario;

public class TodosDAO implements DAO {

	@Override
	public Object recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void salvarUsuarios(Object entidade) {
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

	public void salvarIgrejas(Object entidade) {
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

	public void salvarAgendas(Object entidade) {
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

	public void salvarCalendarios(Object entidade) {
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

	@Override
	public void salvar(Object entidade) {
		// TODO Auto-generated method stub
		
	}

}
