package org.example;

import java.util.List;

public class EveryElement implements ListConverter{
    @Override
    public String listToString(List<Object> list) {
        StringBuilder string = new StringBuilder();
        for (Object item : list) {
            string.append(item.toString()).append("\n");
        }
        return string.toString();
    }
}
