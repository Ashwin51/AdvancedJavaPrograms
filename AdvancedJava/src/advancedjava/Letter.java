/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ash
 */
public class Letter {
    public enum All_Letters{
        A, B, C, D, E, F, G, H, I, J, K, L, M, 
        N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
    }
    private static final List<All_Letters> VALUES = Arrays.asList(All_Letters.values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    
    public All_Letters randomLetter(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
