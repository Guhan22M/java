class Letter extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){}
        }
       
    }
}
class Number implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){}
        }
    }
}
public class multi_threading{
    public static void main(String[] args) {
        Letter l = new Letter();
        Runnable n = new Number();
        Thread t1 = new Thread(n);
        l.start();
        t1.start();
    }
}