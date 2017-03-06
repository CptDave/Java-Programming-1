
public class Test {
   public static void main(String [] args) {
      
      Chicken chick = new Chicken();
      changeChicken(chick);
      System.out.println(chick.getInt());
   }
   
   private static void changeChicken(Chicken i) {
       i.changeInt(12);
   }
}

class Chicken {
    private int x = 5;
    
    public void changeInt(int i) {
        x = i;
    }
    
    public int getInt() {
        return x;
    }
}