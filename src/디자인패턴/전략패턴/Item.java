package 디자인패턴.전략패턴;

public class Item {
    private String name;
    private int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
