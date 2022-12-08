package p1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        //вывод меню
        //методы похожи, но возвращают разные типы
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        ///////////////////////////////////////////////////////
        //надо написать два разных цикла, для перебора двех меню
        //для ArrayList
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println();
        //для Array
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        //если добавится новый ресторан со своей реализацией, придется создавать новый цикл
    }
}
