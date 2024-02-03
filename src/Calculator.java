import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];// Impliments an array of numbers to press
    JButton[] functionButtons = new JButton[8];// functions
    JButton addButton, subButton, mulButton, divButton,
            decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 =  0, num2 = 0, num3 = 0;


    Calculator(){

    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}