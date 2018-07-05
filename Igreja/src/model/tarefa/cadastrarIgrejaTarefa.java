package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.IgrejaDAO;
import model.javabean.Igreja;

public class cadastrarIgrejaTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// recuperar os parametros do formulario
		Igreja igreja = new Igreja(
				request.getParameter("cnpj"), 
				request.getParameter("nome"),
				request.getParameter("endereco"),
				request.getParameter("bairro"),
				request.getParameter("telefone"));
		// enviar dados para o DAO persistir
		new IgrejaDAO().salvar(igreja);
		//retornar o nome da view
		request.setAttribute("msg", "parabéns igreja cadastrada com sucesso");
		return "cadastroIgreja";
	}
}
