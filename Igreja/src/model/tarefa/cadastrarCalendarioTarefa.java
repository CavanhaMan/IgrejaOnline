package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.CalendarioDAO;
import model.javabean.Calendario;

public class cadastrarCalendarioTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// recuperar os parametros do formulario
		Calendario calendario = new Calendario(
				request.getParameter("titulo"), 
				request.getParameter("data"),
				request.getParameter("hora"),
				request.getParameter("endereco"),
				request.getParameter("bairro"),
				request.getParameter("cnpj"));
		// enviar dados para o DAO persistir
		new CalendarioDAO().salvar(calendario);
		//retornar o nome da view
		request.setAttribute("msg", "parabéns calendario cadastrado com sucesso");
		return "cadastroCalendario";
	}
}
