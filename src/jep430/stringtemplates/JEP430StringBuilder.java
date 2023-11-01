package jep430.stringtemplates;

public class JEP430StringBuilder {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String s = new StringBuilder()
                .append(x)
                .append(" plus ")
                .append(y)
                .append(" equals ")
                .append(x + y)
                .toString();
        System.out.print(s);
    }

}
