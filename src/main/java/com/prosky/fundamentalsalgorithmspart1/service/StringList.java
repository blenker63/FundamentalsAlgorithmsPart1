package com.prosky.fundamentalsalgorithmspart1.service;

public class StringList implements StringListService {

    private String[] stringList = new String[5];
//    private String[] otherList = new String[5];
    private int size = 0;
    public int index = 0;
//    public int index;
    public String removeItem;

    @Override
    public String add(String item) {
        if (size < stringList.length) {
            stringList[index] = item;
            size++;
            index++;
            return stringList[index];
        } else {
            throw new ArrayIndexOutBondsException("Массив переполнен");
        }
//    return add(index, item);
    }

    @Override
    public String add(int index, String item) {
//        if (size >= (stringList.length) || index >= stringList.length - 1) {
        if (index > size || index >= stringList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы количества элементов или массива.");
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
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы количества элементов или массива.");
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
                for (int j = i; j < stringList.length-1; j++) {
                    stringList[j] = stringList[i + 1];
            }
        }
        return removeItem;
    }

    @Override
    public String remove(int index) {
        if (index > stringList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы массива");
        }
        if (stringList[index] == null) {
            throw new ElementMissingException("Элемент отсутствует");
        } else {
            removeItem = stringList[index];
            stringList[index] = null;
            size--;
        }
        for (int i = index; i < stringList.length-1; i++) {
            stringList[i] = stringList[index+ 1];
        }

        return removeItem;
    }

    @Override
    public boolean contains(String item) {
        boolean containsItem = false;
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i] == item) {
                containsItem = true;
            }
        }
        return containsItem;
    }

    @Override
    public int indexOf(String item) {
        int indexOf = -1;
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i] == item) {
                indexOf = i;
            }
        }
        return indexOf;

    }

    @Override
    public int lastIndexOf(String item) {
        int LastIndexOf = -1;
        for (int i = stringList.length - 1; i >= 0; i--) {
            if (stringList[i] == item) {
                LastIndexOf = i;
                break;
            }
        }
        return LastIndexOf;

    }

    @Override
    public String get(int index) {
        String getItem = null;
        if (index > stringList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы массива");
        }
        getItem = stringList[index];
        return getItem;
    }

    @Override
    public boolean equals(StringList otherList) {
//        String[] otherList = new String[];
//        boolean equalsItem = true;
//        for (int i = 0; i < stringList.length; i++) {
//            for (int j = 0; j < stringList.length; j++) {
//                if (stringList[i] != otherList[j]) {
//                  equalsItem = false;
//                }
//
//            }
//        }

//        return equalsItem;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i] == null) {
                isEmpty = false;
                break;
            }
        }
            return isEmpty;
    }

    @Override
    public Object clear() {
        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = null;
        }
        return null;
    }

    @Override
    public String[] toArray() {
        int n = stringList.length;
        String[] toArray = new String[n];
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i] != null) {
                toArray[i] = stringList[i];
            } else {
                toArray[i] = null;
            }
        }
        return new String[n];
    }

}
