/*Chachi Lor

Calculator project from scratch. I present my numbers as Doubles to make it
easier for me. A project for beginners.
*/
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
// I don't know why I make it private, they can be public. It doesn't really matter at the moment.
   private JFrame f; 
   private JTextField result;
   private JLabel lab;
   
   private JButton add;
   private JButton minus;
   private JButton divide;
   private JButton times;
   private JButton equal;
   private JButton square;
   private JButton percent;
   
   private JButton one;
   private JButton two;
   private JButton three;
   private JButton four;
   private JButton five;
   private JButton six;
   private JButton seven;
   private JButton eight;
   private JButton nine;
   private JButton zero;
   private JButton dot;
   private JButton clear;
   private JButton neg;
   
   double x1;
   double y1;
   double total;
   String op;
   String holder;
   String ans;
   
   
   
   public Calculator(){
   
      gui();
   
   }
   
   
   public void gui(){
// Create the frame of our calculator.
      f = new JFrame("Calculator");
      f.setBounds(100, 100, 265, 390);
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setResizable(false);
      f.setLocationRelativeTo(null);
      f.getContentPane().setLayout(null);
// Create the display field for our numbers.      
      result = new JTextField();
      result.setBounds(10, 10, 231, 30);
      result.setText("0");
      f.getContentPane().add(result);
      
      
// Create buttons for your operations, have them be highlighted to let the user
// know what operation they're using, made to be interchangable. Add it to our JFrame.      
      add = new JButton("+");
      
      add.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            add.setBackground(Color.LIGHT_GRAY);
            add.setOpaque(true);
            
            JButton defbtn = new JButton();
            
            minus.setBackground(defbtn.getBackground());
            divide.setBackground(defbtn.getBackground());
            times.setBackground(defbtn.getBackground());
            
            if (result.getText().equals("")){
               x1 = Double.valueOf(holder);
               result.setText("");
               op = "+";
            } else {
               x1 = Double.parseDouble(result.getText());
               holder = result.getText();
               result.setText("");
               op = "+";
            }
         }
      });
      
      add.setBounds(190, 230, 50, 50);
      f.getContentPane().add(add);
      
     
      minus = new JButton("-");
      
      minus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            minus.setBackground(Color.LIGHT_GRAY);
            minus.setOpaque(true);
            
            JButton defbtn = new JButton();
            
            add.setBackground(defbtn.getBackground());
            times.setBackground(defbtn.getBackground());
            divide.setBackground(defbtn.getBackground());
            if (result.getText().equals("")){
               x1 = Double.valueOf(holder);
               result.setText("");
               op = "-";
            } else {
               x1 = Double.parseDouble(result.getText());
               holder = result.getText();
               result.setText("");
               op = "-";
            }

         }
      });
      
      minus.setBounds(190, 170, 50, 50);
      f.getContentPane().add(minus);

       
      divide = new JButton("÷");
      
      divide.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            divide.setBackground(Color.LIGHT_GRAY);
            divide.setOpaque(true);
            
            JButton defbtn = new JButton();
            
            add.setBackground(defbtn.getBackground());
            minus.setBackground(defbtn.getBackground());
            times.setBackground(defbtn.getBackground());
            
            if (result.getText().equals("")){
               x1 = Double.valueOf(holder);
               result.setText("");
               op = "÷";
            } else {
               x1 = Double.parseDouble(result.getText());
               holder = result.getText();
               result.setText("");
               op = "÷";
            }
            
         }
      });
      
      divide.setBounds(190, 50, 50, 50);
      f.getContentPane().add(divide);


      times = new JButton("x");
      
      times.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            times.setBackground(Color.LIGHT_GRAY);
            times.setOpaque(true);
            
            JButton defbtn = new JButton();
            
            add.setBackground(defbtn.getBackground());
            minus.setBackground(defbtn.getBackground());
            divide.setBackground(defbtn.getBackground());
            
            if (result.getText().equals("")){
               x1 = Double.valueOf(holder);
               result.setText("");
               op = "x";
            } else {
               x1 = Double.parseDouble(result.getText());
               holder = result.getText();
               result.setText("");
               op = "x";
            }
         }
      });
      
      times.setBounds(190, 110, 50, 50);
      f.getContentPane().add(times);

// Creating the equal, percent, and squared button. Make sure they do what they're supposed to do.
// Reset anything that needs to be reset. 
      equal = new JButton("=");
      
      equal.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            y1 = Double.parseDouble(result.getText());
            
            if(op == "+") {
               total = x1 + y1;
               ans = String.format("%.2f",total);
               result.setText(ans);
            } else if (op == "-") {
               total = x1 - y1;
               ans = String.format("%.2f",total);
               result.setText(ans);
            } else if (op == "÷") {
               total = x1 / y1;
               ans = String.format("%.2f",total);
               result.setText(ans);
            } else if (op == "x") {
               total = x1 * y1;
               ans = String.format("%.2f",total);
               result.setText(ans);
            } else {
               total = x1;
               ans = String.format("%.2f",total);
               result.setText(ans);
            }
            
            
         }
      });
      
      equal.setBounds(190, 290, 50, 50);
      f.getContentPane().add(equal);
      
      square = new JButton("x²");
      
      square.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            double ops = Double.parseDouble(String.valueOf(result.getText()));
            ops = ops * ops;
            result.setText(String.valueOf(ops));
         }
      });
      
      square.setBounds(70, 50, 50, 50);
      f.getContentPane().add(square);
      
      percent = new JButton("%");
      
      percent.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            double ops = Double.parseDouble(String.valueOf(result.getText()));
            ops = ops / 100;
            result.setText(String.valueOf(ops));
         }
      });
      
      percent.setBounds(130, 50, 50, 50);
      f.getContentPane().add(percent);

// Create buttons for all the numbers, assign variables to the numbers. Attach them to the JFrame
// at specific locations to make it esaier to see.
      one = new JButton("1");
      one.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            if (result.getText().equals("0")){
               String entNum = one.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + one.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
            
         }
      });
      one.setBounds(10, 230, 50, 50);
      f.getContentPane().add(one);
      
      two = new JButton("2");
      
      two.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = two.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + two.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      two.setBounds(70, 230, 50, 50);
      f.getContentPane().add(two);
      
      three = new JButton("3");
      
      three.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = three.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + three.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      three.setBounds(130, 230, 50, 50);
      f.getContentPane().add(three);
      
      four = new JButton("4");
      
      four.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = four.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + four.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      four.setBounds(10, 170, 50, 50);
      f.getContentPane().add(four);
      
      five = new JButton("5");
      
      five.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = five.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + five.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      five.setBounds(70, 170, 50, 50);
      f.getContentPane().add(five);
      
      six = new JButton("6");
      
      six.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = six.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + six.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      six.setBounds(130, 170, 50, 50);
      f.getContentPane().add(six);
      
      seven = new JButton("7");
      
      seven.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = seven.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + seven.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      seven.setBounds(10, 110, 50, 50);
      f.getContentPane().add(seven);
      
      eight = new JButton("8");
      
      eight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = eight.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + eight.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      eight.setBounds(70, 110, 50, 50);
      f.getContentPane().add(eight);
      
      nine = new JButton("9");
      
      nine.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            if (result.getText().equals("0")){
               String entNum = nine.getText();
               result.setText(entNum);
            } else{
               String entNum = result.getText() + nine.getText();
               result.setText(entNum);
            }
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      nine.setBounds(130, 110, 50, 50);
      f.getContentPane().add(nine);
    
      clear = new JButton("C");
      
      clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            result.setText("0");
            
            JButton defbtn = new JButton();
            
            add.setBackground(defbtn.getBackground());
            minus.setBackground(defbtn.getBackground());
            divide.setBackground(defbtn.getBackground());
            times.setBackground(defbtn.getBackground());
            
            op = new String();
            x1 = 0;
            result.setText("0");
         }
      });
      
      clear.setBounds(10, 50, 50, 50);
      f.getContentPane().add(clear);
      
      zero = new JButton("0");
      
      zero.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            String entNum = result.getText() + zero.getText();
            result.setText(entNum);
         }
      });
      
      zero.setBounds(70, 290, 50, 50);
      f.getContentPane().add(zero);

// Create the decimal and plus-minus button, assign their functions to occur when pressed.
// Attach it to JFrame at assigned position.
      dot = new JButton(".");
      
      dot.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            String entNum = result.getText() + dot.getText();
            result.setText(entNum);
         }
      });
      
      dot.setBounds(10, 290, 50, 50);
      f.getContentPane().add(dot);
      
      neg = new JButton("±");
      
      neg.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg) {
            
            double ops = Double.parseDouble(String.valueOf(result.getText()));
            ops = ops * (-1);
            result.setText(String.valueOf(ops));
            x1 = Double.parseDouble(result.getText());
         }
      });
      
      neg.setBounds(130, 290, 50, 50);
      f.getContentPane().add(neg);
// Set the JFrame to be visible with gui working as it should      
      f.setVisible(true);
   }

   public static void main(String[] args){
// construct the calculator.   
      new Calculator();
      
   }
}