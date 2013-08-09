/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secaocriticathreadso;

/**
 *
 * @author aluno
 */
public interface Buffer {
    // produtores chamam este método
    public abstract void insert(Object item);
// consumidores chamam este método
    public abstract Object remove();
}
