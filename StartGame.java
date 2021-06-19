import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.net.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.border.*;
@SuppressWarnings("unchecked")
public class StartGame extends JPanel
{
    private Image bg;
    private JPanel interfacegame = new JPanel();
    private ButtonGroup donate = new ButtonGroup();
    private JButton end = new JButton("End Trun");
    private JLabel bigfish = new JLabel();
    private JLabel smallfish = new JLabel();
    private JPanel yellow = new JPanel();
    private JLabel bigfishnumber = new JLabel();
    private JLabel smallfishnumber = new JLabel();
    private JLabel yellowcardnumber = new JLabel();
    private JPanel bigboat = new JPanel();
    private JPanel smallboat = new JPanel();
    private JRadioButton yes = new JRadioButton();
    private JRadioButton no = new JRadioButton();
    private JLabel want = new JLabel();
    private int number = 1;
    public StartGame(String na1, String na2,String na3, String na4)
    {
        setLayout(null);
        try 
        {
            bg = ImageIO.read(new File("CG/in game.png"));
            if (bg == null) 
            {
                System.err.println("Unrecognized image type.");
                System.exit(1);
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error while loading image.");
            System.exit(1);
        }
        addsetupgame();

    }
    public void paintComponent(Graphics g)
    {
            g.drawImage(bg, 0, 0, interfacegame);
        // Draw the previously loaded image to Component.
    }
    private void addsetupgame() 
    {
        donate.add(yes);
        donate.add(no);
        end.setBackground(new Color(255, 255, 255));
        end.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(end);
        end.setBounds(50, 470, 127, 80);

        bigfish.setIcon(new ImageIcon(getClass().getResource("CG/Untitled.png"))); // NOI18N
        add(bigfish);
        bigfish.setBounds(50, 30, 106, 74);

        smallfish.setIcon(new ImageIcon(getClass().getResource("CG/Untitled2.png"))); // NOI18N
        add(smallfish);
        smallfish.setBounds(40, 150, 116, 60);

        yellow.setBackground(new Color(255, 255, 0));
        yellow.setForeground(new Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(yellow);
        yellow.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        add(yellow);
        yellow.setBounds(720, 30, 60, 70);

        bigfishnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        bigfishnumber.setText("0");
        add(bigfishnumber);
        bigfishnumber.setBounds(180, 50, 28, 46);

        smallfishnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        smallfishnumber.setText("0");
        add(smallfishnumber);
        smallfishnumber.setBounds(180, 160, 28, 29);

        yellowcardnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        yellowcardnumber.setHorizontalAlignment(SwingConstants.RIGHT);
        yellowcardnumber.setText("0");
        add(yellowcardnumber);
        yellowcardnumber.setBounds(650, 30, 50, 62);

        bigboat.setBackground(new Color(255, 0, 0));
        bigboat.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(bigboat);
        bigboat.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        add(bigboat);
        bigboat.setBounds(420, 410, 129, 190);

        smallboat.setBackground(new java.awt.Color(0, 0, 255));
        smallboat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(smallboat);
        smallboat.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        add(smallboat);
        smallboat.setBounds(260, 410, 129, 190);

        yes.setBackground(new Color(255, 255, 0));
        yes.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        yes.setText("Yes");
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(yes);
        yes.setBounds(60, 350, 60, 30);

        no.setBackground(new Color(255, 255, 0));
        no.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        no.setText("No");
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(no);
        no.setBounds(120, 350, 60, 30);

        want.setBackground(new Color(255, 255, 0));
        want.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        want.setText("Want To Donate");
        add(want);
        want.setBounds(40, 320, 175, 29);
    }
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        number++;
    }                                        

    private void jPanel3MouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
            try
            {
                int bignumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Try Agin","Inane error",JOptionPane.ERROR_MESSAGE);
            }
    }                                    

    private void jPanel2MouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
            try
            {
                int smallnumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Try Agin","Inane error",JOptionPane.ERROR_MESSAGE);

            }
    }                                    

    private void jRadioButton1ActionPerformed(ActionEvent evt) {                                              

    }                                             

    private void jRadioButton2ActionPerformed(ActionEvent evt) {                                              

    }                                             
}