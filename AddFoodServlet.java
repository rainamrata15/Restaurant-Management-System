package servlet;

import dao.FoodDAO;
import model.Food;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddFoodServlet")
public class AddFoodServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("AddFoodServlet is working");
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
throws ServletException, IOException {

		System.out.println("doPost called");
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("price"));
		System.out.println(request.getParameter("image"));
		
		String name = request.getParameter("name");
		String category = request.getParameter("category");
        double price =
            Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("image");

        Food food = new Food();

        food.setName(name);
        food.setCategory(category);
        food.setPrice(price);
        food.setImage(image);

        FoodDAO dao = new FoodDAO();

        if(dao.addFood(food)) {

            response.getWriter()
                    .println("Food Item Added Successfully");

        } else {

            response.getWriter()
                    .println("Failed To Add Food");

        }
    }
}