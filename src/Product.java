public class Product {
    private Integer id;
    private String name;
    private Integer price;


    public static Product getProduct(Integer id) {
        return DataBase.getInstance().getProduct(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setId(Integer id) { this.id = id;}

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }
}