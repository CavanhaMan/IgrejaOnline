package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.AgendaDAO;
import model.javabean.Agenda;

public class cadastrarAgendaTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// recuperar os parametros do formulario
		Agenda agenda = new Agenda(
				request.getParameter("titulo"), 
				request.getParameter("data"),
				request.getParameter("hora"),
				request.getParameter("endereco"),
				request.getParameter("bairro"),
				request.getParameter("cnpj"));
		// enviar dados para o DAO persistir
		new AgendaDAO().salvar(agenda);
		//retornar o nome da view
		request.setAttribute("msg", "parabéns, programação cadastrada na agenda com sucesso");
		return "cadastroAgenda";
	}
}
