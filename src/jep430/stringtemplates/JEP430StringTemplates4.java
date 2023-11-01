package jep430.stringtemplates;

import java.math.BigDecimal;

import static java.util.FormatProcessor.FMT;

public class JEP430StringTemplates4 {

    public static void main(String[] args) {
        String name = "Joan Smith";
        String phone = "5551234567";
        String address = "1 Maple Drive, Anytown";
        BigDecimal income = new BigDecimal("1000");
        String json = FMT."""
                {
                    "name":    "\{name}",
                    "phone":   "\{phone}",
                    "address": "\{address},"
                    "income": "%.2f\{income}"
                }
                """;
        System.out.print(json);
    }

}
