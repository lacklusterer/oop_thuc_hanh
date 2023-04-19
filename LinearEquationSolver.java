import javax.swing.JOptionPane;

public class LinearEquationSolver {
    public static void main(String[] args) {

        String aString = JOptionPane.showInputDialog(null,
                "ax + b = 0\nEnter the value of a:", "LinearEquationSolver",
                JOptionPane.INFORMATION_MESSAGE);
        String bString = JOptionPane.showInputDialog(null,
                String.format("%sx + b = 0\nEnter the value of b:", aString), "LinearEquationSolver",
                JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);
        double x = -b/a;

        String strNotification = String.format("%sx + %s = 0:\nx=%.2f", aString, bString, x);
        JOptionPane.showMessageDialog(null, strNotification,
                "Root of linear equation:",
                JOptionPane.INFORMATION_MESSAGE);
    }
}