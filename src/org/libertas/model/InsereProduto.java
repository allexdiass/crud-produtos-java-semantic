package org.libertas.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.libertas.model.dao.ProdutoDao;
import org.libertas.model.pojo.Produto;

public class InsereProduto implements Modelo {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			if (request.getParameter("idproduto")==null 
					|| request.getParameter("idproduto").equals("")) {
				return "Descricao obrigatoria";
			}
			
			if (request.getParameter("descricao")==null 
					|| request.getParameter("descricao").equals("")) {
				return "Descricao obrigatoria";
			}
			
			Produto p = new Produto();
			p.setDescricao(request.getParameter("descricao"));
			p.setIdproduto(Integer.parseInt(request.getParameter("idproduto")));
			p.setMarca(request.getParameter("marca"));
			p.setPrecoCusto(Double.parseDouble(request.getParameter("precoCusto")));
			p.setPrecoVenda(Double.parseDouble(request.getParameter("precoVenda")));
			p.setSaldo(Double.parseDouble(request.getParameter("saldo")));
			
			ProdutoDao pdao = new ProdutoDao();
			pdao.inserir(p);
			return "sucesso";
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
