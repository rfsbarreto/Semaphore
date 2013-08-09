/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secaocriticathreadso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class BoundedBuffer implements Buffer {

    private static final int BUFFER_SIZE = 5;
    private static int count; // número de itens no buffer
    private static int in; // aponta para próxima posição livre
    private static int out; // aponta próxima posição cheia
    private static Object[] buffer;
    private Semaphore mutex;
    private Semaphore empty;
    private Semaphore full;

    public BoundedBuffer() { // buffer inicialmente vazio
        count = 0;
        in = 0;
        out = 0;
        buffer = new Object[BUFFER_SIZE];
        mutex = new Semaphore(1);
        empty = new Semaphore(BUFFER_SIZE);
        full = new Semaphore(0);
    }

    public  void insert(Object item) {
            empty.acquire();
            mutex.acquire();
            ++count; // acrescenta um item ao buffer
            buffer[in] = item;
            in = (in + 1) % BUFFER_SIZE;
            mutex.release();
            full.release();
        
    }

    public Object remove() {
            full.acquire();
            mutex.acquire();
            Object item;
            if (count!=0){
                --count; // remove um item do buffer
                item = buffer[out];
                out = (out + 1) % BUFFER_SIZE;
                mutex.release();
                empty.release();
                return item;
            }
            mutex.release();
            empty.release();
            return null;
    }

}
