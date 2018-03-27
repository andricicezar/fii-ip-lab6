import java.util.ArrayList;

public class DataBase {
    ArrayList<User> usersList = new ArrayList<User>();
    ArrayList<Product> productsList = new ArrayList<Product>();
    ArrayList<Order> ordersList = new ArrayList<Order>();

    public static User getUser(Integer id) {
    }

    public static Order getOrder(Integer id) {
    }

    public static Order createOrder(Integer user_id, Integer[] product_ids) {
    }
}
