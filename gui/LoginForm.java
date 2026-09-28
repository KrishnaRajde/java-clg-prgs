import java.awt.*;
class LoginForm extends Frame{
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

		add(b2);


		setSize(800,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		LoginForm tf=new LoginForm();
	}
}