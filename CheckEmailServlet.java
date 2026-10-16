package servlet;

import dao.CustomerDAO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CheckEmailServlet")
public class CheckEmailServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String email =
                request.getParameter("email");

        CustomerDAO dao = new CustomerDAO();

        boolean exists =
                dao.checkEmailExists(email);

        PrintWriter out =
                response.getWriter();

        if(exists) {
            out.print("Email Already Exists");
        } else {
            out.print("Email Available");
        }
    }
}