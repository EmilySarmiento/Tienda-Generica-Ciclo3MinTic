package co.edu.unbosque.tiendagenerica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import co.edu.unbosque.tiendagenerica.controller.productosController;

@WebServlet("/tgServlet_productos")
@MultipartConfig 
public class tgServlet_productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

   
    public tgServlet_productos() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		productosController con = new productosController();
		PrintWriter out =response.getWriter();
		out.println("");
		String nombre = request.getParameter("nombre");
		Part archivo = request.getPart("archivo");
		String filename =archivo.getSubmittedFileName();
		InputStream is = archivo.getInputStream();
		File f = new File("C:\\Users\\SuperUs\\Desktop\\Clases Virtuales\\Tienda-Generica-Ciclo3MinTic\\tiendagenerica\\src\\main\\webapp\\files\\"+nombre);
		FileOutputStream ous = new FileOutputStream(f);
		int dato = is.read();
			while(dato !=-1) {
				ous.write(dato);
				dato = is.read();
				ous.close();
				is.close();
			out.println("Archivo guardado con éxito");
			con.getClass();
		
		}
		
	}


}
