public class HockeyCards implements TimsMerchandise{
    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String getFeatures() {
        return " Your favourite Hockey players card deck";
    }
    public String toString(){
        return "Item: Hockey Cards" + "Price: " + getPrice();
    }
}
