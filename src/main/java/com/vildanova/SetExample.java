package com.vildanova;

import java.util.*;

public class SetExample {

    Set<String> stringSet = new HashSet<>();
    Set<String> linkedStringSet = new LinkedHashSet<>();
    TreeSet<String> treeStringSet = new TreeSet<>();

    public void addToHashSet(String element) {
        stringSet.add(element);
    }

    public void addToTreeSet(String element) {
        treeStringSet.add(element);
    }

    public void addToLinkedHashSet(String element) {
        linkedStringSet.add(element);
    }

    public void iteratorHashSet() {
        Iterator iterator = stringSet.iterator();
        System.out.println("Элементы HashSet:");
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

    }

    public void iteratorTreeSet() {
        Iterator iterator = treeStringSet.iterator();
        System.out.println("Элементы TreeSet:");
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

    }

    public void iteratorLinkedHashSet() {
        Iterator iterator = linkedStringSet.iterator();
        System.out.println("Элементы LinkedHashSet:");
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

    }

    public void removeToHashSet(String element) {
        stringSet.remove(element);
    }

    public void removeToTreeSet(String element) {
        treeStringSet.remove(element);
    }

    public void removeToLinkedHashSet(String element) {
        linkedStringSet.remove(element);
    }

    public void clearAllToHashSet() {
        stringSet.clear();
    }

    public void clearAllToTreeMap() {
        treeStringSet.clear();
    }

    public void clearAllToLinkedHashSet() {
        linkedStringSet.clear();
    }

    public void isHashSetEmptyOrNot() {
        if (stringSet.isEmpty()) {
            System.out.println("HashSet пустой");
        } else {
            System.out.println("HashSet не пустой");
        }
    }

    public void isTreeSetEmptyOrNot() {
        if (stringSet.isEmpty()) {
            System.out.println("TreeSet пустой");
        } else {
            System.out.println("TreeSet не пустой");
        }
    }

    public void isLinkedHashSetEmptyOrNot() {
        if (linkedStringSet.isEmpty()) {
            System.out.println("TreeSet пустой");
        } else {
            System.out.println("TreeSet не пустой");
        }
    }

    public void containsInHashSet(String element) {
        boolean word = stringSet.contains(element);
        if (word) {
            System.out.println("Элемент есть в HashSet");
        } else {
            System.out.println("Элемента нет в HashSet");
        }
    }

    public void containsInTreeSet(String element) {
        boolean word = treeStringSet.contains(element);
        if (word) {
            System.out.println("Элемент есть в TreeSett");
        } else {
            System.out.println("Элемента нет в TreeSet");
        }
    }

    public void containsInLinkedHashSet(String element) {
        boolean word = linkedStringSet.contains(element);
        if (word) {
            System.out.println("Элемент есть в HashSet");
        } else {
            System.out.println("Элемента нет в HashSet");
        }
    }

    public void getFirstElementInTreeSet() {
        System.out.println("Первый элемент в TreeSet: " + treeStringSet.first());
    }

    public void getLastElementInTreeSet() {
        System.out.println("Последний элемент в TreeSet: " + treeStringSet.last());
    }

    public void sizeTreeSet() {
        System.out.println("Размер TreeSet составляет: " + treeStringSet.size());
    }

    public void subSet(String el1, String el2) {
        System.out.println("Элементы входящие в промежуток от " + el1 + " до " + el2 + ": " + treeStringSet.subSet(el1, el2));
    }

}
