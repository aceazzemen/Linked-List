package com.demo.pairing.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@NoArgsConstructor
public class LinkedList<T> {
    @Getter
    private Node<T> head;

    public boolean isEmpty() {
        // TODO starting point
        Arrays.asList("A", "B");
        return false;
    }

    // TODO implementation
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    @AllArgsConstructor
    private static class Node<T> {
        @Getter
        private T value;
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
