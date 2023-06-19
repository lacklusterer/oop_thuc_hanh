package hust.soict.cs01.test.console;

import hust.soict.cs01.aims.console.MainMenu;

public class ConsoleTest {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMenu(mainMenu.getOptions(), mainMenu.getMenuName());
    }
}
