package hust.soict.cs01.aims.console;

import java.util.Arrays;
import java.util.List;

public class MainMenu extends BaseMenu {
    private List<String> options = Arrays.asList(
            "View store",
            "Update store",
            "See current cart"
    );
    private String menuName = "Aims";

    public List<String> getOptions() {
        return options;
    }

    public String getMenuName() {
        return menuName;
    }

    @Override
    public void processOption() {
        super.processOption();
        int choice = scanner.nextInt();
        switch (choice) {
            case 0 -> running = false; // Set running to false which exits the loop
            case 1 -> {
                // View store
                System.out.println("View store");
            }
            case 2 -> {
                // Update store
                System.out.println("Update store");
            }
            case 3 -> {
                System.out.println("Print cart");
            }
        }
    }
}
