package servlet;

import dao.FoodDAO;
import model.Food;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewFoodServlet")
public class ViewFoodServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        FoodDAO dao = new FoodDAO();

        List<Food> foodList = dao.getAllFood();

        request.setAttribute("foodList", foodList);

        request.getRequestDispatcher("viewFood.jsp")
               .forward(request, response);
    }
}