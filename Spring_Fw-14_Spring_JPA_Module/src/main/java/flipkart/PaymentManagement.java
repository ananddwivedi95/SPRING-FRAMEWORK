package flipkart;

import javax.persistence.*;

@Entity
@Table(name="PaymentManagement")
public class PaymentManagement {
    
	@Id
	@Column(name="paymentId")
	private int paymentId;
	
	@Column(name="OrderId")
	private int OrderId;
	
	@Column(name="emialId")
	private String emialId;
	
	@Column(name="orderCost")
	private int orderCost;
	
	@Column(name="paymentStatus")
	private String paymentStatus;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getEmialId() {
		return emialId;
	}

	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}

	public int getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(int orderCost) {
		this.orderCost = orderCost;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
}
