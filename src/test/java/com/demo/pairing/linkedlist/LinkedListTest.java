package com.demo.pairing.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void givenEmptyListWhenCheckingEmptyThenTrue(){
        Assertions.assertTrue(new LinkedList().isEmpty());
    }
}
