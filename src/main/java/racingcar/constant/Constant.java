package racingcar.constant;

public interface Constant {

    String SPACE = " ";
    String LINE = "\n";
    int MAX_INT_VALUE = 2_147_483_647; // RoundCount 최대 개수
    int MIN_INT_VALUE = 1; // RoundCount 최소 개수

    /**
     * 자동차 이름을 구분하는 주요 구분자이다.
     * 아래 상수를 바꿀 경우, 자동차 이름을 구분하는 구분자가 모두 변경됨
     * ex) ',' 를 ':' 로 바꾸는경우 (메인 구분자를 바꿀 경우 이름도 바꿔야 할 듯, 또는 MAIN_DELIMITER 로 상수명을 바꿔도 될 듯)
     * "pobi,woni" -> "pobi:woni"
     */
    String COMMA_DELIMITER = ",";
    String COMMA_REGEX_DELIMITER= ",";
    String CONSECUTIVE_COMMA_DELIMITER = ",,";
    String KOREAN_COMMA_BRACKET_DELIMITER = "콤마(',')";
}
