
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> usersList;
    private List<Product> productsList;
    private List<Order> ordersList;
    private static DataBase instance;

    private DataBase() {
        ArrayList<Integer> listOfIds = new ArrayList<Integer>();
        usersList = new ArrayList<User>();
        ordersList = new ArrayList<Order>();
        productsList = new ArrayList<Product>();
        User firstUser = new User();
        Product product = new Product();
        Order order = new Order(200);
        listOfIds.add(product.getId());
        //set user properties
        firstUser.setEmail("a");
        firstUser.setUsername("firstUser");
        firstUser.setId(1);
        //set product properties
        product.setName("Computer");
        product.setPrice(500);
        product.setId(1000);
        //set order properties
        order.setProductsId(listOfIds);
        order.setUserId(firstUser.getId());
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

    public Order createOrder(ArrayList<Integer> idsProduct, Integer userId, Integer orderId) {

        Order newOrder = new Order(orderId);
        newOrder.setUserId(userId);
        newOrder.setProductsId(idsProduct);
        return newOrder;
    }
}
