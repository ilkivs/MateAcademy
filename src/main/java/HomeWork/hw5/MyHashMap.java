package main.java.HomeWork.hw5;

import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private Node<K, V>[] nodes;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;

    public MyHashMap() {
        nodes = new Node[DEFAULT_CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        int hashCode = getHashCode(key);
        int position = getPosition(hashCode);
        Node<K, V> newNode = new Node<>(hashCode, key, value, null);
        if (nodes[position] == null) {
            nodes[position] = newNode;
            size++;
        } else {
            Node<K, V> currentNode = nodes[position];
            while (currentNode != null) {
                if (currentNode.key == newNode.key) {
                    currentNode.value = newNode.value;
                    break;
                }
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    size++;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    @Override
    public V get(K key) {
        int hashCode = getHashCode(key);
        int position = getPosition(hashCode);
        if (nodes[position] == null) {
            return null;
        }
        Node<K, V> currentNode = nodes[position];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int hashCode = getHashCode(key);
        int position = getPosition(hashCode);
        if (nodes[position] == null) {
            return null;
        }
        Node<K, V> currentNode = nodes[position];
        if (currentNode.key == key) {
            if (currentNode.next != null) {
                nodes[position] = currentNode.next;
            } else {
                nodes[position] = null;
            }
            size--;
            return currentNode.value;
        } else {
            while (currentNode.next != null) {
                if (currentNode.next.key == key) {
                    V value = currentNode.next.value;
                    currentNode.next = currentNode.next.next;
                    size--;
                    return value;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private int getHashCode(K key) {
        return Objects.hashCode(key);
//        return 2;
    }

    private int getPosition(int hashCode) {
        return Math.abs(hashCode) % nodes.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyHashMap {nodes = ");
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null) {
                sb.append("\n[").append(i).append("] : ").append(nodes[i]);
            }
        }
        sb.append("\nsize=").append(size()).append("}");
        return sb.toString();
    }

    class Node<K, V> {
        private int hashCode;
        private K key;
        private V value;
        private Node<K, V> next;

        Node(int hasCode, K key, V value, Node<K, V> next) {
            this.hashCode = hasCode;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node {hashCode=" + hashCode +
                    ", key=" + key +
                    ", value=" + value +
                    ", next=" + next + '}';
        }
    }
}
