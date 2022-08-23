public class Program {
    private String nome;
    private String sobrenome;


    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////
//        EXERCICIO 1
//////////////////////////////////////////////////////////////////////////

//        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "0",};
//        MyThread thread1 = new MyThread(letters);
//        MyThread thread2 = new MyThread(numbers);
//
//        thread1.start();
//        thread2.start();

//////////////////////////////////////////////////////////////////////////
//        EXERCICIO 2
//////////////////////////////////////////////////////////////////////////

//        for(int i=0, t=0; i<=99999; i+=1000, t++){
//            Prime prime = new Prime(i,t);
//            prime.start();
//        }

//////////////////////////////////////////////////////////////////////////
//        EXERCICIO 3
//////////////////////////////////////////////////////////////////////////
// 1 - Navegador web -> faz dowload emquanto pode mexer em outras coisas
// 2 - jogo online -> procesa o jogo e recebe informações do servidor


//////////////////////////////////////////////////////////////////////////
//        EXERCICIO 4
//////////////////////////////////////////////////////////////////////////
// 1 - powershell
// 2 - programas onde o fluxo de dados deve ser unico
//////////////////////////////////////////////////////////////////////////
//        EXERCICIO 5
//////////////////////////////////////////////////////////////////////////
        Chat chat = new Chat();
        Chat chat2 = new Chat();


        chat.start();
        chat2.start();

        synchronized(chat2){
            System.out.println("Thread 1 executando");
            try {
                chat2.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        synchronized(chat){
            System.out.println("Thread 2 executando");
            try {
                chat.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

