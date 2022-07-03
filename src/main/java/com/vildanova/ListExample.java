package com.vildanova;


import java.util.ArrayList;
import java.util.List;

public class ListExample {

    ArrayList<String> objects1 = new ArrayList<>();
    ArrayList<String> objects2 = new ArrayList<>();


    public void addObjectToEnd(String object, String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())){
            objects1.add(object);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            objects2.add(object);
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }

    public void addObjectToIndex(int index, String object, String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            objects1.add(index, object);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            objects2.add(index, object);
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }

    public void getValueOfIndex(int index, String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            String word = objects1.get(index);
            System.out.println(word);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            String word = objects2.get(index);
            System.out.println(word);
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }

    public void editObjectToIndex(String object, int index, String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            objects1.set(index, object);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            objects2.set(index, object);
        }
        else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }


    public void deleteObjectToIndex(int index, String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            objects1.remove(index);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            objects2.remove(index);
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }

    public void getObjects(String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            for (int i = 0; i < objects1.size(); i++) {
                System.out.println(i + " - " + objects1.get(i));
            }
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            for (int i = 0; i < objects2.size(); i++) {
                System.out.println(i + " - " + objects2.get(i));
            }
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }

    public void addCollectionToCollectionToEnd(String nameCollectionReceiver, String nameCollectionGiver) {
        if (nameCollectionReceiver.equals(ObjectNameOfEnum.OBJECT1.getNameObject()) &&
                nameCollectionGiver.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            objects1.addAll(objects2);
        }
        if (nameCollectionReceiver.equals(ObjectNameOfEnum.OBJECT2.getNameObject()) &&
                nameCollectionGiver.equals(ObjectNameOfEnum.OBJECT1.getNameObject())) {
            objects2.addAll(objects1);
        } else {
            System.out.println("Название листов не найдено!");
        }
    }

    public void printArrayList(String nameList) {
        if (nameList.equals(ObjectNameOfEnum.OBJECT1.getNameObject())){
            System.out.println(objects1);
        }
        if (nameList.equals(ObjectNameOfEnum.OBJECT2.getNameObject())) {
            System.out.println(objects2);
        } else if((!nameList.contains(ObjectNameOfEnum.OBJECT1.getNameObject())) &&
                (!nameList.contains(ObjectNameOfEnum.OBJECT2.getNameObject()))){
            System.out.println("Название листа " + nameList + " не найдено!");
        }
    }
}
