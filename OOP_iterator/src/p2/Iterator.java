package p2;

public interface Iterator {
    //остались ли еще элементы для перебора
    boolean hasNext();
    //следующий элемент
    MenuItem next();
}
