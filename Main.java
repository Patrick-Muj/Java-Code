import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Click implements ActionListener {
  // Attribute
  private static JLabel classlabel;
  private static JLabel titlelabel;
  private static JTextField classText;
  private static JLabel sectionLabel;
  private static JTextField sectionText;
  private static JButton button;
  private static JButton button2;
  private static JLabel success;

  public static void main(String[] args) {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(400, 350);
    frame.add(panel);
    

       // adding a title on panel

    titlelabel = new JLabel("Guess Class name"); // create title (in this case is guess class name)
    titlelabel.setBounds(80, 10, 200, 25); // baund of title
    panel.add(titlelabel); // add title on panel

    panel.setLayout(null); 

            // add word (class Name) on panel

    classlabel = new JLabel("Class Name"); // create class name
    classlabel.setBounds(10, 40, 120, 25); // class name bounding set
    panel.add(classlabel); // add class Name (word) on panel
    frame.setVisible(true); // make everything visible on panel
    classText = new JTextField();// create a typing fielf for user to type
    classText.setBounds(100, 40, 165, 25); // set typing bound 
    panel.add(classText); // add field on panel 

    // add word (Section) on panel

    sectionLabel = new JLabel("Section"); // create Section 
    sectionLabel.setBounds(10, 60, 80, 25); // set bound
    panel.add(sectionLabel); // add section on panel
    sectionText = new JTextField(); // create a field for typing answer
    sectionText.setBounds(100, 70, 165, 25); // set bound for section answer
    panel.add(sectionText); // add section typing field on panel

    //create a button

    button = new JButton("Click "); // button called Click
    button.setBounds(100, 100, 80, 25); // set Click bound
    button2 = new JButton("hit"); // buttton called hit
    button2.setBounds(200, 100, 80, 25); // set hit bound
    button.addActionListener(new Click()); // addAction to click button 
   // button2.addActionListener(new hit());
    panel.add(button); // add click button on panel
    panel.add(button2); // add hit button on panel

    success = new JLabel(" "); // add display answer
    success.setBounds(10, 130, 300, 25); // set dispay bound
    panel.add(success); // add display on panel

  }
    public class hit implements ActionListener{
      public void actionPerformed(ActionEvent e) {
        button2.addActionListener(new hit());
    success.setText(" class is CS1181; Section is 01  ");
  }
    }
  @Override
// thing should happen when you click 
  public void actionPerformed(ActionEvent e) {
    String classes = classText.getText();
    String sect = sectionText.getText();

    // if statement 

    if (classes.equals("CS1181") && sect.equals("01")) {
      success.setText("you got right"); // massage to displat when you got right
    }

    else
     if (classes.equals("CS1181") && !sect.equals("01")) {
      success.setText("You got Class right, TRY again ");// massage for getting class name right
    } 
    else
     if (!classes.equals("CS1181") && sect.equals("01")) {
                  success.setText("you got section right, TRY again "); // massage for getting section right
    } 

    else {
      success.setText("sorry try again"); // massage for getting both wrong
    }

  }
}