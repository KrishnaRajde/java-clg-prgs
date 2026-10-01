import java.awt.*;
import java.awt.event.*;
public class FrameWindowAdapter extends Frame
{
  Button b1;
  TextField tf1;
  FrameWindowAdapter(String title)
  {
   
//Register the Listeners
addWindowListener(new MyWindowAdapter(this)); 
 //set window title using setTitle method
  setLayout(new FlowLayout(FlowLayout.LEFT));
  b1=new Button("CLICK ME");
  tf1=new TextField(15);
  add(tf1);
  add(b1);
  b1.addActionListener(new MyActionAdapter(this));
  setTitle(title);  
  setSize(300,300);      
  setVisible(true);
  }
  public static void main(String args[])
  {
   FrameWindowAdapter window = new FrameWindowAdapter("Frme Close Demo");
  }
} // FrameWindowAdapter class ends
class MyActionAdapter implements ActionListener
{
FrameWindowAdapter f;
MyActionAdapter(FrameWindowAdapter f)
{
this.f = f;
}
public void actionPerformed(ActionEvent ae)
  {
    f.tf1.setText("Click me button pressed!");
  }
}
class MyWindowAdapter extends WindowAdapter
{
FrameWindowAdapter fwc;
MyWindowAdapter(FrameWindowAdapter fwc)
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