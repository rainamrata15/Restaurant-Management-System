package servlet;

import dao.CustomerDAO;
import model.Customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("SERVLET HIT");

        CustomerDAO dao = new CustomerDAO();
        Customer customer = dao.loginCustomer(email, password);

        if (customer != null) {

            HttpSession session = request.getSession();
            session.setAttribute("customer", customer);

            response.sendRedirect("home.jsp");

        } else {
            response.getWriter().println("Invalid Email or Password");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}