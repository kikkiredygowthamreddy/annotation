class a{
    public void showtheclassnameandmethods(){
    System.out.println("in A show");
    }
}
class b extends a{
    @Override
      public void showtheclassnameandmethods(){
      System.out.println("in B show");
}
}
public class laptop{
    public static void main(String[] args) {
        b obj = new b();
        obj.showtheclassnameandmethods();
    }
}
