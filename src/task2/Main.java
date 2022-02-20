package task2;


public class Main {
    public static void main(String[] args) {
        double total = 0;
        Rouse ros1 = new Rouse(15.5, Color.RED);
        Rouse ros2 = new Rouse(20, Color.WHITE);
        Gvozdika gvo1 = new Gvozdika(25.30, Color.YELLOW);
        Tulip tul1 = new Tulip(10,Color.YELLOW);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1).addFlower(ros2).addFlower(gvo1).addFlower(tul1);
        System.out.println(bouquet.getPrice());
    }
}