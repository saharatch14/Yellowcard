import javax.swing.*;
import java.util.*;
@SuppressWarnings("unchecked")
public class OpenGame
{
    public static void main(String[] args)
    {
        boolean run = true;
        //Setting the menu, players, die, and cards
        //Menu menu = new Menu();
        MenuV3 menu = new MenuV3();
        //StartGame game = new StartGame();

        //ArrayList<Place> plats = new ArrayList<Place>();
        //Player p1;
        JFrame application = new JFrame("Yellow Card");

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(menu);
        application.setSize(800, 630);
        application.setVisible(true);
    }
}