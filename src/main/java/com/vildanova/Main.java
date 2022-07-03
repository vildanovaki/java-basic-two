package com.vildanova;

import java.util.*;

public class Main {

    private static ListExample listExample = new ListExample();
    private static SetExample setExample = new SetExample();
    private static MapExample mapExample = new MapExample();

    public static void main(String[] args) {

        System.out.println("Пример LIST");
        listExample.addObjectToEnd("first object", "OBJECT1");
        listExample.addObjectToEnd("second object", "OBJECT1");
        listExample.addObjectToEnd("third object", "OBJECT3");
        listExample.addObjectToIndex(1, "fourth object", "OBJECT1");
        listExample.addObjectToIndex(1, "fifth object", "OBJECT3");
        listExample.getValueOfIndex(1, "OBJECT1");
        listExample.getValueOfIndex(1, "OBJECT3");
        listExample.editObjectToIndex("sixth", 0, "OBJECT1");
        listExample.editObjectToIndex("seventh", 0, "OBJECT3");
        listExample.printArrayList("OBJECT1");
        listExample.deleteObjectToIndex(1, "OBJECT1");
        listExample.deleteObjectToIndex(1, "OBJECT3");
        listExample.addCollectionToCollectionToEnd("OBJECT2", "OBJECT1");
        listExample.getObjects("OBJECT1");
        listExample.getObjects("OBJECT2");
        Collections.sort(listExample.objects1);
        listExample.printArrayList("OBJECT1");

        System.out.println("Пример HashSet");
        setExample.addToHashSet("first HashSet element");
        setExample.addToHashSet("second HashSet element");
        setExample.addToHashSet("third HashSet element");
        setExample.removeToHashSet("first HashSet element");
        setExample.iteratorHashSet();
        setExample.isHashSetEmptyOrNot();
        setExample.containsInHashSet("first HashSet element");
        System.out.println("До сортировки HashSet: ");
        setExample.iteratorHashSet();
        List<String> sortedHashSet = new ArrayList<>(setExample.stringSet);
        Collections.sort(sortedHashSet);
        System.out.println("После сортировки HashSet: " + sortedHashSet);
        setExample.clearAllToHashSet();
        setExample.isHashSetEmptyOrNot();

        System.out.println("Пример TreeSet");
        setExample.addToTreeSet("first TreeSet element");
        setExample.addToTreeSet("second TreeSet element");
        setExample.addToTreeSet("third TreeSet element");
        setExample.addToTreeSet("fourth TreeSet element");
        setExample.containsInTreeSet("third TreeSet element");
        setExample.getFirstElementInTreeSet();
        setExample.getLastElementInTreeSet();
        setExample.sizeTreeSet();
        setExample.iteratorTreeSet();
        setExample.subSet("fourth TreeSet element", "third TreeSet element");
        setExample.removeToTreeSet("third TreeSet element");
        setExample.isTreeSetEmptyOrNot();

        System.out.println("Пример HashMap");
        mapExample.putToMap(5, "five");
        mapExample.putToMap(3, "three");
        mapExample.putToMap(2, "two");
        mapExample.putToMap(4, "four");
        mapExample.getValueByKey(2);
        mapExample.replaceByKeyToMap(2, "second");
        mapExample.removeFromMap(1);
        mapExample.iteratorMap();
        mapExample.containsKeyInMap(1);
        mapExample.containsValueInMap("four");
        mapExample.isMapEmptyOrNot();
        mapExample.clearMap();
        mapExample.isMapEmptyOrNot();

    }
}
