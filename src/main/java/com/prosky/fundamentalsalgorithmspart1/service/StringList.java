package com.prosky.fundamentalsalgorithmspart1.service;

import java.util.Arrays;

public class StringList implements StringListService {

    private String[] stringList = new String[5];
    private int size = 1;
    public int index;
    public String removeItem;

    @Override
    public String add(String item) {
        index = size - 1;
        if (size < stringList.length) {
            stringList[index] = item;
            size++;
            return stringList[index];
        } else {
            throw new EmployeeStoragelsFullException("Массив переполнен");
        }
    }

    @Override
    public String add(int index, String item) {
//        if (size >= (stringList.length) || index >= stringList.length - 1) {
        if (index >= size || index >= stringList.length - 1) {
            throw new EmployeeStoragelsFullException("Индекс выходит за пределы количества элементов или массива.");
        }
        for (int i = stringList.length - 1; i == index; i--) {
            stringList[i] = stringList[i - 1];
        }
        stringList[index] = item;
        size++;
        return stringList[index];
    }

    @Override
    public String set(int index, String item) {
        if (index >= size || index >= stringList.length - 1) {
            throw new EmployeeStoragelsFullException("Индекс выходит за пределы количества элементов или массива.");
        }
        stringList[index] = item;

        return stringList[index];
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < stringList.length - 1; i++) {
            if (stringList[i] == item) {
                removeItem = stringList[i];
                stringList[i] = null;
                size--;
                break;
            }
        }
        return removeItem;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
