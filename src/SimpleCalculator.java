

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 2; i++) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String n=JOptionPane.showInputDialog("Give me a number");
		String nn=JOptionPane.showInputDialog("Give me another number.");
int num=Integer.parseInt(n);
int num2=Integer.parseInt(nn);		
				// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to add, multiply, divide, or subtract?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

if(operation==0) {
	add(num, num2);
}
if(operation==1) {
	subtract(num, num2);
}
if(operation==2) {
	multiply(num, num2);
}
if(operation==3) {
divide(num, num2);	
}}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	}
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num,int num2){ 
	JOptionPane.showMessageDialog(null, num+" + "+num2+"="+(num+num2));
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtract(int num,int num2){
	JOptionPane.showMessageDialog(null, num+" - "+num2+"="+(num-num2));
	}

static void multiply(int num,int num2){
	JOptionPane.showMessageDialog(null, num+" x "+num2+"="+(num*num2));
}

static void divide(int num,int num2){   
	JOptionPane.showMessageDialog(null, num+" / "+num2+"="+(num/num2));
}


}