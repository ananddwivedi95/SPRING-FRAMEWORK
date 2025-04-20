package flipkart;

import javax.persistence.*;

@Entity
@Table(name="ordertable")
public class OrderTable {
    
    @Id
    @Column(name="orderId")
    private int orderId;

    @Column(name="productName")
    private String productName;

    @Column(name="totalAmount")
    private double totalAmount;

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
