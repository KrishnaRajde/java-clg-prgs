import java.awt.*;
 class MyFrameComponents extends Frame{
 	Label l1;
 	Button b1;
 	TextField tf1;
	MyFrameComponents(String title){
		super(title);
		l1=new Label("redlabel");
		tf1=new TextField();
		b1=new Button("button");
		setSize(30000,3000);
		setVisible(true);
		
		this.add(tf1);
		this.add(b1);
		this.add(l1);
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {

		MyFrameComponents f=new MyFrameComponents("my frame");
	}
}