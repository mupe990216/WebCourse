package Web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/saluda")
public class Saluda extends HttpServlet{
    /*
        Los servlets responde a las peticiones HTTP con los siguientes metodos:
        Peticion HTTP Get -  doGet
        Peticion HTTP Post -  doPost
    */
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        PrintWriter out = respuesta.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("<h1>");
        out.print("Hola Mundo desde un Servlet");
        out.print("</h1>");
        out.print("<a href=\"/01HolaMundo/\">Regresar</a>");
        //out.print("<a href=\"./\">Regresar</a>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
