package servlet;

import javax.servlet.http.HttpSession;
import model.Customer;

import dao.OrderDAO;
import model.Order;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // 1. Get form data from JSP
            int foodId = Integer.parseInt(request.getParameter("foodId"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            HttpSession session = request.getSession();

            Customer customer =
                    (Customer) session.getAttribute("customer");

            int userId = customer.getId();
            

            // 2. Create Order object
            Order order = new Order();
            order.setFoodId(foodId);
            order.setQuantity(quantity);
            order.setUserId(userId);

            // 3. Call DAO
            OrderDAO dao = new OrderDAO();
            boolean result = dao.placeOrder(order);

            // 4. Redirect based on result
            if (result) {
                response.sendRedirect("order-success.jsp");
            } else {
                response.sendRedirect("order-failed.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("order-failed.jsp");
        }
    }
}