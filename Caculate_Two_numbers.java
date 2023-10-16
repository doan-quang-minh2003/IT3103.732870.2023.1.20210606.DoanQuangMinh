package lab01;
import javax.swing.JOptionPane;
public class Caculate_Two_numbers {
	public static void main(String[] args) {
		String StrNum1,StrNum2;
		StrNum1 = JOptionPane.showInputDialog(null,"Please enter first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
	    StrNum2 = JOptionPane.showInputDialog(null,"Please enter second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		
		double num1 = Double.parseDouble(StrNum1);
		double num2 = Double.parseDouble(StrNum2);
		double Sum = num1 + num2;
		double Difference = num1 - num2;
		double Product = num1 * num2;
		double Quotient = num1/num2;
		
		String ketqua = "Sum: " + Sum + "\n" + "Difference: " + Difference + "\n" + "Product: " + Product + "\n" + "Quotient: " + Quotient + "\n";
		JOptionPane.showMessageDialog(null,ketqua," ",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

