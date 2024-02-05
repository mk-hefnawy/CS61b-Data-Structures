package org.example.ArrayMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ArrayMapWithTwoArrays<KeyType, ValueType> {
    private int size;
    private KeyType[] keys;
    private ValueType[] values;


    public ArrayMapWithTwoArrays() {
        keys = (KeyType[]) new Object[10];
        values = (ValueType[]) new Object[10];
    }

    public int size() {
        return size;
    }

    private int getKeyIndex(KeyType key){
        for (int i = 0; i < size ; i++){
            if (keys[i].equals(key)) return i;
        }
        return -1;
    }
    public void put(KeyType key, ValueType value) {
        int keyIndex = getKeyIndex(key);
        if (keyIndex > -1) {
            values[keyIndex] = value;
        }else {
            keys[size] = key;
            values[size] = value;
            size++;
        }
    }

    public ValueType get(KeyType key) {
        int keyIndex = getKeyIndex(key);
        if (keyIndex > -1) return values[keyIndex];
        return null;
    }

    public boolean contains(KeyType key) {
        int keyIndex = getKeyIndex(key);
        return keyIndex > -1;
    }

    public List<KeyType> keys(){
        // return List.of(keys); // cannot do that because we only need elements till "size"
        List<KeyType> theKeys = new LinkedList<>();
        for (int i = 0; i < size ; i++){
            theKeys.add(keys[i]);
        }
        return theKeys;
    }


}
