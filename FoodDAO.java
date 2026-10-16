package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Food;
import util.DBConnection;

public class FoodDAO {

    // Add Food
    public boolean addFood(Food food) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                "INSERT INTO food(name, category, price, image) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, food.getName());
            ps.setString(2, food.getCategory());
            ps.setDouble(3, food.getPrice());
            ps.setString(4, food.getImage());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // View All Food
    public List<Food> getAllFood() {

        List<Food> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM food";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Food food = new Food();

                food.setId(rs.getInt("id"));
                food.setName(rs.getString("name"));
                food.setCategory(rs.getString("category"));
                food.setPrice(rs.getDouble("price"));
                food.setImage(rs.getString("image"));

                list.add(food);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Get Food By ID
    public Food getFoodById(int id) {

        Food food = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM food WHERE id=?";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                food = new Food();

                food.setId(rs.getInt("id"));
                food.setName(rs.getString("name"));
                food.setCategory(rs.getString("category"));
                food.setPrice(rs.getDouble("price"));
                food.setImage(rs.getString("image"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return food;
    }
}