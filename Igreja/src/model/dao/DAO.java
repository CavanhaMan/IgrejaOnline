package model.dao;

import java.util.List;

public interface DAO<E> {
	public E recuperarPorId(Object id);
	public void salvar(E entidade);
	//public void salvarUsuarios(E entidade);
	//public void salvarIgrejas(E entidade);
	//public void salvarAgendas(E entidade);
	//public void salvarCalendarios(E entidade);
	public void excluir(Object id);
	//public List<E> listarUsuarios();
	//public List<E> listarIgrejas();
	//public List<E> listarAgendas();
	//public List<E> listarCalendarios();
}
