package wonderlandnumbergenerator.validator;

import wonderlandnumbergenerator.multiplier.Multiplier;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Stream.of;

public class Validator {
  private Multiplier multiplier = new Multiplier();

  public boolean validate(Integer candidateNumber) {
    List<Integer> multiply = multiplier.multiply(candidateNumber);

    String naturalOrderSortedCandidate = sorted(candidateNumber);
    return multiply.stream()
                   .map(this::sorted)
                   .allMatch(naturalOrderSortedCandidate::equals);
  }

  private String sorted(Integer number) {
    return of(number)
        .map(Object::toString)
        .flatMap(e -> of(e.split("")))
        .sorted()
        .collect(Collectors.joining());
  }
}