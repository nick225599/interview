package org.example.conllections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map<K, V> {
    Node<K, V>[] table;
    ;

    public MyHashMap() {
        table = new Node[16];
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V get(Object key) {
        int hash = key.hashCode();
        if (hash < 0) {
            hash = -hash;
        }
        int index = hash % table.length;
        Node<K, V> node = table[index];
        if (null == node) {
            return null;
        }
        boolean found = false;
        V value = null;
        do {
            if (node.getKey().equals(key)) {
                found = true;
                value = node.value;
            } else {
                node = node.next;
            }

        } while (!found && null != node);
        return value;
    }

    @Override
    public V put(K key, V value) {
        int hash = key.hashCode();
        if (hash < 0) {
            hash = -hash;
        }
        int size = table.length;
        int index = hash % size;
        Node<K, V> node = table[index];
        if (null == node) {
            node = new Node<>(key, value);
            table[index] = node;

        } else {
            if (node.getKey().equals(key)) {
                node.setValue(value);
            } else {
                Node<K, V> preNode = null;
                while (node != null){
                    if(node.getKey().equals(key)){
                        node.value = value;
                        return value;
                    }
                    preNode = node;
                    node = node.next;
                }
                preNode.next = new Node<>(key, value);
                return value;

            }
        }
        return value;
    }

    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    class Node<K, V> {
        K key;
        V value;
        int hashCodeOfKey;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hashCodeOfKey = key.hashCode();
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {


    }

}
