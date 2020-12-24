import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;


public class MainFrame extends JFrame{
    private Container cp;
    private JButton ext = new JButton("Exit");
    private JButton sts = new JButton("Start Server");
    private JButton set = new JButton("Set");
    private JButton snd = new JButton("Send");
    private JTextField jtdIP = new JTextField();
    private JTextField jtdPT = new JTextField();
    private JTextField jtd = new JTextField();
    private JTextArea jta = new JTextArea();
    private JLabel jlb = new JLabel("IP:");
    private JPanel jpnN = new JPanel(new GridLayout(1,6,1,1));
    private JPanel jpnC = new JPanel(new GridLayout(1,1,1,1));
    private JPanel jpnS = new JPanel(new GridLayout(1,2,1,1));

    public MainFrame(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setBounds(10,10,400,300);
        jpnC.setSize(400,200);

        cp.add(jpnN,BorderLayout.NORTH);
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnS,BorderLayout.SOUTH);

        jpnN.add(jlb);
        jpnN.add(jtdIP);
        jpnN.add(jtdPT);
        jpnN.add(set);
        jpnN.add(sts);
        jpnN.add(ext);

        jpnC.add(jta);

        jpnS.add(jtd);
        jpnS.add(snd);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        ext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });

        snd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                char data[] = jtd.getText().toCharArray();
                jta.append(new String(data)+"\n");
                jtd.setText("");
            }
        });
    }
}