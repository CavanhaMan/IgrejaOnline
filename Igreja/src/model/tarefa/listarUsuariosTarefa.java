package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UsuarioDAO;
import model.javabean.Usuario;

public class listarUsuariosTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Usuario> listau = new UsuarioDAO().listarUsuarios();
		request.getSession().setAttribute("usuarios", listau);
		return "listaUsuarios";
	}

}
