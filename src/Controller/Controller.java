package Controller;

import GUI.View;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Controller
{
    private ArrayList<FrameAnimator> frameBuffer;
    private int frameAmount = 5;

    public Controller() throws InterruptedException
    {
        frameBuffer = new ArrayList<FrameAnimator>();
        int i = 0;
        while(i<frameAmount)
        {
            frameBuffer.add(new FrameAnimator(new View()));
            i++;
        }
        for(FrameAnimator frameAnimator : frameBuffer)
        {
            frameAnimator.startAnimation();
        }
    }
}
