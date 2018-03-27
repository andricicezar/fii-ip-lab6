import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> usersList;
   // ArrayList<Product> productsList = new ArrayList<Product>();
    private List<Order> ordersList;
    private static DataBase instance;

    private DataBase() {
        usersList = new ArrayList<>();
        ordersList = new ArrayList<>();
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

//    public Order createOrder(Integer user_id, Integer[] product_ids) {
//    }
}
