public class Wrap implements TimsConsumables{
    @Override
    public int getCalories() {
        return 400;
    }

    @Override
    public double getPrice() {
        return 4.5;
    }
    public String toString(){
        return "Item: Wrap" + "Price: " + getPrice();
    }
}
