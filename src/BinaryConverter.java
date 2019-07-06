import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JTextField answer = new JTextField(30);
	JLabel jl = new JLabel();

	public BinaryConverter() {

	}

	public static void main(String[] args) {

		new BinaryConverter().start();

	}

	void start() {

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		jf.add(jp);
		
		jp.add(jb);
		jp.add(jl);
		jp.add(answer);

		jf.setTitle("Convert 8 bits of binary to ASCII");
		jb.setText("Convert");
		jb.addMouseListener(this);
		jp.setVisible(true);
		
		jb.setVisible(true);
		jl.setVisible(true);

		jf.pack();

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}

		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}

		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}

	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		
		System.out.println(convert(answer.getText()));
		
		jl.setText(convert(answer.getText()));
		
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

}