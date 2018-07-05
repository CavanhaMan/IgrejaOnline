package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.AgendaDAO;
import model.javabean.Agenda;

public class listarAgendasTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Agenda> lista = new AgendaDAO().listarAgendas();
		request.getSession().setAttribute("agendas", lista);
		return "listaAgendas";
	}

}
