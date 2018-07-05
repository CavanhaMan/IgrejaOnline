package model.tarefa;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabricaDeTarefa {

	static Map<String, Tarefa> tarefas = new HashMap<String, Tarefa>();
	static {
		tarefas.put("POST/login", new LoginTarefa());
		tarefas.put("GET/logout", new LogoutTarefa());
		tarefas.put("GET/exibeFormCadastroUsuario", new exibeFormCadastroUsuarioTarefa());
		tarefas.put("GET/exibeFormCadastroIgreja", new exibeFormCadastroIgrejaTarefa());
		tarefas.put("GET/exibeFormCadastroAgenda", new exibeFormCadastroAgendaTarefa());
		tarefas.put("GET/exibeFormCadastroCalendario", new exibeFormCadastroCalendarioTarefa());
		tarefas.put("POST/cadastrarUsuario", new cadastrarUsuarioTarefa());
		tarefas.put("POST/cadastrarIgreja", new cadastrarIgrejaTarefa());
		tarefas.put("POST/cadastrarAgenda", new cadastrarAgendaTarefa());
		tarefas.put("POST/cadastrarCalendario", new cadastrarCalendarioTarefa());
		tarefas.put("GET/listarUsuarios", new listarUsuariosTarefa());
		tarefas.put("GET/listarIgrejas", new listarIgrejasTarefa());
		tarefas.put("GET/listarAgendas", new listarAgendasTarefa());
		tarefas.put("GET/listarCalendarios", new listarCalendariosTarefa());
	}

	public static Tarefa getTarefa(HttpServletRequest request) {
		Tarefa tarefa = tarefas.get(request.getMethod() + request.getPathInfo());
		if (tarefa != null)
			return tarefa;
		else
			return new NULLTarefa();
	}
}
