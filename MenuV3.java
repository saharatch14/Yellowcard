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
public class MenuV3 extends JPanel
{
    ArrayList<String> savename = new ArrayList<String>();
    private JPanel menu = new JPanel();
    private ImageIcon iconLogo = new ImageIcon("CG/Logo.png");
    private ImageIcon bgstart = new ImageIcon("CG/start.png");
    private ImageIcon bgcredits = new ImageIcon("CG/Credit.png");
    private ImageIcon bgexit = new ImageIcon("CG/Exit.png");
    private ImageIcon bgstart1 = new ImageIcon("CG/start1.png");
    private ImageIcon bgcredits1 = new ImageIcon("CG/Credit1.png");
    private ImageIcon bgexit1 = new ImageIcon("CG/Exit1.png");
    private JLabel title = new JLabel(iconLogo, JLabel.CENTER);
	private JLabel startText = new JLabel(bgstart,JLabel.CENTER);
    private JLabel credits = new JLabel(bgcredits, JLabel.CENTER);
    private JLabel exit = new JLabel(bgexit, JLabel.CENTER);
	private JLabel startText1 = new JLabel(bgstart1,JLabel.CENTER);
    private JLabel credits1 = new JLabel(bgcredits1, JLabel.CENTER);
    private JLabel exit1 = new JLabel(bgexit1, JLabel.CENTER);
    private Image bg;
    private boolean bgstater = true;
	//credits
	private JPanel credit = new JPanel();
    private JTextArea creditText = new JTextArea(20,60);
    private ImageIcon bgcreditButt = new ImageIcon("CG/Back.png");
    private ImageIcon bgcreditButt1 = new ImageIcon("CG/Back1.png");
    private JLabel creditButt = new JLabel(bgcreditButt);
    private JLabel creditButt1 = new JLabel(bgcreditButt1);


	//Start a game
	private JPanel game = new JPanel();
	private JTextField name1 = new JTextField("Player1",15);
    private JTextField name2 = new JTextField("Player2",15);
    private JTextField name3 = new JTextField("Player3",15);
    private JTextField name4 = new JTextField("Player4",15);
    private JTextField name5 = new JTextField("Player5",15);
	private JTextField name6 = new JTextField("Player6",15);
    private HashMap<String, String> selectChratch = new HashMap<String, String>();
    private JComboBox box1 = new JComboBox();
    private JComboBox box2 = new JComboBox();
    private JComboBox box3 = new JComboBox();
    private JComboBox box4 = new JComboBox();
    private JComboBox box5 = new JComboBox();
    private JComboBox box6 = new JComboBox();
    private JLabel start = new JLabel(bgstart, JLabel.CENTER);
    private JLabel start1 = new JLabel(bgstart1, JLabel.CENTER);
    private JLabel back = new JLabel(bgcreditButt, JLabel.CENTER);
    private JLabel back1 = new JLabel(bgcreditButt1, JLabel.CENTER);
    boolean nextpage = false;

    //interface game
    private Image bg1;
    private JPanel interfacegame = new JPanel();
    private ButtonGroup donate = new ButtonGroup();
    private JButton end = new JButton("End Trun");
    private JLabel bigfish = new JLabel();
    private JLabel smallfish = new JLabel();
    private JPanel yellow = new JPanel();
    private JPanel redbig = new JPanel();
    private JPanel bluesmall = new JPanel();
    private JLabel bigfishnumber = new JLabel();
    private JLabel smallfishnumber = new JLabel();
    private JLabel bigboatnumber = new JLabel();
    private JLabel smallboatnumber = new JLabel();
    private JLabel yellowcardnumber = new JLabel();
    private JLabel want = new JLabel();
    private JLabel assi = new JLabel();
    private JPanel bigboat = new JPanel();
    private JPanel smallboat = new JPanel();
    private JRadioButton yes = new JRadioButton();
    private JRadioButton no = new JRadioButton();
    private int number = 1;
    private int currentPlayer = 0;
    CheckruleandBuy check = new CheckruleandBuy();
    
    //complate all turn
    private JPanel result = new JPanel();
    private Image bg2;
    private boolean look = false;
    public MenuV3()
	{
        setLayout(null);
        try 
        {
            bg = ImageIO.read(new File("CG/BackGroup.png"));
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

        try 
        {
            bg1 = ImageIO.read(new File("CG/in game.png"));
            if (bg1 == null) 
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

        try 
        {
            bg2 = ImageIO.read(new File("CG/result.png"));
            if (bg2 == null) 
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
    //create Menu
    add(title);
    title.setBounds(120, 60, 546, 131);
    add(startText);
    startText.setBounds(90, 270, 275, 62);
    add(credits);
    credits.setBounds(90, 370, 275, 62);
    add(exit);
    exit.setBounds(90,470, 275, 62);
    startText.addMouseListener(ml);
    credits.addMouseListener(ml);
    exit.addMouseListener(ml);
    startText1.addMouseListener(ml);
    credits1.addMouseListener(ml);
    exit1.addMouseListener(ml);

    //create credits
    credit.setOpaque(false);
    creditText.append("This game have been created all by:\nSaharatch Sangsuwan\n");
    creditText.append("Programs used: \n Adobe Photoshop\n \n Visual Studio\n");
    creditText.append("Thanks also to various people supporting the game\n");
    creditText.setEditable(false);
    credit.add(creditText);
    creditButt.addMouseListener(ml);
    creditButt1.addMouseListener(ml);

    //setup game page
    selectChratch.put("Drake","CG/DrakeV2.png");
    selectChratch.put("Fubuki","CG/fubukiV2.png");
    selectChratch.put("Snake","CG/snakeV2.png");
    selectChratch.put("Hibiki","CG/hibikiV2.png");
    start.addMouseListener(ml);
    start1.addMouseListener(ml);
    back.addMouseListener(ml);
    back1.addMouseListener(ml);
    Set<String> keys = selectChratch.keySet();
    Iterator<String> it = keys.iterator();
    while(it.hasNext()) {
        String key = it.next();
        box1.addItem(key);
        box2.addItem(key);
        box3.addItem(key);
        box4.addItem(key);
        box5.addItem(key);
        box6.addItem(key);
    }

    }
    public void paintComponent(Graphics g)
    {
        if(bgstater == true)
        {
            g.drawImage(bg, 0, 0, menu);
        }
        else if(look == true)
        {
            g.drawImage(bg2, 0, 0, result);
        }
        else
        {
            g.drawImage(bg1, 0, 0, interfacegame);
        }
        // Draw the previously loaded image to Component.
    }
    MouseListener ml = new MouseAdapter()
	{
		public void mouseEntered(MouseEvent e)
		{
            if(e.getSource()==credits)
            {
                remove(credits);
                add(credits1);
                credits1.setBounds(90, 370, 275, 62);
                validate();
				repaint();
			}
			else if(e.getSource()==creditButt)
			{
                remove(creditButt);
                add(creditButt1);
                creditButt1.setBounds(290, 400, 280, 66);
                validate();
				repaint();
			}
			else if(e.getSource()==startText)
			{
                remove(startText);
                add(startText1);
                startText1.setBounds(90, 270, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==exit)
			{
                remove(exit);
                add(exit1);
                exit1.setBounds(90,470, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==start)
			{
                remove(start);
                add(start1);
                start1.setBounds(453, 479, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==back)
			{
                remove(back);
                add(back1);
                back1.setBounds(41, 479, 275, 62);
                validate();
				repaint();
			}
		}
		
		public void mouseExited(MouseEvent e)
		{
            if(e.getSource()==credits1)
            {
                remove(credits1);
                add(credits);
                credits.setBounds(90, 370, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==startText1)
			{
                remove(startText1);
                add(startText);
                startText.setBounds(90, 270, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==exit1)
			{
                remove(exit1);
                add(exit);
                exit.setBounds(90,470, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==creditButt1)
			{
                remove(creditButt1);
                add(creditButt);
                creditButt.setBounds(290, 400, 280, 66);
                validate();
				repaint();
            }
            else if(e.getSource()==start1)
			{
                remove(start1);
                add(start);
                start.setBounds(453, 479, 275, 62);
                validate();
				repaint();
            }
            else if(e.getSource()==back1)
			{
                remove(back1);
                add(back);
                back.setBounds(41, 479, 275, 62);
                validate();
				repaint();
			}
            
		}
		public void mouseClicked(MouseEvent e)
		{
            if(e.getSource()==credits1)
            {
                remove(exit);
                remove(startText);
                remove(title);
                remove(credits1);
                add(credit);
                add(creditButt);
                creditButt.setBounds(290, 400, 280, 66);
                setLayout(new GridLayout(2,1,60,10));
				validate();
				repaint();
			}
			else if(e.getSource()==creditButt1)
			{
                add(exit);
                add(startText);
                add(title);
                add(credits);
                remove(credit);
                remove(creditButt1);
                setLayout(null);
				validate();
				repaint();
			}
			else if(e.getSource()==startText1)
			{
                remove(exit);
                remove(startText1);
                remove(title);
                remove(credits);
                addsetupgame();
                validate();
				repaint();
            }
            else if(e.getSource()==exit1)
			{
                System.exit(0);
            }
            else if(e.getSource()==back1)
			{
                removesetupgame();
                remove(back1);
                add(exit);
                add(startText);
                add(title);
                add(credits);
                validate();
				repaint();
            }
            else if(e.getSource()==start1)
			{
                String pNamn1 = name1.getText();
                String pNamn2 = name2.getText();
                String pNamn3 = name3.getText();
                String pNamn4 = name4.getText();
                addName(pNamn1,pNamn2,pNamn3,pNamn4);
                remove(start1);
                removesetupgame();
                bgstater = false;
                validate();
                repaint();
                startTheGame(pNamn1,pNamn2,pNamn3,pNamn4);
                
			}
		}					
    };
    private void addsetupgame() 
    {
        add(name1);
        name1.setBounds(100, 92, 150, 100);
        add(name2);
        name2.setBounds(490, 92, 150, 100);
        add(name3);
        name3.setBounds(100, 210, 150, 100);
        add(name4);
        name4.setBounds(490, 210, 150, 100);
        add(name5);
        name5.setBounds(100, 330, 150, 100);
        add(name6);
        name6.setBounds(490, 330, 150, 100);

        add(box1);
        box1.setBounds(278, 120, 56, 44);

        add(box2);
        box2.setBounds(278, 230, 56, 45);

        add(box3);
        box3.setBounds(658, 120, 56, 44);

        add(box4);
        box4.setBounds(658, 238, 56, 45);

        add(box5);
        box5.setBounds(278, 350, 56, 45);

        add(box6);
        box6.setBounds(658, 360, 56, 45);

        add(start);
        start.setBounds(453, 479, 275, 62);

        add(back);
        back.setBounds(41, 479, 275, 62);
    }
    private void removesetupgame() 
    {
        remove(name1);
        remove(name2);
        remove(name3);
        remove(name4);
        remove(name5);
        remove(name6);

        remove(box1);
        remove(box2);
        remove(box3);
        remove(box4);
        remove(box5);
        remove(box6);

        remove(start);
        remove(back);
    }
    public boolean getnextpage()
    {
        return nextpage;
    }
    public void addName(String p1,String p2,String p3,String p4) 
    {
        savename.add(p1);
        savename.add(p2);
        savename.add(p3);
        savename.add(p4);
    }
    public void getLineItem()
    {
      System.out.println(savename);
    }
    public int indsideItem()
    {
        return savename.size();
    }
    private void addsetupgame1() 
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
        bigfish.setBounds(50, 20, 106, 74);

        smallfish.setIcon(new ImageIcon(getClass().getResource("CG/Untitled2.png"))); // NOI18N
        add(smallfish);
        smallfish.setBounds(40, 120, 116, 60);

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
        bigfishnumber.setBounds(180, 40, 28, 30);

        smallfishnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        smallfishnumber.setText("0");
        add(smallfishnumber);
        smallfishnumber.setBounds(180, 140, 28, 29);

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

        bluesmall.setBackground(new Color(0, 0, 255));
        GroupLayout jPanel4Layout = new GroupLayout(bluesmall);
        bluesmall.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(bluesmall);
        bluesmall.setBounds(70, 200, 40, 40);

        redbig.setBackground(new Color(255, 0, 0));
        GroupLayout jPanel5Layout = new GroupLayout(redbig);
        redbig.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(redbig);
        redbig.setBounds(70, 250, 40, 40);

        smallboatnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        smallboatnumber.setText("0");
        add(smallboatnumber);
        smallboatnumber.setBounds(180, 200, 20, 30);

        bigboatnumber.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        bigboatnumber.setText("0");
        add(bigboatnumber);
        bigboatnumber.setBounds(180, 250, 30, 29);

        assi.setIcon(new ImageIcon(getClass().getResource("CG/fubukiV2.png"))); // NOI18N
        add(assi);
        assi.setBounds(520, 160, 270, 470);
    }
    private void removesetupgame1() 
    {
        remove(end);
        remove(bigfish);
        remove(smallfish);
        remove(yellow);
        remove(bigboat);
        remove(smallboat);

        remove(bigfishnumber);
        remove(smallfishnumber);
        remove(bigboatnumber);
        remove(smallboatnumber);
        remove(want);
        remove(assi);

        remove(yes);
        remove(no);
        remove(redbig);
        remove(bluesmall);
        remove(yellowcardnumber);
    }
    private void jButton1ActionPerformed(ActionEvent evt) {
        try
        {
            if(currentPlayer < check.getPlayer())
            {
                currentPlayer++;
                bigfishnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getBigfish()));
                smallfishnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getSmallfish()));
                bigboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getBigboat()));
                smallboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getSmallboat()));
            }
        }
        catch(IndexOutOfBoundsException ex)
        {
            currentPlayer = 0;
            look = true;
            startReslt();
            validate();
            repaint();
        }
    }                                        

    private void jPanel3MouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
            try
            {
                int smallnumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Small Ship Number"));
                if(check.checkplayer(currentPlayer).getSmallboat() >= smallnumber)
                {
                    smallboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).setSmallboat(smallnumber)));
                }
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
                int bignumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter bignumber Ship Number"));
                if(check.checkplayer(currentPlayer).getBigboat() >= bignumber)
                {
                    bigboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).setBigboat(bignumber)));
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Try Agin","Inane error",JOptionPane.ERROR_MESSAGE);

            }
    }                                    

    private void jRadioButton1ActionPerformed(ActionEvent evt) { 
        check.checkplayer(currentPlayer).toggleDonate();                                            

    }                                             

    private void jRadioButton2ActionPerformed(ActionEvent evt) { 
        check.checkplayer(currentPlayer).toggleDonateoff();                                                   
    }
    public void startTheGame(String na1, String na2,String na3, String na4)
    {
        for(int i = 0; i < savename.size();i++)
        {
            check.addPlayer(savename.get(i),i+1);
        }
        check.insidePlayer();
        addsetupgame1();
        bigfishnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getBigfish()));
        smallfishnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getSmallfish()));
        bigboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getBigboat()));
        smallboatnumber.setText(String.valueOf(check.checkplayer(currentPlayer).getSmallboat()));
    }
    public void startReslt()
    {
        removesetupgame1();
        currentPlayer = 0;
    }        
}
