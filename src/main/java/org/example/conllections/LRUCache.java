package org.example.conllections;

public interface LRUCache<K, V> {

    void put(K k, V v);

    V get(K k);

    boolean contains(K k);

    int getSize();

    int getCapacity();
}
