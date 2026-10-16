package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.FoodDAO;
import model.CartItem;
import model.Food;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int foodId =
            Integer.parseInt(request.getParameter("foodId"));

        FoodDAO dao = new FoodDAO();

        Food food = dao.getFoodById(foodId);

        HttpSession session = request.getSession();

        List<CartItem> cart =
            (List<CartItem>) session.getAttribute("cart");

        if(cart == null) {
            cart = new ArrayList<CartItem>();
        }

        CartItem item = new CartItem();

        item.setFoodId(food.getId());
        item.setFoodName(food.getName());
        item.setPrice(food.getPrice());
        item.setQuantity(1);

        cart.add(item);

        session.setAttribute("cart", cart);

        response.sendRedirect("ViewFoodServlet");
    }
}