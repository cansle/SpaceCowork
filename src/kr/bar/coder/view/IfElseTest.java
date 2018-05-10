package kr.bar.coder.view;
import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		
		int dat1;
		int dat2;
		int dat3;
		String inputData = JOptionPane.showInputDialog("값입력:");
		dat1 = Integer.parseInt(inputData);
		String inputData2 = JOptionPane.showInputDialog("값입력:");
		dat2 = Integer.parseInt(inputData2);
		String inputData3 = JOptionPane.showInputDialog("값입력:");
		dat3 = Integer.parseInt(inputData3);
		
		
		if(dat1%2 == 0){
			System.out.println(dat1);
		}
		
		if(dat2%2 == 0){
			System.out.println(dat2);
		}
		
		if(dat3%2 == 0){
			System.out.println(dat3);
		}

	}

}
