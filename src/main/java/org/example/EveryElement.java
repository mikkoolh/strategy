package org.example;

import java.util.Iterator;
import java.util.List;

public class EveryElement implements ListConverter{
    @Override
    public String listToString(List<Object> list) {
        StringBuilder string = new StringBuilder();
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            string.append(iterator.next().toString()).append("\n");
        }
        return string.toString();
    }
}
