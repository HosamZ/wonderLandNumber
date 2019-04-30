package wonderlandnumbergenerator.finder;

import wonderlandnumbergenerator.validator.Validator;

import static java.util.stream.IntStream.rangeClosed;

public class WonderlandNumberFinder {

  public static final int FIRST_WONDERLAND_CANDIDATE_NUMBER = 100000;
  public static final int LAST_WONDERLAND_CANDIDATE_NUMBER = 166666;
  private Validator validator = new Validator();

  public Integer findGeneratedWonderlandNumber() {
    return rangeClosed(FIRST_WONDERLAND_CANDIDATE_NUMBER, LAST_WONDERLAND_CANDIDATE_NUMBER)
        .filter(validator::validate)
        .findAny()
        .orElseThrow();
  }
}