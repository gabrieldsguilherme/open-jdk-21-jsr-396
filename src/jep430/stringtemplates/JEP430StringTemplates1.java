package jep430.stringtemplates;

public class JEP430StringTemplates1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String s = STR."\{x} plus \{y} equals \{x+y}";
        System.out.print(s);
    }

}
