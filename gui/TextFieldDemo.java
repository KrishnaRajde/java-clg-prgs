import java.awt.*;
class TextFieldDemo extends Frame{
	TextField tf1,tf2,tf3,tf4,tf5;

	TextFieldDemo()
	{
		setLayout(new FlowLayout());

		tf1=new TextField();
		add(tf1);

		tf2=new TextField(100);
		add(tf2);

		tf3=new TextField("defailt text");
		add(tf3);

		tf4=new TextField(10);
		tf4.setEchoChar('(');
		add(tf4);

		tf5=new TextField(120);
		tf5.setEditable(false);
		add(tf5);

		setSize(100000,30000000);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextFieldDemo tf=new TextFieldDemo();
	}
}