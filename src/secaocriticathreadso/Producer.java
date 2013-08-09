package secaocriticathreadso;


import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Producer implements Runnable {

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        long message;
        while (true) {
            // dorme por um tempo
            SleepUtilities.nap();
            // produz um item e o inclui no buffer
            
            message = new Date().getTime();
            buffer.insert(message);
            System.out.println("Produtor produziu " + message);
        }
    }
}
