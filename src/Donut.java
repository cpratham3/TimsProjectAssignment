public class Donut implements TimsConsumables{
    @Override
    public int getCalories() {
        return 200;
    }

    @Override
    public double getPrice() {
        return 2.25;
    }
    public String toString(){
        return "Item: Donut" + "Price: " + getPrice();
    }
}
