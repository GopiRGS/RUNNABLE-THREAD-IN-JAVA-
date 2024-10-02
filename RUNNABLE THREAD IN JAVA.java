class A implements Runnable{
    public void run(){
        System.out.println("HI HELLO...");
    }
}
public class Main{
    public static void main(String[] args){
        // here A == Runnable
      Runnable a1 = new A();
      Thread t1 = new Thread(a1);
      t1.start();
    }
}
