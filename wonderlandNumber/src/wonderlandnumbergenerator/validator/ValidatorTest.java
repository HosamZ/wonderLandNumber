package wonderlandnumbergenerator.validator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidatorTest {
  private Validator validator = new Validator();

  @ParameterizedTest
  @CsvSource({
      "142857, true",
      "1428577, false"
  })
  void testValidate(Integer number, boolean expected) {
    boolean actual = validator.validate(number);

    assertEquals(expected, actual);
  }
}