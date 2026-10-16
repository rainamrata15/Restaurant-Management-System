package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Order;
import util.DBConnection;

public class OrderDAO {

    // ==============================
    // 1. PLACE ORDER
    // ==============================
    public boolean placeOrder(Order order) {

        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO order_items (order_id, food_id, quantity) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1); // temporary order_id
            ps.setInt(2, order.getFoodId());
            ps.setInt(3, order.getQuantity());
            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }


    // ==============================
    // 2. GET ALL ORDERS (OPTIONAL BUT USEFUL)
    // ==============================
    public List<Order> getAllOrders() {

        List<Order> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM orders";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Order order = new Order();

                order.setFoodId(rs.getInt("food_id"));
                order.setQuantity(rs.getInt("quantity"));
                order.setUserId(rs.getInt("user_id"));

                list.add(order);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}