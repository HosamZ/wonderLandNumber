import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Stream.of;

public class Validator {
  private Multiplier multiplier = new Multiplier();

  public boolean validate(Integer number) {
    List<Integer> multiply = multiplier.multiply(number);

    String string = sorted(number);
    return multiply.stream()
                   .map(this::sorted)
                   .allMatch(string::equals);
  }

  private String sorted(Integer multiplyBy3) {
    return of(multiplyBy3)
        .map(Object::toString)
        .flatMap(e -> of(e.split("")))
        .sorted()
        .collect(Collectors.joining());
  }
}