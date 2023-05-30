package pkg;

public class AimsCartTest {
    public static void main(String[] args) {
        //Create cart named anOrder
        Cart anOrder = new Cart();

        //New dvd, add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie",
                "Comedy", "Michael Bay", 180, 29.99f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Morbius 2: Morbing time",
                "Action Comedy", "Daniel Espinosa", 165, 39.99f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 19.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println(dvd1);
    }
}