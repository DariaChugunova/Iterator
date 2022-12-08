package p3;

import java.util.Iterator;

//возвращает итератор для элементов меню
public interface Menu {
    public Iterator<MenuItem> createIterator();
}