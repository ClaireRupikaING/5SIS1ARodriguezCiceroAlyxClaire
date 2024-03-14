package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validar las credenciales aquí (por ejemplo, comparando con las credenciales predeterminadas)

        if ("phantasyosu@gmail.com".equals(email) && "InnerUniverse64".equals(password)) {
            // Las credenciales son correctas, crear sesión y redirigir a la página de inicio
            HttpSession session = request.getSession();
            session.setAttribute("user", email);
            response.sendRedirect("inicio.jsp");
        } else {
            // Las credenciales son incorrectas, redirigir a la página de error
            response.sendRedirect("error.jsp");
        }
    }
}
