package servlet;

import dao.CustomerDAO;
import model.Customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	 @Override
	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response)
	         throws ServletException, IOException {

	      response.getWriter().println("RegisterServlet is working");
	 }
	
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        Customer customer = new Customer();

        customer.setName(name);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setPhone(phone);

        CustomerDAO dao = new CustomerDAO();

        if(dao.registerCustomer(customer)) {

            response.getWriter()
                    .println("Registration Successful");

        } else {

            response.getWriter()
                    .println("Registration Failed");
        }
    }
}