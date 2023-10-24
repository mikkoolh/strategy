package org.example;

import java.util.List;

public class EveryThirdElement implements ListConverter{
    @Override
    public String listToString(List<Object> list) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            string.append(list.get(i).toString());
            if (i % 3 == 2) {
                string.append("\n");
            } else {
                string.append(" ");
            }
        }
        return string.toString();
    }
}
