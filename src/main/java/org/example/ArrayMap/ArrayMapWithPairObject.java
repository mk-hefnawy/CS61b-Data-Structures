package org.example.ArrayMap;

@SuppressWarnings("unchecked")
public class ArrayMapWithPairObject<KeyType, ValueType> {
    private int size;
    private ArrayMapPair<KeyType, ValueType>[] items;

    public ArrayMapWithPairObject() {
        items = (ArrayMapPair<KeyType, ValueType>[]) new ArrayMapPair[10];
    }

    public int size() {
        return size;
    }

    public void put(KeyType key, ValueType value) {
        if (!contains(key)) {
            items[size] = new ArrayMapPair<>(key, value);
            size++;
        }
    }

    public ValueType get(KeyType key) {
        for (int i = 0; i < size ; i++){
            ArrayMapPair<KeyType, ValueType> pair =
                    new ArrayMapPair<>(items[i].getKey(), items[i].getValue());
            if (pair.getKey().equals(key)) return pair.getValue();
        }

        return null;
    }

    public boolean contains(KeyType key) {
        for (int i = 0; i < size; i++) {
            if (items[i].getKey().equals(key)) return true;
        }
        return false;
    }

    private static class ArrayMapPair<K, V> {
        private K key;
        private V value;

        public ArrayMapPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
