package pers.tunan.servlet; /**
 * @author Tunan
 * @version 1.0
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String[] music = request.getParameterValues("music");

        request.setAttribute("name", name);
        request.setAttribute("music", music);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}

