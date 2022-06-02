package brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsTest {
  @Test
  void validateBracketsReturnsTrueTestCase1() {
    Brackets sut = new Brackets();
    assertTrue(sut.validateBrackets("()[[Extra Characters]]"));
  }

  @Test
  void validateBracketsReturnsTrueTestCase2() {
    Brackets sut = new Brackets();
    assertTrue(sut.validateBrackets("{}(){}"));
  }

  @Test
  void validateBracketsReturnsTrueTestCase3() {
    Brackets sut = new Brackets();
    assertTrue(sut.validateBrackets("(){}[[]]"));
  }

  @Test
  void validateBracketsReturnsFalseTestCase1() {
    Brackets sut = new Brackets();
    assertFalse(sut.validateBrackets("[({}]"));
  }

  @Test
  void validateBracketsReturnsFalseTestCase2() {
    Brackets sut = new Brackets();
    assertFalse(sut.validateBrackets("(]("));
  }

  @Test
  void validateBracketsReturnsFalseTestCase3() {
    Brackets sut = new Brackets();
    assertFalse(sut.validateBrackets("{"));
  }


}
