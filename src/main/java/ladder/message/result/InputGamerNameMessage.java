package ladder.message.result;

import ladder.core.message.Message;

public class InputGamerNameMessage extends Message {
    @Override
    public boolean isInputGamerNameStep() {
        return true;
    }
}