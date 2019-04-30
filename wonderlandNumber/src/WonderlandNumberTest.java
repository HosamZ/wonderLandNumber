import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WonderlandNumberTest {
  private WonderlandNumber wonderlandNumber = new WonderlandNumber();
  @ParameterizedTest
  @CsvSource({
      "124666, ",
      " , "
  })
  void findGeneratedWonderlandNumber() {

    Integer generatedWonderlandNumber = wonderlandNumber.findGeneratedWonderlandNumber();

  }
}