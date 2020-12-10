package Hotel;
//alif
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *
 * Learning basic GUI
 *
 * @author NAIM
 */
public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame();
        JButton button = new JButton("Login");
        button.addActionListener(this);
//        button.setForeground(Color.red);
//        button.setBackground(Color.PINK);
        
        label = new JLabel("number of clicks: 0");
//        label.setForeground(Color.red);
//        label.setBackground(Color.WHITE);
//        label.setBorder(null);

        panel = new JPanel();
        //nak letak warna background ape
        panel.setBackground(Color.YELLOW);
        //letak line border 
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3, true));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of clicks : " + count);

    }

}

