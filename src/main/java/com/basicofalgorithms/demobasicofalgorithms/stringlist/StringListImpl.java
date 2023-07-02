package com.basicofalgorithms.demobasicofalgorithms.stringlist;

import java.util.Arrays;

public class StringListImpl implements StringList {

    private final String[] strings;
    private int size;

    //constructor

    public StringListImpl() {
        strings = new String[5];
    }

    public StringListImpl(int firstSize) {
        this.strings = new String[firstSize];
    }

    //exceptions if value = null

    private void valueItem(String item) {
        if (item == null) {
            throw new ItemValueNullException();
        }
    }

    private void valueSize() {
        if (size == strings.length) {
            throw new SizeValueNullException();
        }
    }

    private void valueIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexValueNullException();
        }
    }

    //hepls methods


    @Override
    public String[] toArray() {
        return Arrays.copyOf(strings, size);
    }

    @Override
    public void clear() {
        Arrays.fill(strings, null);
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }


//functions

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public String add(String item) {
        valueSize();
        valueItem(item);
        strings[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        valueSize();
        valueItem(item);
        valueIndex(index);
        if (index == size) {
            strings[size++] = item;
            return item;
        }
        System.arraycopy(strings, index, strings, index + 1, size - index);
        strings[index] = item;
        size++;
        return item;
    }

    @Override
    public String remove(String item) {
        valueItem(item);
        int index = indexOf(item);
        if (index == -1) {
            throw new IndexOfItemNotFoundException();
        }
        return remove(index);
    }

    @Override
    public String remove(int index) {
        valueIndex(index);
        String item = strings[index];
        if (index != size-1) {
            System.arraycopy(strings, index + 1, strings, index, size - index-1);
        }
        size--;
        return item;
    }

    @Override
    public String get(int index) {
        valueIndex(index);
        return strings[index];
    }

    @Override
    public String set(int index, String item) {
        valueItem(item);
        valueIndex(index);
        strings[index] = item;
        return item;
    }
}
