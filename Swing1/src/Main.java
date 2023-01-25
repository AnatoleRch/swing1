import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main {

	public static void main(String[] args) {
		JFrame myWindow = new JFrame();
		JButton jb = new JButton("Click me");
		JButton jb2 = new JButton("Coucou");
		JButton jb3 = new JButton("C'est un gros bouton");
		JPanel jp = new JPanel();
		jp.add(jb);
		jp.add(jb2);
		jp.add(jb3);
		myWindow.add(jp);
		jb.addActionListener((e) -> {
			System.out.println("coucou");
		});
		myWindow.setSize(200, 200);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);

	}

}
