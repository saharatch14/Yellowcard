import java.util.ArrayList;

public class CheckruleandBuy
{
  public final int realsmallfish = 80;
  public final int allfish = 120;
  public final int allbigboat = 25;
  public final int allsmallboat = 25;
  public final int allyellocard = 2;
  public final int allcardpoint10 = 20;
  public final int getsmallfish = 2;
  public final int getbigfish = 2;
  private int smallfisharea = 16;
  private int smallfishbuy = 0;
  private int bigfisharea = 30;
  private int bigfishbuy = 0;
  private int yellocard = 0;
  public final int maxturn = 6;
  private int turn = 1;
  private ArrayList<Player> userplayer = new ArrayList<Player>();
  public CheckruleandBuy()
  {
    
  }
  public int getPlayer()
  {
    return userplayer.size();
  }
  public void checkfishforyellowcard()
  {
    if(bigfisharea < 10)
    {

    }
  }
  public void heckfishforrise()
  {
    smallfisharea += bigfisharea;
    bigfisharea += smallfisharea;
  }
  public void checksmallboat()
  {
    for(int j=0;j<userplayer.size();j++)
    {
      int phase2 = userplayer.get(j).getSmallboat();
      int smallboatgetfish1 = phase2 * getbigfish;
    }
  }
  public void checkbigboat()
  {
    for(int j=0;j<userplayer.size();j++)
    {
      int phase1 = userplayer.get(j).getBigboat();
      int bigboatgetfish1 = phase1 * getbigfish;
      int bigboatgetfish2 = phase1 * getsmallfish;
    }
  }
  public void buyboat()
  {

  }
  public void addPlayer(String name,int number)
  {
    userplayer.add(new Player(name,number));
  }
  public void insidePlayer()
  {
    for(int j=0;j<userplayer.size();j++)
    {
      System.out.println(userplayer.get(j).getName());
    }
  }
  public Player checkplayer(int i) 
  {
    return userplayer.get(i);
  }

}
