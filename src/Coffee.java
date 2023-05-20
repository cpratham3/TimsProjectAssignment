public class Coffee implements TimsConsumables{
    @Override
    public int getCalories() {
        return 30;
    }

    @Override
    public double getPrice() {
        return 1.25;
    }
    public String toString(){
        return "Item: Coffee" + "Price: " + getPrice();
    }
}
