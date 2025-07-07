package August.ex_18082024.CollectionFramework;

import java.util.List;

public class Lab211 {
    public static void main(String[] args) {
        List shopping_list = List.of("Milk","Bread","Butter","Cheese"); // of is a static function
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        shopping_list.add("Banana");// We"ll get error as add is an incomplete function.



    }
}
