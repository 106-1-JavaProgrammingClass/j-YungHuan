import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtn1 = new JButton("big");
    private JButton jbtn2 = new JButton("small");
    private JButton jbtn3 = new JButton("EXIT");
    private JLabel jlab = new JLabel("*-*");
    private  int x =50;
    public  MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
        this.add(jlab);
        this.setLayout(null);
        this.setVisible(true);
        this.jbtn1.setBounds(50,50,50,50);
        this.jbtn2.setBounds(50,100,50,50);
        this.jbtn3.setBounds(50,150,50,50);
        this.jlab.setBounds(100,200,200,100);
        jlab.setFont(new Font(null,Font.PLAIN,x ));
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+10;
                jlab.setFont(new Font(null,Font.PLAIN,x ));
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-10;
                jlab.setFont(new Font(null,Font.PLAIN,x));
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
