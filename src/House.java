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
    }

}









