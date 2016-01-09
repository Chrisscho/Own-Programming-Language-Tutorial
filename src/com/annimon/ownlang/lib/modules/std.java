package com.annimon.ownlang.lib.modules;

import com.annimon.ownlang.lib.*;
import com.annimon.ownlang.lib.modules.functions.*;

/**
 *
 * @author aNNiMON
 */
public final class std implements Module {

    @Override
    public void init() {
        Functions.set("echo", new std_echo());
        Functions.set("foreach", new std_foreach());
        Functions.set("newarray", new std_newarray());
        Functions.set("rand", new std_rand());
        Functions.set("sleep", new std_sleep());
        Functions.set("thread", new std_thread());
    }
}