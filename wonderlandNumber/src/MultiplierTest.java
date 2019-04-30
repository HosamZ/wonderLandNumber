import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplierTest {
  private Multiplier multiplier = new Multiplier();

  @ParameterizedTest
  @CsvSource({
      "10 , 20 30 40 50 60",
      "0,0 0 0 0 0 ",
      "1,2 3 4 5 6"
  })
  void testMultiplier(Integer number, String values) {
    List<Integer> expected = Stream.of(values.split(" "))
                                   .map(Integer::valueOf)
                                   .collect(Collectors.toList());
    List<Integer> actual = multiplier.multiply(number);

    assertEquals(expected, actual);
  }
}