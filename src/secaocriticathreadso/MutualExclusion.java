/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secaocriticathreadso;

/**
 *
 * @author 200810007230
 */
public interface MutualExclusion {

    public static final int TURN_0 = 0;
    public static final int TURN_1 = 1;

    public abstract void enteringCriticalSection(int turn);
    public abstract void leavingCriticalSection(int turn);
}
