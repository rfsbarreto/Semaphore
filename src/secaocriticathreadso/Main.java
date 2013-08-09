/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package secaocriticathreadso;

/**
 *
 * @author 200810007230
 */
public class Main {

    public Main(){
    // Primeiro cria o buffer de mensagens
        Buffer bufferBox = new BoundedBuffer();
        // Agora cria os threads produtor e consumidor
        Thread producerThread = new Thread(new Producer(bufferBox));
        Thread consumerThread = new Thread(new Consumer(bufferBox));
        // inicia as threads
        producerThread.start();
        consumerThread.start();
    }

    public static void main(String[] args) {
        Main server = new Main();
    }

}
