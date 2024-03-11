import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItens; // lista de CarItem
    public ShoppingCart(){
        
    }

    public ShoppingCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }
    public void setCarItem(int id, int quantity, Product product){
        this.carItem = new CarItem(id, quantity, product);
    }

    public int getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public CarItem getCarItem() {
        return carItem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItem=" + carItem +
                '}';
    }
}
