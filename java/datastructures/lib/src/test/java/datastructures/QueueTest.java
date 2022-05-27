package datastructures;

import datastructures.queue.Queue;
import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  @Test
  void isEmptyReturnsTrue() {
    Queue<Integer> sut = new Queue<>();
    assertTrue(sut.isEmpty());
  }

  @Test
  void enqueueAddsNodeToEnd() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    assertEquals("[5]->NULL", sut.toString());
  }

  @Test
  void enqueueMultipleNodesInQueue() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    sut.enqueue(4);
    assertEquals("[5]->[4]->NULL", sut.toString());
  }

  @Test
  void dequeueReturnsValueAndRemovesFrontNode() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    assertEquals(5, sut.dequeue());
    assertEquals("NULL",sut.toString());
  }

  @Test
  void dequeueRemovesMultipleNodes() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    sut.enqueue(4);
    sut.dequeue();
    sut.dequeue();
    assertTrue(sut.isEmpty());
  }

  @Test
  void peekReturnsFrontValueWithoutRemovingNode() {
    Queue<Integer> sut = new Queue<>();
    sut.enqueue(5);
    assertEquals(5, sut.peek());
    assertEquals("[5]->NULL", sut.toString());
  }

  @Test
  void peekOnEmptyStackThrowsException() {
    Queue<Integer> sut = new Queue<>();
    assertThrows(NoSuchElementException.class, sut::peek);
  }
}
