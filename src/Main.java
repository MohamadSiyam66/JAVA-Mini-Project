import com.ictech.code.index;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        index i = new index();
        JFrame frame = new JFrame("index");
        frame.setContentPane(new index().indexPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}