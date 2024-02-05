package org.example.ArraySet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"unchecked"})
public class ArraySet<ItemType> implements Iterable<ItemType>{
    private int size = 0;
    private ItemType[] items = (ItemType[]) new Object[10];

    public int size() {
        return size;
    }

    public void add(ItemType item) {
        if (item == null) throw new IllegalArgumentException("Cannot add nulls");
        if (contains(item)) return;
        items[size] = item;
        size++;
    }

    public boolean contains(ItemType item) {
        if (item == null) throw new IllegalArgumentException("Cannot search for nulls");

        for (int i = 0; i < size; i++) {
            if (item.equals(items[i])) {
                return true;
            }
        }

        return false;
    }

    public Iterator<ItemType> iterator(){
        return new Iterator<ItemType>() {
            private int iteratorPosition = 0;

            @Override
            public boolean hasNext() {
                return iteratorPosition < size;
            }

            @Override
            public ItemType next() {
                ItemType itemToBeReturned = items[iteratorPosition];
                iteratorPosition ++;
                return itemToBeReturned;
            }
        };
    }

    public static <Different> ArraySet<Different> of(Different... items){
        ArraySet<Different> returnSet = new ArraySet<>();
        for (Different item : items){
            returnSet.add(item);
        }

        return returnSet;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        int i;
        for (i = 0; i < size - 1 ; i++){
            stringBuilder.append(items[i]);
            stringBuilder.append(",");
        }

        if(items[i] != null)  stringBuilder.append(items[i]);

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; // for optimization

        if (obj instanceof ArraySet casted){

            for(ItemType item : this){
                if (!casted.contains(item)) return false;
            }

            return true;
        }
        return false;
    }
}
