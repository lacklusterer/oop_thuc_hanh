package pkg;

public class StoreTest {
    public static void main(String[] args) {


        Store Store1 = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie",
                "Comedy", "Michael Bay", 180, 29.99f);
        Store1.addDVD(dvd1);
        Store1.removeDVD(dvd1);
    }
}
