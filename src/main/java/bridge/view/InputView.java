package bridge.view;

import static bridge.utils.ViewMessage.*;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readBridgeSize() {
        System.out.println(INPUT_BRIDGE_SIZE);
        return Console.readLine()
                .trim();
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}