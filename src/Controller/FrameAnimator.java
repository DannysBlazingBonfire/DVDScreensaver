package Controller;

import GUI.View;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.Timer;
import java.util.TimerTask;

public class FrameAnimator
{
    private TimerTask timerTask;
    private Timer timer;
    private int xVel;
    private int yVel;
    private int xPos;
    private int yPos;
    private SecureRandom random = new SecureRandom();
    private View view;
    private Dimension screenDim;
    private Dimension frameDim;
    private JFrame frame;

    public FrameAnimator(View view)
    {
        this.view = view;
        screenDim = view.getScreenDim();
        frameDim = view.getFrameDim();
        frame = view.getFrame();

        xVel = 1;
        yVel = 1;
        xPos = random.nextInt(screenDim.width - frameDim.width);
        yPos = random.nextInt(screenDim.height - frameDim.height);

        timerTask = new TimerTask()
        {
            @Override
            public void run()
            {
                moveFrame(frame);
            }
        };
    }

    public void startAnimation()
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(timerTask,0,5);
        frame.setVisible(true);
    }
    public void moveFrame(JFrame frame)
    {
        if( xPos>= screenDim.width - frameDim.width || xPos<=0)
        {
            xVel = xVel * -1;
        }
        if(yPos>= screenDim.height - frameDim.height || yPos<=0)
        {
            yVel = yVel * -1;
        }
        yPos = yPos + yVel;
        xPos = xPos + xVel;
        frame.setLocation(xPos,yPos);
    }
}
