package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.CalendarioDAO;
import model.javabean.Calendario;

public class listarCalendariosTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Calendario> lista = new CalendarioDAO().listarCalendarios();
		request.getSession().setAttribute("calendarios", lista);
		return "listaCalendarios";
	}

}
