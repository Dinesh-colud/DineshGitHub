import java.util.ArrayList;

public class dinesh {

    public static class A implements Runnable{
        @Override
        public void run(){
            ArrayList<String> str = new ArrayList<>();
            str.add("Do");
            str.add("you");
            str.add("Know");
            str.add("Who");
            str.add("Are");
            str.add("you ?...");
            for(String val : str){
                System.out.println(val);
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("----------------------");
        }
    }

    public static class B implements Runnable{
        @Override
        public void run(){
            System.out.println("wait a moment..");
            try{
               Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class C implements Runnable{
        @Override
        public void run(){
            System.out.println("Loading........");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("----------------------");
        }
    }

    public static class D implements Runnable{
        @Override
        public void run(){
            ArrayList<String> st = new ArrayList<>();
            st.add("Smart Boy");
            st.add("Chaturi");
            st.add("Ho");
            st.add("Tum");
            for(String val : st){
                System.out.println(val);
                try{
                    Thread.sleep(2000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        A thread = new A();
        Thread t1 = new Thread(thread);
        t1.start();
        t1.join();

        Thread.sleep(1000);
        B thread2 = new B();
        Thread t2 = new Thread(thread2);
        t2.start();
        t2.join();

        C thread3 = new C();
        Thread t3 = new Thread(thread3);
        t3.start();
        t3.join();

        D thread4 = new D();
        Thread t4 = new Thread(thread4);
        t4.start();
        t4.join();

    }
}
