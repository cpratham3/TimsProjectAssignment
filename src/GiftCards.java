public class GiftCards implements TimsMerchandise{
    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getFeatures() {
        return "A 100 dollar gift card";
    }
    public String toString(){
        return "Item: gift card" + "Price: " + getPrice();
    }
}
