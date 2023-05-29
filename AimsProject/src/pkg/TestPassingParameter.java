package pkg;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        //Print name of created dvd
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle() + "\n");

        //Swap pass-by-value
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle() + "\n");

        //Change title
        //changeTitle(jungleDVD, cinderellaDVD.getTitle());
        //System.out.println("jungle dvd title: " + jungleDVD.getTitle() + "\n");

        //Create wrapper to wrap the created dvd
        DvdWrapper wrappedJungleDVD = new DvdWrapper(jungleDVD);
        DvdWrapper wrappedCinderellaDVD = new DvdWrapper(cinderellaDVD);

        //Swap the wrapped dvd
        wrappedJungleDVD.swapWith(wrappedCinderellaDVD);
        System.out.println("jungle dvd title: " + wrappedJungleDVD.dvd.getTitle());
        System.out.println("cinderella dvd title: " + wrappedCinderellaDVD.dvd.getTitle() + "\n");
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        System.out.printf("Swapped %s and %s\n", o1, o2);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
        System.out.printf("Changed title from %s to %s\n", oldTitle, title);
    }
}
class DvdWrapper {
    public DigitalVideoDisc dvd;
    public DvdWrapper(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }
    public void swapWith(DvdWrapper swapper) {
        DigitalVideoDisc tmp = dvd;
        dvd = swapper.dvd;
        swapper.dvd = tmp;
        System.out.printf("Swapped %s with %s using wrapper class" + "\n", dvd.getTitle(), swapper.dvd.getTitle());
    }
}