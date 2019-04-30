import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Multiplier {
  public List<Integer> multiply(Integer number) {
    List<Integer> multiNumbers = asList(2, 3, 4, 5, 6);
    return multiNumbers.stream()
                       .map(e -> number * e)
                       .collect(Collectors.toList());
  }
}