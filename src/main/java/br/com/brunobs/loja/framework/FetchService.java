package br.com.brunobs.loja.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FetchService {

	public static Collection<? extends Object> execute(Collection<? extends Object> lista) throws Exception {
		FetchFactory.setRecursoURL(lista, 100l);
		return lista;

	}

	public static Collection<? extends Object> execute(Collection<? extends Object> lista, int limit) throws Exception {
		FetchFactory.setRecursoURL(lista, limit);
		return lista;

	}

	public static Object execute(Object objeto) throws Exception {
		List list = new ArrayList<Object>();
		list.add(objeto);
		FetchFactory.setRecursoURL(list, 1l);
		return objeto;

	}

	public static Object execute(Object objeto, int limit) throws Exception {
		List list = new ArrayList<Object>();
		list.add(objeto);
		FetchFactory.setRecursoURL(list, limit);
		return objeto;

	}
}
