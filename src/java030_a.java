import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class java030_a extends JFrame {
    public java030_a() {
        createUI();

        setSize(500,400);
        setTitle("Nihanth Charan Mutluru");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createUI() {
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener((ActionEvent event)->{
            System.exit(0);
        });

        file.add(exit);

        menu.add(file);

        setJMenuBar(menu);

        JButton btn = new JButton("Click Me");
        btn.addActionListener((ActionEvent event)->{
            JOptionPane.showMessageDialog(this,"You Just Clicked the Button","Dialog Box",JOptionPane.INFORMATION_MESSAGE);

        });
        btn.setBounds(200,200,100,50);
        this.add(btn);

    }

    public static void main(String args[]){
        EventQueue.invokeLater(()->{
            java030_a j = new java030_a();
            j.setVisible(true);
        });
    }
}