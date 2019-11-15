package com.demo.pairing.linkedlist;

import java.util.Iterator;

public class LinkedList<T> {
    private Node<T> head;

    public boolean isEmpty() {
        // TODO starting point
        return false;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private static class Node<T> {
        private T value;

        private Node<T> next;

        Node(T value) {
            this(value, null);
        }

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    // TODO implementation
    private class LinkedListIterator implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
