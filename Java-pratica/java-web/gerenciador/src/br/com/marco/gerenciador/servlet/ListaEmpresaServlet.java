package br.com.marco.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();
		
		// Chama JSP
		
		request.setAttribute("empresas", lista);	// método que deixa as informações disponiveis durante a renderização.
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");		// Arquivo onde sera dispachado a requisição.
		rd.forward(request, response);
	}

}
