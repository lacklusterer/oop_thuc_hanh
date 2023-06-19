package hust.soict.cs01.aims.console;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestMenu {
    private Scanner scanner = new Scanner(System.in);

    protected List<String> options = Arrays.asList(
            "See a media’s details",
            "Add a media to cart",
            "Play a media",
            "See current cart"
    );
    private String menuName = "Options";

    private boolean running = true;

    // Show menu method
    public void showMenu() {
        while (running) {
            System.out.println(menuName);
            String separator = "--------------------------------";
            System.out.println(separator);

            // Print options
            StringBuilder guideText = new StringBuilder("Please choose a number: 0");
            for (int i = 1; i <= options.size(); i++) {
                System.out.printf(i + ". " + options.get(i - 1) + "\n");
                guideText.append("-").append(i);
            }

            // Separator + guide
            System.out.print("\n" + "0. Back" + "\n" + separator + "\n" + guideText + "\n");

            processOption();
        }
    }

    public void processOption() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 0 -> running = false; // Set running to false which exits the loop
            case 1 -> {
                System.out.println("See a media's details");
            }
            case 2 -> {
                System.out.println("Add a media to cart");
            }
            case 3 -> {
                System.out.println("Play a media");
            }
            case 4 -> {
                System.out.println("See current cart");
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    public static void main(String[] args) {
        TestMenu testMenu = new TestMenu();
        testMenu.showMenu();
    }
}
