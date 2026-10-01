import java.awt.*;
import java.awt.event.*;
 class FrameWindowClose extends Frame implements ActionListener
{
   Button b1;
  TextField tf1;
  FrameWindowClose(String title)
  {
   
   
//Register the Listeners
addWindowListener(new MyWindowAdapter(this)); 
setLayout(new FlowLayout(FlowLayout.LEFT));
b1=new Button("click me");

tf1=new TextField(50);
add(tf1);
add(b1);

b1.addActionListener(this);
tf1.addActionListener(this);
 //set window title using setTitle method
  setTitle(title);  
  setSize(300,300);      
  setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    tf1.setText("click me button pressed");
  }
  public static void main(String args[])
  {
   FrameWindowClose window = new FrameWindowClose("Frme Close Demo");
  }
} // FrameWindowClose class ends
class MyWindowAdapter extends WindowAdapter
{
FrameWindowClose fwc;
MyWindowAdapter(FrameWindowClose fwc)
{
this.fwc = fwc;
}
public void windowClosing(WindowEvent e)
 {
  //hide the window when window's close button is clicked
  fwc.setVisible(false);   
  System.out.println("Frame will be closed soon....."); 
  fwc.dispose();
  //System.exit(0); 
  }
} // MyWindowAdapter class ends
