import java.util.Iterator;
//возвращает итератор для элементов shop
public interface Shop {
    public Iterator<ShopItem> createIterator();
}
