package Collection.Data.Type.Fruit.Store;

import java.util.HashMap;

public class FruitPrice {
private HashMap<String ,Integer> price;
private Fruit fruit;
public FruitPrice(HashMap<String, Integer> price, Fruit fruit) {
	this.price = price;
	this.fruit = fruit;
}
@Override
public String toString() {
	return price + " " + fruit;
}

}
