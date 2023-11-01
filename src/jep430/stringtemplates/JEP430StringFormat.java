package jep430.stringtemplates;

public class JEP430StringFormat {

    private static void format() {
        int x = 5;
        int y = 10;
        String s = String.format("%2$d plus %1$d equals %3$d", x, y, x + y);
        System.out.print(s);
    }

    private static void formatted() {
        int x = 5;
        int y = 10;
        String s = "%2$d plus %1$d equals %3$d".formatted(x, y, x + y);
        System.out.print(s);
    }

    public static void main(String[] args) {
        format();
        formatted();
    }

}
