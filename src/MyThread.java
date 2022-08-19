public class MyThread extends Thread {
    private String[] temp;

    public MyThread(String[] temp){
        this.temp = temp;
    }
    public void run(){
        for(int i =0 ; i < temp.length; i++){
            System.out.print(temp[i]);
        }

    }
}

