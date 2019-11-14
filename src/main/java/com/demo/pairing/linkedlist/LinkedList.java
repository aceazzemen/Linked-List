package com.demo.pairing.linkedlist;

import lombok.*;
import java.util.Iterator;

@NoArgsConstructor
public class LinkedList<T> {
    @Getter
    private Node<T> head;

    public boolean isEmpty() {
        // TODO starting point
        return false;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private static class Node<T> {
        @Getter
        private T value;
        @Getter
        @Setter
        private Node<T> next;

        Node(T value) {
            this(value, null);
        }

        Node(T value, Node<T> next) {
            this.value = value;
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
