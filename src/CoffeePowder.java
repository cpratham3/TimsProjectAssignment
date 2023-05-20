public class CoffeePowder implements TimsMerchandise{
    @Override
    public double getPrice() {
        return 8;
    }

    @Override
    public String getFeatures() {
        return "500g of Dark Roasted Coffee";
    }
    public String toString(){
        return "Item: Coffee Powder" + "Price: " + getPrice();
    }
}
