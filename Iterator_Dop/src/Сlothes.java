import java.util.ArrayList;
import java.util.Iterator;

public class Сlothes implements  Shop{
    ArrayList<ShopItem> shopItem;
    public Сlothes() {
        //элементы меню хранятся в ArrayList
        shopItem = new ArrayList<ShopItem>();
        //Каждый объект вкючается в ArrayList в конструкторе
        addItem("Футболка",
                "XS - XXL",
                true,
                500);
        addItem("Джинсы",
                "XS-XXL",
                true,
                3000);
        addItem("Носки",
                "36-45",
                true,
                300);
        addItem("Куртка",
                "S-XL",
                false,
                7000);
    }
    public void addItem(String name, String size,
                        boolean wash, double price)
    {
        ShopItem shopItem1 = new ShopItem(name, size, wash, price);
        shopItem.add(shopItem1);
    }

    //используем встроенный итератор для ArrayList
    //поэтому создавать новый класс не надо
    public Iterator<ShopItem> createIterator() {
        return shopItem.iterator();
    }


}
