package task3.services;

import task3.entities.Argument;

public class Drawer {
    public void drawTable(Argument argument) {
        drawTableHead();
        double x = argument.getA();
        while (x <= argument.getB()) {
            System.out.printf("| %3.2f | %9.5f |\n", x, Math.tan(x));
            drawLine();
            x += argument.getH();
        }
    }

    private void drawTableHead() {
        drawLine();
        System.out.println("|   x   |   F(x)   |");
        drawLine();
    }

    private void drawLine() {
        System.out.println("--------------------");
    }
}
