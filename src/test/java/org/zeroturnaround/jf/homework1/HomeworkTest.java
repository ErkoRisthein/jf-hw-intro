package org.zeroturnaround.jf.homework1;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HomeworkTest {

  private Homework homework = new Homework();

  @Test
  public void testReverse() {
    assertEquals("Input", homework.reverse("tupnI"));
  }

  @Test
  public void returnsEmptyStringWhenBothInputsAreNull() {
    assertCommonSuffixOf(null, null, is(""));
  }

  @Test
  public void returnsEmptyStringWhenFirstInputIsNull() {
    assertCommonSuffixOf(null, "abc", is(""));
  }

  @Test
  public void returnsEmptyStringWhenSecondInputIsNull() {
    assertCommonSuffixOf("abc", null, is(""));
  }

  @Test
  public void returnsEmptyStringWhenFirstInputIsAnEmptyString() {
    assertCommonSuffixOf("", "abc", is(""));
  }

  @Test
  public void returnsEmptyStringWhenSecondInputIsAnEmptyString() {
    assertCommonSuffixOf("abc", "", is(""));
  }

  @Test
  public void returnsEmptyStringWhenInputsAreDifferent() {
    assertCommonSuffixOf("a", "b", is(""));
  }

  @Test
  public void returnsStringWhenInputsAreEqual() {
    assertCommonSuffixOf("a", "a", is("a"));
  }

  @Test
  public void returnsCommonSuffix() {
    assertCommonSuffixOf("ac", "bc", is("c"));
  }

  @Test
  public void testGetCommonSuffix() {
    assertCommonSuffixOf("AmazingJavaFundamentals", "ILoveJavaFundamentals", is("JavaFundamentals"));
  }

  private void assertCommonSuffixOf(String first, String second, Matcher<String> matcher) {
    assertThat(homework.getCommonSuffix(first, second), matcher);
  }
}
