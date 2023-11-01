package jep430.stringtemplates;

import java.text.MessageFormat;

public class JEP430MessageFormat {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String s = "{0} plus {1} equals {2}";
        String mfs = MessageFormat.format(s, x, y, x + y);
        System.out.print(mfs);
    }

}
