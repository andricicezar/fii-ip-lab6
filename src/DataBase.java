
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> usersList;
    private List<Product> productsList;
    private List<Order> ordersList;
    private static DataBase instance;

    private DataBase() {
        usersList = new ArrayList<User>();
        ordersList = new ArrayList<Order>();
        productsList = new ArrayList<Product>();
        User first = new User();
        Order firstO = new Order();


        first.setEmail("a");
        first.setUsername("firstUser");



    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }

        return instance;
    }

    public User getUser(Integer id) {
        return usersList.get(id);
    }

    public Order getOrder(Integer id) {
        return ordersList.get(id);
    }

    public Product getProduct(Integer id) {
        return productsList.get(id);
    }

//    public Order createOrder(Integer user_id, Integer[] product_ids) {
//    }
}
