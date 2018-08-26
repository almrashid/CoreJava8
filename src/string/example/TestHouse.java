package string.example;

public class TestHouse {

    public static void main(String[] args) {

        House house1= House.getInstance().get(0);
        house1.showHouseDim();
        House house2=House.getInstance().get(1);

        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());

    }
}
