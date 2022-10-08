package task3;

import task3.entities.Argument;
import task3.services.Drawer;
import task3.services.Reader;

public class App {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        Reader reader = new Reader();
        Argument argument = reader.getInputFromConsole();
        drawer.drawTable(argument);
    }
}
