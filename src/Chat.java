public class Chat extends Thread {

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("Aguardando...");
            notify();
        }

    }
}
