public class MartianApp
{
   public static void main(String[] args)
   {
      Martian[] unknownInvaders = Martian.invade();
       
      for (Martian unknownInvader : unknownInvaders)
      {
         unknownInvader.doSomething();
      }

      Martian[] invaders = Martian.invade(13);
  
      for (Martian invader : invaders)
      {
         System.out.println(invader);
      }
   }

   public static void test()
   {
      Martian[] martians = new Martian[5];

      for (int i = 0; i < martians.length; i++)
      {
         martians[i] = new Martian();
      }

      for (Martian martian : martians)
      {
         martian.doSomething();
      }
   }
}