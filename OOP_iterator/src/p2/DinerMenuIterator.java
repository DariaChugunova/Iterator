package p2;

//итератор для колекции DinerMenu
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;//текущая позиция перебора
    //конструктор получает массив объектов, для перебора которых создается итератор
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public MenuItem next() {//следующий элемент массива
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    //проверка, есть и еще элементы в массиве
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}