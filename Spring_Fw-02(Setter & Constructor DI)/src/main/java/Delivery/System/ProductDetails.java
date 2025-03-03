package Delivery.System;

public class ProductDetails {
private String pName;
private String pType;
private String mDate;
private String eDate;
private double pMrp;
public ProductDetails(String pName, String pType, String mDate, String eDate, double pMrp) {
	super();
	this.pName = pName;
	this.pType = pType;
	this.mDate = mDate;
	this.eDate = eDate;
	this.pMrp = pMrp;
}
@Override
public String toString() {
	return "pName= " + pName + " pType= " + pType + " mDate= " + mDate + " eDate= " + eDate + " pMrp= "
			+ pMrp;
}

}
