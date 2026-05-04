public class index {

    public static class FirstThread implements Runnable{

        @Override
        public void run(){
            for(int i = 0;i <= 5;i++){
                System.out.println("Number: "+i);

                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Thread: "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FirstThread first = new FirstThread();
        Thread t1 = new Thread(first);
        t1.start();
    }
}