package racingcar.exception;


import java.util.Arrays;

import static racingcar.constant.Separator.*;

public class CarValidator {

    private static final int MAX_LENGTH = 5;

    private static final String ERROR = "[ERROR] 자동차 이름은 ";
    private static final String ERROR_BLANK = ERROR + "공백을 허용하지 않습니다.";
    private static final String ERROR_MAX_LENGTH = ERROR + "최대 " + MAX_LENGTH + "글자 입니다.";
    private static final String ERROR_COMMA_START = ERROR + KOREAN_BRACKET_SEPARATOR + "로 시작할 수 없습니다.";
    private static final String ERROR_COMMA_END = ERROR  + KOREAN_BRACKET_SEPARATOR + "로 끝날수 없습니다.";
    private static final String ERROR_CONSECUTIVE_COMMA = ERROR + "연속된 " + KOREAN_BRACKET_SEPARATOR + "을 허용하지 않습니다.";

    private CarValidator() {}

    public static void validate(String input) {
        validateCarNamesBlankException(input);
        validateCarNamesLengthGreaterThanFive(input);
        validateCarNamesStartWithCommaException(input);
        validateCarNamesEndWithCommaException(input);
        validateCarNamesConsecutiveCommaException(input);
    }

    private static void validateCarNamesBlankException(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_BLANK);
        }
    }

    private static void validateCarNamesLengthGreaterThanFive(String input) {
        String[] splitList = input.split(REGEX_SEPARATOR);

        Arrays.stream(splitList)
                .filter(carName -> carName.length() > MAX_LENGTH)
                .forEach(carName -> {
                    throw new IllegalArgumentException(ERROR_MAX_LENGTH);
                });
    }

    private static void validateCarNamesStartWithCommaException(String input) {
        if (input.charAt(0) == SEPARATOR) {
            throw new IllegalArgumentException(ERROR_COMMA_START);
        }
    }

    private static void validateCarNamesEndWithCommaException(String input) {
        if (input.charAt(input.length() - 1) == SEPARATOR) {
            throw new IllegalArgumentException(ERROR_COMMA_END);
        }
    }

    private static void validateCarNamesConsecutiveCommaException(String input) {
        if (input.contains(CONSECUTIVE_SEPARATOR)) {
            throw new IllegalArgumentException(ERROR_CONSECUTIVE_COMMA);
        }
    }
}
