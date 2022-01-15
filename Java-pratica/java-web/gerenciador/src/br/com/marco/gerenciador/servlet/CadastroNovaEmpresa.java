package br.com.marco.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroNovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class CadastroNovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String novaEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(novaEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
		PrintWriter out = response.getWriter();
		System.out.println("Empresa " + banco.getEmpresa() + " cadastrada com sucesso...");
		out.println("<html><body>Empresa " + novaEmpresa + " cadastrada com sucesso!</body></html>");
	}

}
