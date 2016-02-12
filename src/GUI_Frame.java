import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Frame {
	
	 static JLabel myLabel;
	 static JButton hold;
	 static JButton myButton;
	 static JButton textFieldUpdate;
	 
	 
	 public static void main(String[] args) {
	        // Create a window for our app
	        JFrame myFrame = new JFrame("Example 11.1");
	        // Set it to quit the app when we close the window
	        // NOTE that this is the default behavior--we could omit this here
	        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	       // GridBagLayout l = new GridBagLayout();
	        //GridBagConstraints lay = new GridBagConstraints();
	        BorderLayout b = new BorderLayout();
	        GridLayout g = new GridLayout(2,1);
	        GridLayout h = new GridLayout(1,1);
	        JPanel p = new JPanel(g);
	        JPanel j = new JPanel(h);
	        //p.setLayout(g);
	        Dimension d = new Dimension(45,60);
	        
	        
	      //  BoxLayout;
	      //  FlowLayout;
	        
	       myFrame.setLayout(b); 
	        
	        myFrame.setTitle("Game of TwentyOne");
	        
	      //  Rectangle r = new Rectangle(300,200,60,30);
	       
	        myLabel = new JLabel("Your Score");
	        myLabel.setPreferredSize(d);
	        j.setPreferredSize(new Dimension(70, 65));
	        j.add(myLabel);
	        myFrame.add(j, BorderLayout.CENTER);
	        
	        hold = new JButton("Hold");
	        hold.setPreferredSize(d);
	        hold.setFont(new Font("TimesRoman", Font.ITALIC, 12));
	        p.add(hold);
	        myFrame.add(p, b.SOUTH);
	       // myFrame.add(hold, g);
	        
	        myButton = new JButton("Roll Die");
	        d = new Dimension(45,60);
	        myButton.setPreferredSize(d);
	        myButton.setFont(new Font("TimesRoman", Font.ITALIC, 12));
	        p.add(myButton);
	        myFrame.add(p, BorderLayout.SOUTH);
	       
	        j = new JPanel(h);
	        j.setPreferredSize(new Dimension(150,400));
	        myFrame.add(j, BorderLayout.WEST);
	       
	        
	        //dsfsdfsdf
	        //fdhsfkljdsfhklj
	        //fgdgfdklj
	        
	       // ActionListener listener = new MyListener();
	       // myButton.addActionListener(listener);
	        
	        
	     //  myButton.setPreferredSize(new Dimension(40,40));
	      //myButton.setBounds(r);
	       //myFrame.add(myButton);
	       
	       myFrame.pack();
	     myFrame.setSize(400, 500);  
	     myFrame.setVisible(true);
	 }
	 
	 
	 
	 static class MyListener implements ActionListener {

	        Color theColors[] = {Color.BLUE, Color.RED, Color.GREEN, Color.BLACK, Color.WHITE};
	        int index = 0;

	        public void actionPerformed(ActionEvent e) {
	            //JButton eventSource = (JButton) e.getSource();
	            //eventSource.setForeground(theColors[index++]);
	            JButton eventSource = (JButton)e.getSource();
	            if( eventSource.getText().equals("Roll Die") ) {
	               // myLabel.setText( myTextField.getText() );
	            } else {
	                myLabel.setForeground( theColors[++index] );
	                if (index >= theColors.length - 1) {
	                    index = -1;
	                }
	            }
	        }
	    }
}
