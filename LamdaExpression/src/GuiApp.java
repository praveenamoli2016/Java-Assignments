import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiApp implements ActionListener{
	public static void main(String[] args){
		Frame f=new Frame("GuiApp");
		f.setVisible(true);
		f.setSize(400,400);
		Button b=new Button("Click");
		f.setLayout(new FlowLayout());
		f.add(b);
		b.addActionListener(new GuiApp());
		
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello");
		
	}
}