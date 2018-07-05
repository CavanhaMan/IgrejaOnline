package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.IgrejaDAO;
import model.javabean.Igreja;

public class listarIgrejasTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Igreja> listai = new IgrejaDAO().listarIgrejas();
		request.getSession().setAttribute("igrejas", listai);
		return "listaIgrejas";
	}
}
