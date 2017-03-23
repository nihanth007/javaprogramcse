import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class java033 {

    public static JFrame frame;
    public static void main(String args[]){
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int[] result = new int[1];
        result[0] = 0;
        final char[] ch = new char[1];
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener((ActionEvent event)->{
            System.exit(0);
        });
        file.add(exit);
        menu.add(file);
        frame.setJMenuBar(menu);

        GridLayout grid = new GridLayout(6,4,5,5);
        JPanel panel = new JPanel();
        panel.setLayout(grid);

        JTextField textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        JButton add = new JButton("+");
        add.addActionListener((ActionEvent event)->{
            int temp = Integer.parseInt(textField.getText());
            result[0] = temp;
            textField.setText("");
            ch[0] = '+';
        });
        panel.add(add);
        JButton mul = new JButton("x");
        mul.addActionListener((ActionEvent event)->{
            int temp = Integer.parseInt(textField.getText());
            result[0] = temp;
            textField.setText("");
            ch[0] = '*';

        });
        panel.add(mul);
        JButton div = new JButton("/");
        div.addActionListener((ActionEvent event)->{
            int temp = Integer.parseInt(textField.getText());
            result[0] = temp;
            textField.setText("");
            ch[0] = '/';

        });
        panel.add(div);
        JButton sub = new JButton("-");
        sub.addActionListener((ActionEvent event)->{
            int temp = Integer.parseInt(textField.getText());
            result[0] = temp;
            textField.setText("");
            ch[0] = '-';

        });
        panel.add(sub);
        JButton eql = new JButton("=");
        panel.add(eql);
        eql.addActionListener((ActionEvent event)->{
            int temp = Integer.parseInt(textField.getText());
            switch(ch[0]){
                case '+':
                    result[0] = result[0] + temp;
                    textField.setText(String.valueOf(result[0]));
                    break;
                case '*':
                    result[0] = result[0] * temp;
                    textField.setText(String.valueOf(result[0]));
                    break;
                case '/':
                    result[0] = result[0] / temp;
                    textField.setText(String.valueOf(result[0]));
                    break;
                case '-':
                    result[0] = result[0] - temp;
                    textField.setText(String.valueOf(result[0]));
                    break;

            }
            result[0] = 0;
            ch[0] = 'n';
        });
        JButton ac = new JButton("AC");
        ac.addActionListener((ActionEvent event)->{
            result[0] = 0;
            textField.setText("");
        });
        panel.add(ac);


        for(int i = 0;  i < 10; i++){
            JButton btn = new JButton();
            btn.setSize(75,50);
            btn.setText(String.valueOf(i));
            int finalI = i;
            btn.addActionListener((ActionEvent)->{
                String temp = textField.getText() + String.valueOf(finalI);
                textField.setText(temp);
            });
            panel.add(btn);
        }

        frame.add(panel);

        frame.setVisible(true);
    }
}