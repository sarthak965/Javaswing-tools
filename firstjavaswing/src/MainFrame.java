import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainfont = new Font("segeo print", Font.ITALIC, 18);
    JTextField firstnametf, lastnametf;
    JLabel lbwelcome;
    public void initialize() {

        JLabel lbfirstname= new JLabel("First Name");
        lbfirstname.setFont(mainfont);
        firstnametf= new JTextField();
        firstnametf.setFont(mainfont);

        JLabel lblastname= new JLabel("Last Name");
         lblastname.setFont(mainfont);
         lblastname.setBackground(new Color(128,128,255));
        
          lastnametf= new JTextField();
         lastnametf.setFont(mainfont);

         JPanel formpanel= new JPanel();
         formpanel.setLayout(new GridLayout(4, 1, 5, 5));
          formpanel.add(lbfirstname);
          formpanel.add(firstnametf);
          formpanel.add(lblastname);
          formpanel.add(lastnametf);  

          lbwelcome = new JLabel();
          lbwelcome.setFont(mainfont);

          JButton btok = new JButton("OK");
          btok.setFont(mainfont);
          btok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet.");
               String firstname= firstnametf.getText();
               String lastname= lastnametf.getText();
               lbwelcome.setText("Hello "+ firstname+" "+lastname);
            }
            
          });

          JButton btclear = new JButton("clear");
          btclear.setFont(mainfont);
          btclear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              // TODO Auto-generated method stub
             // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
              firstnametf.setText("");
              lastnametf.setText("");
              lbwelcome.setText("");
            }
          });

          JPanel buttonpanel =  new JPanel();
          buttonpanel.setLayout(new GridLayout(1, 2, 5, 5));
          buttonpanel.add(btok);
          buttonpanel.add(btclear);

        JPanel mainpanel= new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(12,12,25));
        mainpanel.add(formpanel,BorderLayout.NORTH);
        mainpanel.add(lbwelcome,BorderLayout.CENTER);
        mainpanel.add(buttonpanel, BorderLayout.SOUTH);


        add(mainpanel);
        setTitle("welcome");
        setSize(200,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        MainFrame myFrame= new MainFrame();
        myFrame.initialize();
    }
}
