import javax.swing.JButton;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		JFrame myWindow = new JFrame();
		JButton jb = new JButton("Click me");
		myWindow.add(jb);
		myWindow.setSize(200, 200);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);

	}

}
