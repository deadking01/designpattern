package concretecommand;

import command.Command;
import receiver.Television;

/**
 * Created by wuqf on 16-2-20.
 */
public class CloseTVCommand implements Command {
    Television tv;
    public CloseTVCommand(Television tv)
    {
        this.tv=tv;
    }
    public void excute() {
        tv.close();
    }
}
