package task2.services;

public class Calculator {
    private static final int x11 = -4;
    private static final int x12 = 4;
    private static final int y11 = 0;
    private static final int y12 = 5;

    private static final int x21 = -6;
    private static final int x22 = 6;
    private static final int y21 = 0;
    private static final int y22 = 3;

    public boolean isInArea(int x, int y) {
        return Math.abs(x) >= x11 && Math.abs(x) <= x12 && Math.abs(y) >= y11 && Math.abs(y) <= y12
                || Math.abs(x) >= x21 && Math.abs(x) <= x22 && Math.abs(y) >= y21 && Math.abs(y) <= y22;
    }
}
