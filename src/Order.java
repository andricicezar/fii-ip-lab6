import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer user_id;
    private List<Integer> products_id;

    Order(Integer id) {
        this.id = id;
        this.products_id = new ArrayList<Integer>();
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return user_id;
    }

    public List<Integer> getProductsId() {
        return products_id;
    }

    public void setProductsId(List<Integer> products_id) {
        this.products_id = products_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public static Order getOrder(Integer id) {
        return DataBase.getInstance().getOrder(id);
    }

    public static Integer totalPrice(List<Integer> products_id,Integer id){
        Integer totalPrice =0;
        for(int i=0;i<products_id.size();i++) {
            Product produs = new Product();
            produs.getProduct(products_id.get(i));
            totalPrice += produs.getPrice();
        }
        return totalPrice;
    }

}
