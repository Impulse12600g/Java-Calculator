import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    // begin laying out the numbers on the pad
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];// Impliments an array of numbers to press
    JButton[] functionButtons = new JButton[8];// functions
    JButton addButton, subButton, mulButton, divButton,
            decButton, equButton, delButton, clrButton;
    JPanel panel;


    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 =  0, num2 = 0, num3 = 0;
    char operator; //holds a function



    Calculator(){
        //constructor for the body of the calculator
        frame = new JFrame("Calculator"); //initial frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the program
        frame.setSize(420, 550);//fixme
        frame.setLayout(null);
        frame.setLayout(null);//fixme
        // TEST: from this point passed (window populated, close out ends program)

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        //TEST: window and text field populates, can type anything however
        textField.setEditable(false);//only can type via buttons

        //func buttons
        functionButtons[0] =
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        //find better way to do this
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        //for loop for further work w/ buttons and not hardcode
        for(int i =0; i<8; i++ ){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);//change

        }
        //same for numbers
        for(int i =0; i<10; i++ ){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);//change


        }

        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);

        frame.add(delButton);
        frame.add(clrButton);
        //TEST: two buttons are now populating
        //15.59

        frame.add(textField);
        frame.setVisible(true);



    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}