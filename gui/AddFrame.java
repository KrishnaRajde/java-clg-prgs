import java.awt.*;
import java.awt.event.*;
class AddFrame extends Frame implements ActionListener{
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	Button b1,b2;

	AddFrame()
	{
		setLayout(new GridLayout(4,2));

		l1=new Label("Enter 1st Number:");
		add(l1);

		l2=new Label("Enter 2nd number:");
		add(l2);

		l3=new Label("Result");
		add(l3);

		tf1=new TextField(10);
		add(tf1);

		tf2=new TextField(10);
		add(tf2);

		tf3=new TextField(10);
		tf3.setEditable(false);
		add(tf3);

		b1=new Button("Add");
		add(b1);
		b2=new Button("clear");
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);


		setSize(800,800);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();

		Button btn=(Button)e.getSource();

		if(btn==b1)
		{
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;

			tf3.setText(""+c);
		}
		else
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String[] args) {
		AddFrame tf=new AddFrame();
	}
}