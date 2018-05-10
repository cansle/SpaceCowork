package kr.bar.coder.view;

import javax.swing.JOptionPane;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dat;
		String inputData = JOptionPane.showInputDialog("값 입력");
		dat = Integer.parseInt(inputData);
		
		for(int i = dat-1 ; i >= 0 ; i--){
			
			System.out.println(i);
			
		}

	}

}
