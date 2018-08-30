package string.example;

import java.util.ArrayList;
import java.util.List;

public class House {

    private House() {
    }

    private static House house=new House();


    private static List<House> h = new ArrayList<House>();

    public static List<House> getInstance() {
        System.out.println("in f1");
       h.add(house);
        return h;
    }
    public void showHouseDim(){

        System.out.println("10 by 10");
        System.out.println("update the code");
        if(10>5)
            System.out.println("10 is Greater :");
        if (10<5)
            System.out.println("5 is greater :");
    }

}









