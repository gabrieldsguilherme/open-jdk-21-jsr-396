package jep430.stringtemplates;

public class JEP430StringTemplates3 {

    public static void main(String[] args) {
        String name = "Joan Smith";
        String phone = "555-123-4567";
        String address = "1 Maple Drive, Anytown";
        String json = STR."""
                {
                    "name": "\{name}",
                    "phone": "\{phone}",
                    "address": "\{address}"
                }
                """;
        System.out.print(json);
    }

}
