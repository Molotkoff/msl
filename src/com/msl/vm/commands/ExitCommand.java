package com.msl.vm.commands;

public class ExitCommand implements Command {

    @Override
    public void Execute() {
        System.exit(0);
    }
}
