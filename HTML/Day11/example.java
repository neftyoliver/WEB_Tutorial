import javax.swing.*;

public class example {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello?");
		
		frame.add(new JLabel("Hello!"));
		frame.show();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}