package wonderlandnumbergenerator.finder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WonderlandNumberFinderTest {
  private WonderlandNumberFinder wonderlandNumberFinder = new WonderlandNumberFinder();

  @Test
  void test() {
    Integer expected = 142857;

    Integer actual = wonderlandNumberFinder.findGeneratedWonderlandNumber();

    assertEquals(expected, actual);
  }
}