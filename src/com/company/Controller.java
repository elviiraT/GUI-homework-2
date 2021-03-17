package com.company;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Controller
{
    public Controller()
    {
        view = new View(this);
        state = 0;

        timer = new Timer (100, (ActionEvent e) -> {state = state+1; view.ShowLabel();});
        timer.start();
    }
    public int GetState() { return state;}

    private View view;
    private int state;
    private Timer timer;
}
