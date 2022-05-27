package datastructures;

import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  @Test
  void isEmptyReturnsTrue() {
    Stack<Integer> sut = new Stack<>();
    assertTrue(sut.isEmpty());
  }

  @Test
  void pushAddsNodeToTopOfStack() {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    assertEquals("[5]->NULL", sut.toString());
  }

  @Test
  void pushMultipleNodesInStack() {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    sut.push(4);
    assertEquals("[4]->[5]->NULL", sut.toString());
  }

  @Test
  void popReturnsTopValueAndRemovesTopNode() {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    assertEquals(5,sut.pop());
    assertEquals("NULL", sut.toString());
  }

  @Test
  void popMultipleNodesOffStack() {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    sut.push(4);
    sut.pop();
    sut.pop();
    assertTrue(sut.isEmpty());
  }

  @Test
  void peekReturnsTopValueWithoutRemovingNode() {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    assertEquals(5,sut.peek());
    assertEquals("[5]->NULL", sut.toString());
  }

  @Test
  void peekOnEmptyStackThrowsException() {
    Stack<Integer> sut = new Stack<>();
    assertThrows(NoSuchElementException.class, sut::peek);
  }
}
