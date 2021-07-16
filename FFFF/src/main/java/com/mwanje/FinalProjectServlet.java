package com.mwanje;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/calculate")
public class FinalProjectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int sum = (a + b);

        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("sum", sum);

        request.getRequestDispatcher("result.jsp").forward(request, response);

}
}
