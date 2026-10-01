import java.awt.*;
import java.awt.event.*;
public class ManualLayout extends Frame {
Label lbl1,lbl2,lbl3,l4;
public ManualLayout ( ) {
setLayout(null);	
setBackground(Color.RED);
lbl1= new Label("Label1:");
lbl2= new Label("Label2:");
lbl3= new Label("Label3:");
l4= new Label("redlabel");
lbl1.setBounds(100,100,40,10);
lbl2.setBounds(200,200,40,10);
lbl3.setBounds(300,300,40,10);
l4.setBounds(200,225,40,10);

add(lbl1);
add(lbl2);
add(lbl3);
add(l4);
setTitle("Null Layout Demo");
setSize(400,450);
setVisible(true);
}
public static void main(String[] args)
{
new ManualLayout();
}
} // End of class

