import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);
        setLocation(700,500);
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout( 1, 2));

        JButton btn1 = new JButton("EXIT");
        ActionListener closeListener = new CloseActionListener();
        btn1.addActionListener(closeListener);
        panel.add(btn1);

        JButton btn2 = new JButton ("VALIDATE");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);

    }
}
