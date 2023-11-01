package jep430.stringtemplates;

public class JEP430StringTemplates2 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String s = STR."\{x} plus \{y} equals \{sum(x,y)}";
        System.out.print(s);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}
