package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add("Joku 3.");
        lista.add("Joku 4.");
        lista.add(5);
        lista.add(6);

        ListConverter everyElement = new EveryElement();
        ListConverter everySecondElement = new EverySecondElement();
        ListConverter everyThirdElement = new EveryThirdElement();

        System.out.println(everyElement.listToString(lista));

        System.out.println(everySecondElement.listToString(lista));

        System.out.println(everyThirdElement.listToString(lista));

    }
}