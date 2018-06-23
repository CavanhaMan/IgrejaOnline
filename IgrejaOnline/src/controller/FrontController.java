package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.tarefa.FabricaDeTarefa;
import model.tarefa.Tarefa;

@WebServlet("/frontcontroller/*")
public class FrontController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String view = null;
			if (request.getPathInfo().split("\\.").length > 1) {
				view = request.getPathInfo().split("\\.")[0].substring(1);
			} else {
				Tarefa tarefa = FabricaDeTarefa.getTarefa(request);
				view = tarefa.executa(request, response);
			}
			
			request.getRequestDispatcher("../WEB-INF/" + view + ".jsp").forward(request, response);
		} catch (Exception e) {
			throw new ServletException("Erro executando tarefa.", e);
		}
	}
}
