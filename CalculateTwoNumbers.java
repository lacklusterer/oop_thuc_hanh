import javax.swing.*;

public class CalculateTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Calculation result: \n";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient = num1 / num2;

        String formattedString = String.format("SUM: %.2f\nDIFFERENCE: %.2f\nPRODUCT: %.2f\nQUOTIENT: %.2f", sum, difference, product, quotient);
        strNotification += formattedString;

        JOptionPane.showMessageDialog(null, strNotification,
                "Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}