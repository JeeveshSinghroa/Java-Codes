import java.awt.*;
import java.applet.*;
/**
 *
 * @author Jeevesh
 */
public class Applett extends Applet{
    @Override
    public void paint(Graphics g)
    {
        g.drawLine(10,10,50,50);
        g.drawRect(10,60,40,30);
        g.fillRect(60, 10, 30, 80);
        g.drawOval(10, 10, 10, 10);
    }
}
//<Applet code = "Applett.java" width=200 height=500>
//</Applet>f