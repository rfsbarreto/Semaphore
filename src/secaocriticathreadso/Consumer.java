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
public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        long message;
        Object item;
        while (true) {
            // dorme por um tempo
//            System.out.println("dormiu");
            SleepUtilities.nap();
  //          System.out.println("acordou");
            // consome um item do buffer
            



            item =buffer.remove() ;
            
            //if ( item != null)
                //message = (Long) item ;
            // {
                System.out.println("Consumidor consumiu " + item);
            //}
        }
    }
}
