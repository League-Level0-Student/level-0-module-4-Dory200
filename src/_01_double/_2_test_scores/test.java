package _01_double._2_test_scores;
import javax.swing.JOptionPane;

public class test {
public static void main(String[] args) {
	String t = JOptionPane.showInputDialog("what did you get on your test");
	double test = Double.parseDouble(t);
	if(test>=60) {
		JOptionPane.showMessageDialog(null, "good score!");
	}
	if(test<60) {
		JOptionPane.showMessageDialog(null, "smol brain");
	}
}
}
