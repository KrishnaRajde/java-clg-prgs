import java.awt.*;
import java.awt.event.*;
class LoginForm extends Frame implements ActionListener,WindowListener{
	TextField tf1,tf2;
	Label l1,l2;
	Button b1,b2;

	LoginForm()
	{
		setLayout(new GridLayout(3,2));

		l1=new Label("UserName:");
		add(l1);

		l2=new Label("Password:");
		add(l2);

		tf1=new TextField(10);
		add(tf1);

		tf2=new TextField(10);
		tf2.setEchoChar('(');
		add(tf2);

		b1=new Button("Login");
		add(b1);
		b2=new Button("clear");
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		this.addWindowListener(this);


		setSize(800,800);
		setVisible(true);
	}
	public void windowActivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}

	public void actionPerformed(ActionEvent e)
	{
		String uname="krishna";
		String pass="123";

		String username=tf1.getText();
		String password=tf2.getText();

		if(username.equals(uname) && password.equals(pass))
		{
			System.out.println("login done");
		}
		else
		{
			System.out.println("login not done");
		}
	}
	public static void main(String[] args) {
		LoginForm tf=new LoginForm();
	}
}