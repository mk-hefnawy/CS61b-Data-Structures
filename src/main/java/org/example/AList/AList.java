package org.example.AList;

public class AList {
    private int[] list;
    private int size;

    public AList() {
        list = new int[5]; // starting size
        size = 0;
    }

    public int getLast() {
        return list[size - 1];
    }

    public int getFirst() {
        return list[0];
    }

    public void addLast(int item) {
        if (size == list.length) {
            System.out.println("Resizing the array from " + size + " to " + (size + 1));
            int[] temp = new int[size + 1];
            System.arraycopy(list, 0, temp, 0, list.length);
            list = temp;
        }
        list[size] = item;
        size++;

    }

    public int get(int index) {
        return list[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int removeLast() {
        list[size] = 0; // yeah, won't hurt, but unnecessary
        return list[--size];
    }
}
