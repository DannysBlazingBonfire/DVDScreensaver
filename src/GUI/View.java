package GUI;

import javax.swing.*;
import java.awt.*;

public class View
{
    //components
    private JFrame frame;
    private JPanel mainP;
    private Dimension screenDim;
    private Dimension frameDim;
    //width 512, height 261
    private ImageIcon dvdIcon = new ImageIcon("assets/DVD.png");
    private JLabel icon;

    public View()
    {
    startGui();
    }

    public void startGui()
    {
        //screen dimensions
        screenDim = Toolkit.getDefaultToolkit().getScreenSize();
        frameDim = new Dimension(520,270);
        //frame
        frame = new JFrame();
        frame.setTitle("DVD_Screensaver");
        frame.setLayout(null);
        frame.setSize(frameDim);
        frame.setLocation( ((screenDim.width/2)-(frame.getWidth()/2)) , ((screenDim.height/2)-(500/2)) );
        frame.setVisible(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainP = new JPanel();
        mainP.setSize(frameDim);
        mainP.setBackground(Color.white);
        mainP.setVisible(true);

        icon = new JLabel();
        icon.setIcon(dvdIcon);
        icon.setSize(dvdIcon.getIconWidth(),dvdIcon.getIconHeight());
        icon.setLocation(0,0);
        icon.setVisible(true);

        mainP.add(icon);
        frame.add(mainP);
    }
    public JFrame getFrame()
    {
        return frame;
    }
    public void setFrame(JFrame frame)
    {
        this.frame = frame;
    }
    public Dimension getFrameDim()
    {
        return frameDim;
    }
    public Dimension getScreenDim()
    {
        return screenDim;
    }
}
