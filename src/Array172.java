import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dark", 2000);

//        Arrays.sort(items, new ItemSorter());
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for (Item item : items){
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name);
//    }

    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
