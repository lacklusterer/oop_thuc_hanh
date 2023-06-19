package hust.soict.cs01.aims.console;

import java.util.List;
import java.util.Scanner;

public class BaseMenu {
    protected Scanner scanner = new Scanner(System.in);
    protected boolean running = true;

    // Show menu method
    public void showMenu(List<String> options, String menuName) {
        while (running) {
            String separator = "--------------------------------";

            // title
            System.out.println(menuName);
            System.out.println(separator);

            // options
            StringBuilder guideText = new StringBuilder("Please choose a number: 0");
            for (int i = 1; i <= options.size(); i++) {
                System.out.printf(i + ". " + options.get(i - 1) + "\n");
                guideText.append("-").append(i);
            }

            // separator + guide
            System.out.print("\n" + "0. Back" + "\n" + separator + "\n" + guideText + "\n");

            // process
            processOption();
        }
    }

    public void processOption() {}
}
