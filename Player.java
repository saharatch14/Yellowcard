public class Player
{
  private int smallfish;
  private int bigfish;
  private int smallboat;
  private int bigboat;
  private int cardpoint10;
  private String name;
  private boolean EndYourTurn;
  private boolean donate;
  private int number;
  
  public Player(String name,int number)
  {
    this.name = name;
    this.smallfish = 0;
    this.bigfish = 0;
    this.smallboat = 2;
    this.bigboat = 2;
    this.cardpoint10 = 0;
    this.number = number;
    this.EndYourTurn = false;
    this.donate = false; 
  }
  public String getName()
  {
    return name;
  }
  public int getSmallfish()
  {
    return smallfish;
  }
  public int getBigfish()
  {
    return bigfish;
  }
  public int getBigboat()
  {
    return bigboat;
  }
  public int getSmallboat()
  {
    return smallboat;
  }
  public int getCardpoint()
  {
    return cardpoint10;
  }
  public boolean hasEndYourTurn()
  {
    return EndYourTurn;
  }
  public boolean WantDonate()
  {
    return donate;
  }
  public int getNumber()
  {
    return number;
  }
  public void toggle() 
  {
    EndYourTurn  = true;
    System.out.println(EndYourTurn);
  }
  public void toggleoff() 
  {
    EndYourTurn  = !EndYourTurn;
  }
  public void toggleDonate() 
  {
    donate  = true;
    System.out.println(donate);
  }
  public void toggleDonateoff() 
  {
    donate  = !donate;
    System.out.println(donate);
  }
  public int setBigboat(int use) 
  {
    return bigboat -= use;
  }
  public int setSmallboat(int use) 
  {
    return smallboat -= use;
  }
}