package com.vildanova;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    Map<Integer, String> aMap = new HashMap<>();

    public void putToMap(int key, String value) {
        aMap.put(key, value);
    }

    public void getValueByKey(int key) {
        aMap.get(key);
    }

    public void removeFromMap(int key) {
        aMap.remove(key);
    }

    public void iteratorMap() {
        Iterator<Map.Entry<Integer, String>> itr = aMap.entrySet().iterator();
        System.out.println("Элементы Map:");
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }

    public void clearMap() {
        aMap.clear();
    }

    public void replaceByKeyToMap(int key, String newValue) {
        aMap.replace(key, newValue);
    }

    public void sizeMap() {
        System.out.println("Размер Map составляет: " + aMap.size());
    }

    public void isMapEmptyOrNot() {
        if (aMap.isEmpty()) {
            System.out.println("Map пустой");
        } else {
            System.out.println("Map не пустой");
        }
    }

    public void containsKeyInMap(int key) {
        boolean containsKey = aMap.containsKey(key);
        if (containsKey) {
            System.out.println("В Map содержится ключ " + key);
        } else {
            System.out.println("В Map не содержится ключ " + key);
        }
    }

    public void containsValueInMap(String value) {
        boolean containsValue = aMap.containsValue(value);
        if (containsValue) {
            System.out.println("В Map содержится значение " + value);
        } else {
            System.out.println("В Map не содержится значение " + value);
        }
    }
}
