import static java.util.stream.IntStream.rangeClosed;

public class WonderlandNumber {

  public static final int START_FROM = 100000;
  public static final int ENDS_BEFORE = 166666;
  private Validator validator = new Validator();

  public Integer findGeneratedWonderlandNumber() {
    return rangeClosed(START_FROM, ENDS_BEFORE)
        .takeWhile(validator::validate)
        .findAny().orElseThrow();
  }
}