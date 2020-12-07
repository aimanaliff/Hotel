package Hotel;
// Register page
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author NAIM
 */
public abstract class Register implements ActionListener {
        
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel firstname;
    private static JLabel lastname;
    private static JLabel email;
    private static JLabel password;
    private static JLabel policy;
    private static JLabel accLabel;
    private static JLabel afterClick;
    private static JTextField firstText;
    private static JTextField lastText;
    private static JTextField emailText;
    private static JTextField passwordText;
    private static JButton buttonRegister;
    private static JButton buttonSignIn;
    
    
    public static void main(String[] args) {
        panel = new JPanel();
        frame =new JFrame();
        frame.setSize(400,300); //size for display the register screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.setLayout(null);
        
        //label first name
        firstname =new JLabel("First name: ");
        firstname.setBounds(10,20,80,25);
        panel.add(firstname);
        
        //space for first name
        firstText=new JTextField(20);
        firstText.setBounds(100, 20, 165, 25);
        panel.add(firstText);
        
        //label last name
        lastname=new JLabel("Last name: ");
        lastname.setBounds(10,50,80,25);
        panel.add(lastname);
        
        //space for last name
        lastText=new JTextField(20);
        lastText.setBounds(100, 50, 165, 25);
        panel.add(lastText);
        
        //label email
        email=new JLabel("Email :");
        email.setBounds(10, 80, 80, 25);
        panel.add(email);
        
        //space for email
        emailText=new JTextField(20);
        emailText.setBounds(100, 80, 165, 25);
        panel.add(emailText);
        
        //label password
        password=new JLabel("password :");
        password.setBounds(10, 110, 80, 25);
        panel.add(password);
        
        //space for password
        passwordText=new JPasswordField(20);
        passwordText.setBounds(100, 110, 165, 25);
        panel.add(passwordText);
        
        //label for display acc has been created
        afterClick=new JLabel("");
        afterClick.setBounds(20,230,500,25);
        panel.add(afterClick);
        
        //button create account
        buttonRegister =new JButton("Create Account");
        buttonRegister.setBounds(15, 150, 350, 25);
        buttonRegister.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {//display account has been created link ke dalam database
        
            String password= passwordText.getText();
            afterClick.setText("Registered successfully");
        }
        });
        panel.add(buttonRegister);
        
        //label for policy statements
        policy =new JLabel("By signing in, I agree to Hotel's Terms of Use and Privacy Policy.");
        policy.setBounds(15, 170, 500, 25);
        panel.add(policy);
        
        //label for already have an account
        accLabel =new JLabel("Already have an Account?");
        accLabel.setBounds(20,200,500,25);
        panel.add(accLabel);
        
        //button sign in
        buttonSignIn =new JButton("Sign in");
        buttonSignIn.setBounds(200, 200 , 150, 25);
        buttonSignIn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            Login.main(args);
    }
        });
        panel.add(buttonSignIn);
        
        frame.setVisible(true);
    }
   
}
