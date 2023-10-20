package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private static final String EXCEPTION_MESSAGE = "숫자는 중복되지 않고, 1에서 9까지의 세 자리여야 합니다.";
	private List<Integer> playerNumber = new ArrayList<>();
	private Pattern pattern = Pattern.compile("^(?!.*(.).*\\1)[1-9]{3}$");
	public Player() {
	}

	private void isValidNumber(String number) {
		Matcher matcher = pattern.matcher(number);
		if (!matcher.matches()) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
	}
}