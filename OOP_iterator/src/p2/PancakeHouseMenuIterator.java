package p2;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    //Конструктор получает объекты для перебора
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    //следующий элемент
    public MenuItem next() {
        return items.get(position++);
    }

    //проверка на наличие следующдего элемента
    public boolean hasNext() {
        return items.size() > position;
    }
}
