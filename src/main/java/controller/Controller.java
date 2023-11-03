package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manejador.Manejador;
import model.Result;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String op = request.getParameter("op");
		Manejador manejador;
		Result result;

		switch (op) {
		case "inicio": {

			manejador = new Manejador("http://www.ies-azarquiel.es/paco/apichistes/categorias");
			result = manejador.getResult();
			result.getCategorias();

			session.setAttribute("categorias", result.getCategorias());
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		}
		case "buscaloschistes": {

			String idcategoria = request.getParameter("idcategoria");
			
			manejador = new Manejador("http://www.ies-azarquiel.es/paco/apichistes/categoria/"+idcategoria+"/chistes");
			result = manejador.getResult();
			
			request.setAttribute("chistes", result.getChistes());
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
