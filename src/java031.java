import javax.swing.*;
import java.awt.*;

public class java031 {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setTitle("Nihanth Charan Mutluru");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem exit = new JMenuItem("Exit");

        file.add(exit);

        menu.add(file);

        frame.setJMenuBar(menu);
        JButton Button=new JButton("Button1 (PAGE_START)");

        //Pane.add(Button,BorderLayout.PAGE_START);


        frame.setVisible(true);
    }
}
