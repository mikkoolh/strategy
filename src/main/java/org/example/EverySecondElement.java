package org.example;

import java.util.List;

public class EverySecondElement implements ListConverter{
    @Override
    public String listToString(List<Object> list) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            string.append(list.get(i).toString());
            if (i % 2 == 1) {
                string.append("\n");
            } else {
                string.append(" ");
            }
        }
        return string.toString();
    }
}
