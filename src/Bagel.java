public class Bagel implements TimsConsumables{
    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
    public String toString(){
        return "Item: Bagel" + "Price: " + getPrice();
    }
}
