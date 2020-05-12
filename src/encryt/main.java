package encryt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class main {

	private JFrame frmEncrypter;
	private JTextField textField;
	public String given;
	public String converted="";
	private JTextField textField_1;
	private JButton btnNewButton_1;
	public String password="";
	public String member="Dipanshu";
	public boolean flag=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmEncrypter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEncrypter = new JFrame();
		frmEncrypter.setAlwaysOnTop(true);
		frmEncrypter.setResizable(false);
		frmEncrypter.setTitle("Encrypter");
		frmEncrypter.setBounds(100, 100, 420, 322);
		frmEncrypter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEncrypter.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(49, 55, 307, 19);
		frmEncrypter.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Decryption");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(flag==true) {	
				given=textField_1.getText();
				for(int i=0;i<given.length();i++)
				{   int x= given.charAt(i);
				    x-=128;
				    char a =(char)x;
				    converted+=a;
				}
			    textField_1.setText(converted);
			    }
			else {
				 textField_1.setText("We are not fool. you hijo de puta");
			}
			}
				
			
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(33, 199, 148, 40);
		frmEncrypter.getContentPane().add(btnNewButton);
		
		JButton btnEncryption = new JButton("Encryption");
		btnEncryption.setForeground(new Color(0, 0, 0));
		btnEncryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(flag==true) {		
			given = textField_1.getText();
			for(int i=0;i<given.length();i++)
			{   int x= given.charAt(i);
			    x+=128;
			    char a =(char)x;
			    converted+=a;
			}
		    textField_1.setText(converted);
		    }
		else
		{
			 textField_1.setText("We are not fool. you hijo de puta");
		}
			}
		});
		btnEncryption.setBounds(219, 199, 148, 40);
		frmEncrypter.getContentPane().add(btnEncryption);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(49, 125, 307, 40);
		frmEncrypter.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Hii Partner!\n Enter password");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(123, 10, 158, 35);
		frmEncrypter.getContentPane().add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Submit Password");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=textField.getText();
				if( password.compareToIgnoreCase(member) == 0 )
				{ 
					lblNewLabel.setText("Hii "+password.toUpperCase()+"! you can use Encryptor");
					flag= true;
					
				}
				else{	lblNewLabel.setText("How are you? son of Bitch!");	
				}
				
			}
		});
		btnNewButton_1.setBounds(161, 84, 85, 21);
		frmEncrypter.getContentPane().add(btnNewButton_1);
		
		
	}
}
