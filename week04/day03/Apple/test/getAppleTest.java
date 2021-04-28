import static org.junit.jupiter.api.Assertions.*;

import com.zoli.week04.day03.Apple.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class getAppleTest {

  private Apple apple;

  @BeforeEach
  void setUpEach(){
    apple = new Apple();
  }

  @Test
  void testValidInput(){
    String expected = "apple";
    String actual = apple.getApple();
    assertEquals(expected, actual);
  }

  @Test
  void testInvalidInput(){
    String expected = "apple";
    String actual = apple.getApple();
    assertEquals(expected, actual);
  }

  @Test
  void testNotValidInput(){
    String expected = "peach";
    String actual = apple.getApple();
    assertNotEquals(expected, actual);
  }

}