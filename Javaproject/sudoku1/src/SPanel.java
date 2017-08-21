


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
/**
 * This class creates the panels used for the border on the main window.
 * 
 * @author Carl Morey
 * @version 5.0 21/12/2011
 */
public class SPanel extends Panel   //create border panels for the display
{
	private static final long serialVersionUID = 1L;
	Color LB = new Color(0xAD,0xD8, 0xE6);  //Light Blue background 	
    public SPanel(Dimension set) 
    {
       super();  //construct the panel
       this.setBackground(LB);
       this.setPreferredSize(set);
    }//end of constructor
}//end of SPane

