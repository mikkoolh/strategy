package org.example;

import java.util.List;

public class EverySecondElement implements ListConverter{
    @Override
    public String listToString(List<Object> list) {
        StringBuilder string = new StringBuilder();
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            string.append(array[i].toString());
            if (i % 2 == 1) {
                string.append("\n");
            } else {
                string.append(" ");
            }
        }
        return string.toString();
    }
}
