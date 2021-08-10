package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        String usuario = peticion.getParameter("usr");
        String password = peticion.getParameter("psw");
        System.out.println("Parametro de usuario: "+usuario);
        System.out.println("Parametro de password: "+password);
        PrintWriter out = respuesta.getWriter();
        out.print("<html lang=es>");
        out.print("<head>");
        out.print("<title>");
        out.print(".:Login:.");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>");
        out.print("Esta es una respuesta del servlet Login");
        out.print("</h1>");
        out.print("<br>");
        out.print("<p>");
        out.print("Usuario recibido: "+usuario+"<br>");
        out.print("Password recibido: "+password+"<br>");
        out.print("</p>");
        out.print("<a href=\"/02MetodoPost/\">");
        out.print("Regresar</a>");
        out.print("</body>");
        out.print("</html>");
    }
    
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        PrintWriter out = respuesta.getWriter();
        out.print("No se permite el metodo GET en este servlet");
        respuesta.sendRedirect("./Hola.jsp");
    }
    
}
