package org.example.conllections;


import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheDemo<K, V> implements LRUCache<K, V> {

    private HashMap<K, V> map;
    private LinkedList<K> list;
    private int capacity;

    public LRUCacheDemo(int capacity) {
        this.map = new HashMap<>(capacity);
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public void put(K k, V v) {
        // 如果超了，删掉最不常用的那个
        if (list.size() >= capacity) {
            K last = list.removeFirst();
            map.remove(last);
        }
        list.add(k);
        map.put(k, v);
    }

    @Override
    public V get(K k) {
        if (map.containsKey(k)) {
            list.remove(k);
            list.add(k);
            return map.get(k);
        } else {
            return null;
        }
    }

    @Override
    public boolean contains(K k) {
        return map.containsKey(k);
    }

    @Override
    public int getSize() {
        return map.size();
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i--){
            K k = list.get(i);
            sb.append(k).append(":").append(map.get(k)).append(", ");
        }
        if(sb.length() > 2){
            sb.delete(sb.length() - 2, sb.length() - 1);
        }
        return sb.toString();
    }
}
