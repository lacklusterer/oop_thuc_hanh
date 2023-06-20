package hust.soict.cs01.aims.console;

import java.util.List;
import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scanner = new Scanner(System.in);

    private boolean running = true;
    public void exit() {running = false;}

    public abstract void processOption();

    // Show menu method
    public void showMenu(List<String> options, String menuName) {
        while (running) {

            // clear console
            System.out.print("\033[H\033[2J"); // Clear screen
            System.out.flush();

            // title
            System.out.println(menuName + "\n--------------------------------");

            // options
            StringBuilder guideText = new StringBuilder("Please choose a number: 0");
            for (int i = 1; i <= options.size(); i++) {
                System.out.printf(i + ". " + options.get(i - 1) + "\n");
                guideText.append("-").append(i);
            }

            // separator + guide
            System.out.print("\n" + "0. Back" + "\n" + "--------------------------------" + "\n" + guideText + "\n");

            // process
            processOption();
        }
    }
}
