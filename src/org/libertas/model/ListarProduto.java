package org.libertas.model;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.libertas.model.dao.ProdutoDao;
import org.libertas.model.pojo.Produto;

import com.google.gson.Gson;

public class ListarProduto implements Modelo {
	

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		try {
			ProdutoDao pdao = new ProdutoDao();
			LinkedList<Produto> lista = pdao.listar();
			Gson gson = new Gson();
			String json = gson.toJson(lista);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
