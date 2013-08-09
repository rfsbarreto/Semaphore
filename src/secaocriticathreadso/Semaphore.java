/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secaocriticathreadso;

/**
 *
 * @author Paulo
 */
public class Semaphore {
    
    private int valor = 1;
    
    public Semaphore(int valor){
        this.valor = valor;
    }

    public  void acquire()  {
        while (valor <= 0)
            SleepUtilities.nap(); // nenhuma operação
        this.valor--;
    }

    public  void release() {
       // System.out.println("2");
        this.valor++;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
