import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
/**
 * This class creates the buttons used to control the game.
 * 
 * @author Carl Morey
 * @version 5.0 21/12/2011
 */

class SButton extends JButton   //create a JButton with some fixed properties
{
	private static final long serialVersionUID = 1L;
	Color DB = new Color(0x1E,0x90, 0xFF);
   Color LB = new Color(0xAD,0xD8, 0xE6);  //Light Blue background
    public SButton(String action, String command) 
    {
       super(action);  //construct button
       this.setBackground(LB);
       this.setForeground(DB);
       this.setBorder(BorderFactory.createBevelBorder(0, DB, DB));       
       this.setActionCommand(command);        
    }//end of constructor     
    public Dimension getPreferredSize() 
    {
        return new Dimension(130,30);  //nice size button
    }//end of get dimension    
}//end of SButton

