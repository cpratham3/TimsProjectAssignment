public class Mugs implements TimsMerchandise{

    @Override
    public double getPrice() {
        return 6;
    }

    @Override
    public String getFeatures() {
        return "beautiful Red Mug";
    }
    public String toString(){
        return "Item: Mug" + "Price: " + getPrice();
    }
}
