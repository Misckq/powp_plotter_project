package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {
    private int x;
    private int y;

    public CommandSetPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter ip) {
        ip.setPosition(x, y);
    }
    
}
